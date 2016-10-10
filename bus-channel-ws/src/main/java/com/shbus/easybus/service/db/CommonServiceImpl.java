/**
 * 
 */
package com.shbus.easybus.service.db;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import com.shbus.easybus.data.model.TExBusOrder;
import com.shbus.easybus.data.model.TSysChannel;
import com.shbus.easybus.data.vo.ExBusOrderReqBasic;
import com.shbus.easybus.data.vo.InterfaceAccountDto;
import com.shbus.easybus.data.vo.OrderSearchReqVO;
import com.shbus.easybus.service.back.SandBusDetailVO;
import com.shbus.easybus.service.back.SandSchedulingService;
import com.shbus.easybus.service.cache.ICacheManager;
import com.shbus.easybus.thrift.front.AuthVO;
import com.shbus.easybus.thrift.front.BusAllInfoVO;
import com.shbus.easybus.thrift.front.CertificateType;
import com.shbus.easybus.thrift.front.ExBusOrder;
import com.shbus.easybus.thrift.front.PsgInfo;
import com.shbus.easybus.thrift.front.SysChinaRegion;
import com.shbus.easybus.utils.StationMappingSysChinaRegion;
import com.shbus.easybus.utils.ValueCollection;
import com.shbus.easybus.utils.ValueCollection.SysCode;
import com.shbus.easybus.utils.ValueCollection.TicketUseStatusSynStatus;

/**
 * @author Administrator
 *
 */
public class CommonServiceImpl implements ICommonService {
	private final Log log = LogFactory.getLog(CommonServiceImpl.class);
	
	private DBManager dbManager;
	private ICacheManager cacheManager;
	private SandSchedulingService sandSchedulingService;
	
	public void setDbManager(DBManager dbManager) {
		this.dbManager = dbManager;
	}
	
	public void setCacheManager(ICacheManager cacheManager) {
		this.cacheManager = cacheManager;
	}

	public void setSandSchedulingService(SandSchedulingService sandSchedulingService) {
		this.sandSchedulingService = sandSchedulingService;
	}

	@Override
	public TSysChannel doAuth(AuthVO authVO) {
		TSysChannel accountChannel = null;

		String key = authVO.getKey();
		String sign = authVO.getSign();
		InterfaceAccountDto acct = dbManager.getInterfaceAccount(key);
		if (acct != null && acct.getSign().equalsIgnoreCase(sign)) { // SUC
			accountChannel = dbManager.getSysChannel(acct.getChannelId());
		}
		return accountChannel;
	}

	@Override
	public List<ExBusOrder> queryExBusOrders(OrderSearchReqVO orderSearchReqVo, String supplierId) {
		List<ExBusOrder> orderList = new ArrayList<ExBusOrder>();
		
		List<TExBusOrder> sandOrders = dbManager.findExBusOrders(orderSearchReqVo, supplierId);
		if (!CollectionUtils.isEmpty(sandOrders)) {
			SimpleDateFormat dataFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			for (TExBusOrder tItem : sandOrders) {
				if (tItem != null) {
					ExBusOrder ord = new ExBusOrder();
					BeanUtils.copyProperties(tItem, ord);
					ord.setExOrderIdIndex(tItem.getExOrderIdIndex().intValue());
					ord.setTicketPrice(((Double) tItem.getTicketPrice()).intValue());
					if (tItem.getCreateDate() != null) {
						ord.setCreateDate(dataFormat.format(tItem.getCreateDate()));
					}
					if (tItem.getModifyDatetime() != null) {
						ord.setModifyDatetime(dataFormat.format(tItem.getModifyDatetime()));
					}
					if (tItem.getPleaveDt() != null) {
						ord.setPleaveDtyyyyMMddHHmmss(dataFormat.format(tItem.getPleaveDt()));
					}
					if (tItem.getTicketConfirmDate() != null) {
						ord.setTicketConfirmDate(dataFormat.format(tItem.getTicketConfirmDate()));
					}
					if (StringUtils.isNotBlank(tItem.getPsgCertificateType())) {
						ord.setPsgCertificateType(CertificateType.valueOf(tItem.getPsgCertificateType()));
					}
					
					if (StringUtils.isEmpty(tItem.getTicketRecRandomCode())) {
						ord.setTicketRecRandomCode("");
					}
					
					orderList.add(ord);
				}
			}
		}
		
		return orderList;
	}

	@Override
	public List<BusAllInfoVO> executeBusQuery(String unitId, String toStationId, String departDateyyyyMMdd) {
		List<BusAllInfoVO>  memResultList = null;
		
		if (StringUtils.isNotBlank(toStationId)) {
			if (StringUtils.isNotBlank(departDateyyyyMMdd)) {
				memResultList = cacheManager.getSandBusesByAllConds(unitId, toStationId, departDateyyyyMMdd);
			} else {
				memResultList = cacheManager.getSandBusesByFromToStation(unitId, toStationId);
			}
		} else {
			if (StringUtils.isNotBlank(departDateyyyyMMdd)) {
				memResultList = cacheManager.getSandBusesByUnitIdAndDepartDay(unitId, departDateyyyyMMdd);
			} else {
				memResultList = cacheManager.getSandBusesByUnitId(unitId);
			}
		}
		
		return memResultList;
	}

	@Override
	public void placeExBusOrder(String supplierId, String sandOrderId, SandBusDetailVO sandBusDetail,
			ExBusOrderReqBasic orderReqBasic, TSysChannel accountChannel) throws Exception {
		Date pleaveDate;
		try {
			pleaveDate = new SimpleDateFormat("yyyyMMddHHmmss").parse(orderReqBasic.getPleaveDtyyyyMMddHHmmss());
		} catch (Exception e) {
			throw new Exception("出发时间格式错误，应为yyyyMMddHHmmss");
		}
		String exOrderId = orderReqBasic.getExOrderId();
		String unitId = orderReqBasic.getUnitId();
		String toStationId = orderReqBasic.getToStationId();
		
		SysChinaRegion depart = dbManager.getSysChinaRegionByDepartStation(unitId);
		String destRegion6Code = StationMappingSysChinaRegion.getRegionCodeByStationId(toStationId);
		SysChinaRegion arrive = cacheManager.getSysChinaRegionByRegion6Code(destRegion6Code);
		if (arrive == null) {
			arrive = dbManager.getSysChinaRegionByCode(destRegion6Code);
		}
		
		Date currDate = new Date();
		double ticketPrice = (double) orderReqBasic.getTicketPrice();
		String isTestOrder = orderReqBasic.getIsTestOrder();
		String busCode = orderReqBasic.getRtOrderId();
		String sandBusNo = "";
		if (sandBusDetail != null) {
			sandBusNo = sandBusDetail.getBusNum();
		}
		int ticketCount = orderReqBasic.getTicketCount();
		List<PsgInfo> psgList = orderReqBasic.getPsgList();
		
		String defaultTicketStatus = ValueCollection.TicketStatus.APP.toString();
		String defaultTicketRecStatus = ValueCollection.TicketRecStatus.NO.toString();
		for (int i = 0; i < ticketCount; i++) {
			TExBusOrder orderItem = new TExBusOrder();
			PsgInfo psgInfo = psgList.get(i);
			
			orderItem.setChannelId(accountChannel.getChannelId());
			orderItem.setChannelName(accountChannel.getChannelName());

			orderItem.setPsgName(psgInfo.psgName);
			orderItem.setPsgCertificateType(psgInfo.getPsgCertificateType().toString());
			orderItem.setPsgCertificateNo(psgInfo.psgCertificateNo);
			orderItem.setPsgMobile(psgInfo.mobile);

			orderItem.setCreateDate(currDate);
			orderItem.setCreateOpId(0l);
			orderItem.setExOrderId(exOrderId);
			orderItem.setExOrderIdIndex((long) (i + 1));
			orderItem.setExOrderTicketCount((long) ticketCount);
			orderItem.setFromProvince6code(depart.getParentProvinceCode6());
			orderItem.setFromProvinceName(depart.getParentProvinceCnname());
			orderItem.setFromStation6code(depart.getRegionCode6());
			orderItem.setFromStationName(depart.getRegionCnname());
			orderItem.setLastOpId(0l);
			orderItem.setModifyDatetime(currDate);

			orderItem.setPleaveDt(pleaveDate);
			orderItem.setpProductId(-1L);
			orderItem.setRtorderCode(sandBusNo);
			orderItem.setRtorderId(busCode);
			orderItem.setSupplierId(supplierId);
			orderItem.setTeamNo("NA");
			orderItem.setTicketApplyDate(currDate);

			orderItem.setTicketPrice(ticketPrice);
			orderItem.setFactAmountRec(ticketPrice);
			orderItem.setTicketPriceDiscount(1.0);// 折扣1 代表全价
			orderItem.setTicketRecStatus(defaultTicketRecStatus);

			orderItem.setTicketRefundStatus(ValueCollection.TicketRefundStatus.NONE.toString());
			orderItem.setTicketStatus(defaultTicketStatus);
			orderItem.setToProvince6code(arrive.getParentProvinceCode6());
			orderItem.setToProvinceName(arrive.getParentProvinceCnname());
			orderItem.setToStation6code(arrive.getRegionCode6());
			orderItem.setToStationId(toStationId);
			orderItem.setToStationName(arrive.getRegionCnname());
			orderItem.setUnitId(unitId);
			orderItem.setValid("Y");
			// 设置结算默认值
			orderItem.setSettlementType(ValueCollection.SettlementType.DIRECT_BUSSTATION.toString());
			orderItem.setSettlementTypeName(ValueCollection.SettlementType.DIRECT_BUSSTATION.getDescription());
			// 设置默认结算价和结算折扣
			orderItem.setSettlementPrice(ticketPrice);
			orderItem.setSettlementRebate(1.0);
			// 设置默认的车票状态同步标示位
			orderItem.setTicketUseStatusSynStatus(TicketUseStatusSynStatus.NONE.toString());
			orderItem.setTicketUseStatusSynStatusN(TicketUseStatusSynStatus.NONE.getDescription());

			orderItem.setIsTestOrder(isTestOrder);
			orderItem.setCarrierName("NA");

			orderItem.setSysCode(SysCode.J.toString());
			orderItem.setSysCodeName(SysCode.J.getDescription());
			orderItem.setVersion(1l);

			// 使用busTicketNo字段存储sand订单号
			orderItem.setOrderPackageId(sandOrderId);
			
			// 保存订单信息至db，sand订单确认成功后，即使db存储失败，也返回处理成功
			try {
				dbManager.InsertExBusOrder(orderItem);
			} catch (Exception ex) {
				log.fatal("SQL exception occurs, exOrderId=" + exOrderId + ", sandOrderId=" + sandOrderId, ex);
			}
		}
		
		if (!"Y".equalsIgnoreCase(isTestOrder)) {
			// 订单加入轮询队列，以完成sand出票状态同步，取票状态同步另行处理
			sandSchedulingService.enqueueOrder(sandOrderId);
		}
	}

}
