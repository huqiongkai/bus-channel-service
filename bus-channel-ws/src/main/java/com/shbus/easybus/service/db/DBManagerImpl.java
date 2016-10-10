/**
 * 
 */
package com.shbus.easybus.service.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;

import com.shbus.easybus.data.dao.TExBusOrderMapper;
import com.shbus.easybus.data.dao.TInterfaceAccountMapper;
import com.shbus.easybus.data.dao.TSysChannelMapper;
import com.shbus.easybus.data.dao.TSysChinaRegionMapper;
import com.shbus.easybus.data.model.TExBusOrder;
import com.shbus.easybus.data.model.TExBusOrderExample;
import com.shbus.easybus.data.model.TInterfaceAccount;
import com.shbus.easybus.data.model.TInterfaceAccountExample;
import com.shbus.easybus.data.model.TSysChannel;
import com.shbus.easybus.data.model.TSysChinaRegion;
import com.shbus.easybus.data.model.TSysChinaRegionExample;
import com.shbus.easybus.data.vo.InterfaceAccountDto;
import com.shbus.easybus.data.vo.OrderSearchReqVO;
import com.shbus.easybus.thrift.front.SysChinaRegion;
import com.shbus.easybus.thrift.front.UnitIdConstants;
import com.shbus.easybus.utils.StationMappingSysChinaRegion;

/**
 * @author Administrator
 *
 */
public class DBManagerImpl implements DBManager {
	private Log log = LogFactory.getLog(DBManager.class);
	private TInterfaceAccountMapper interfaceAccountDao;
	private TSysChannelMapper sysChannelDao;
	private TSysChinaRegionMapper sysChinaRegionDao;
	private TExBusOrderMapper exBusOrderDao;

	private List<InterfaceAccountDto> interfaceAccountCache = new ArrayList<InterfaceAccountDto>();
	private List<TSysChannel> tSysChannelCache = new ArrayList<TSysChannel>();
	private Map<String, SysChinaRegion> departRegionCache = new HashMap<String, SysChinaRegion>();

	public void setInterfaceAccountDao(TInterfaceAccountMapper interfaceAccountDao) {
		this.interfaceAccountDao = interfaceAccountDao;

		buildInterfaceAccountCache();
	}

	private void buildInterfaceAccountCache() {
		if (interfaceAccountCache.size() <= 0) {
			log.info("build data cache for TInterfaceAccount");
			TInterfaceAccountExample example = new TInterfaceAccountExample();
			example.createCriteria().andValidEqualTo("Y");
			List<TInterfaceAccount> dbAccounts = interfaceAccountDao.selectByExample(example);
			for (TInterfaceAccount acc : dbAccounts) {
				InterfaceAccountDto vo = new InterfaceAccountDto();
				BeanUtils.copyProperties(acc, vo);
				vo.setSign(DigestUtils.md5Hex(vo.getUserId() + vo.getPwd()));
				interfaceAccountCache.add(vo);
			}
		}
	}

	public void setSysChannelDao(TSysChannelMapper sysChannelDao) {
		this.sysChannelDao = sysChannelDao;
		buildSysChannelCache();
	}

	private void buildSysChannelCache() {
		if (tSysChannelCache.size() <= 0) {
			log.info("build data cache for TSysChannelCache");
			tSysChannelCache.addAll(sysChannelDao.selectByExample(null));
		}
	}

	public void setSysChinaRegionDao(TSysChinaRegionMapper sysChinaRegionDao) {
		this.sysChinaRegionDao = sysChinaRegionDao;
		
		if (departRegionCache.isEmpty()) {
			TSysChinaRegionExample example = new TSysChinaRegionExample();
			List<String> departRegionCodeList = new ArrayList<String>();
			departRegionCodeList.add(StationMappingSysChinaRegion.getRegionCodeByStationId(UnitIdConstants.UNIT_ID_PDCTDZ));
			departRegionCodeList.add(StationMappingSysChinaRegion.getRegionCodeByStationId(UnitIdConstants.UNIT_ID_HQCTXZ));
			departRegionCodeList.add(StationMappingSysChinaRegion.getRegionCodeByStationId(UnitIdConstants.UNIT_ID_HTLKYZ));
			departRegionCodeList.add(StationMappingSysChinaRegion.getRegionCodeByStationId(UnitIdConstants.UNIT_ID_CTBZ));
			departRegionCodeList.add(StationMappingSysChinaRegion.getRegionCodeByStationId(UnitIdConstants.UNIT_ID_CSKYZ));
			departRegionCodeList.add(StationMappingSysChinaRegion.getRegionCodeByStationId(UnitIdConstants.UNIT_ID_GQKYZ));
			departRegionCodeList.add(StationMappingSysChinaRegion.getRegionCodeByStationId(UnitIdConstants.UNIT_ID_NHKYZ));
			departRegionCodeList.add(StationMappingSysChinaRegion.getRegionCodeByStationId(UnitIdConstants.UNIT_ID_WSKYZ));
			example.createCriteria().andRegionCode6In(departRegionCodeList);
			List<TSysChinaRegion> l = sysChinaRegionDao.selectByExample(example);
			if (l != null) {
				for (TSysChinaRegion item : l) {
					SysChinaRegion region = new SysChinaRegion();
					BeanUtils.copyProperties(item, region);
					departRegionCache.put(item.getRegionCode6(), region);
				}
			}
		}
	}

	public void setExBusOrderDao(TExBusOrderMapper exBusOrderDao) {
		this.exBusOrderDao = exBusOrderDao;
	}

	@Override
	public InterfaceAccountDto getInterfaceAccount(String userId) {
		if (interfaceAccountCache.size() > 0) {
			for (InterfaceAccountDto acc : interfaceAccountCache) {
				if (acc.getUserId().equals(userId)) {
					return acc;
				}
			}
		}
		InterfaceAccountDto accVO = null;
		TInterfaceAccountExample example = new TInterfaceAccountExample();
		example.createCriteria().andUserIdEqualTo(userId).andValidEqualTo("Y");
		List<TInterfaceAccount> resultList = interfaceAccountDao.selectByExample(example);
		if (resultList != null && resultList.size() > 0) {
			BeanUtils.copyProperties(resultList.get(0), accVO);
			accVO.setSign(DigestUtils.md5Hex(accVO.getUserId() + accVO.getPwd()));
		}
		return accVO;
	}

	@Override
	public TSysChannel getSysChannel(long channelId) {
		if (tSysChannelCache.size() > 0) {
			for (TSysChannel chn : tSysChannelCache) {
				if (chn.getChannelId() == channelId) {
					return chn;
				}
			}
		}
		return sysChannelDao.selectByPrimaryKey(channelId);
	}

	@Override
	public TSysChinaRegion getTSysChinaRegionByCode(String regionCode6) {
		return sysChinaRegionDao.selectByPrimaryKey(regionCode6);
	}
	
	@Override
	public SysChinaRegion getSysChinaRegionByCode(String regionCode6) {
		SysChinaRegion region = null;
		TSysChinaRegion tRegion = getTSysChinaRegionByCode(regionCode6);
		if (tRegion != null) {
			region = new SysChinaRegion();
			BeanUtils.copyProperties(tRegion, region);
		}
		return region;
	}

	@Override
	public long InsertExBusOrder(TExBusOrder exBusOrder) {
		return exBusOrderDao.insert(exBusOrder);
	}

	@Override
	public List<TExBusOrder> findExBusOrders(OrderSearchReqVO orderSearchReqVo, String supplierId) {
		TExBusOrderExample example = new TExBusOrderExample();
		com.shbus.easybus.data.model.TExBusOrderExample.Criteria criteria = example.createCriteria();
		criteria.andSupplierIdEqualTo(supplierId).andIsTestOrderEqualTo(orderSearchReqVo.isTestOrder);
		if (StringUtils.isNotBlank(orderSearchReqVo.exOrderId)) {
			criteria.andExOrderIdEqualTo(orderSearchReqVo.exOrderId);
		}
		if (StringUtils.isNotBlank(orderSearchReqVo.ticketRecStatus)) {
			criteria.andTicketRecStatusEqualTo(orderSearchReqVo.ticketRecStatus);
		}
		if (StringUtils.isNotBlank(orderSearchReqVo.ticketStatus)) {
			criteria.andTicketStatusEqualTo(orderSearchReqVo.ticketStatus);
		}
		if (StringUtils.isNotBlank(orderSearchReqVo.psgName)) {
			criteria.andPsgNameEqualTo(orderSearchReqVo.psgName.trim());
		}
		if (orderSearchReqVo.psgCertificateType != null) {
			criteria.andPsgCertificateTypeEqualTo(orderSearchReqVo.psgCertificateType.toString());
		}
		if (StringUtils.isNotBlank(orderSearchReqVo.psgCertificateNo)) {
			criteria.andPsgCertificateNoEqualTo(orderSearchReqVo.psgCertificateNo.trim());
		}
		if (StringUtils.isNotBlank(orderSearchReqVo.psgMobile)) {
			criteria.andPsgNameEqualTo(orderSearchReqVo.psgMobile.trim());
		}
		if (StringUtils.isNotBlank(orderSearchReqVo.getChannelName())) {
			criteria.andChannelNameEqualTo(orderSearchReqVo.getChannelName());
		}
		return exBusOrderDao.selectByExample(example);
	}

	@Override
	public int updateOrderTicketRecStatus(String sandOrderId, String exOrderId, String ticketRecStatus) {
		if (StringUtils.isBlank(ticketRecStatus)) {
			return -1;
		}

		Date currDate = new Date();
		TExBusOrder record = new TExBusOrder();
		record.setTicketRecStatus(ticketRecStatus);
		record.setTicketRecDate(currDate);
		record.setModifyDatetime(currDate);
		TExBusOrderExample example = new TExBusOrderExample();
		example.createCriteria().andExOrderIdEqualTo(exOrderId).andBusTicketNoEqualTo(sandOrderId);
		return exBusOrderDao.updateByExampleSelective(record, example);
	}

	private List<TExBusOrder> findOrdersByStatus(String supplierId, String ticketStatus, String ticketRecStatus) {
		TExBusOrderExample example = new TExBusOrderExample();
		com.shbus.easybus.data.model.TExBusOrderExample.Criteria criteria = example.createCriteria();
		criteria.andSupplierIdEqualTo(supplierId);
		if (StringUtils.isNotBlank(ticketStatus)) {
			criteria.andTicketStatusEqualTo(ticketStatus);
		}
		if (StringUtils.isNotBlank(ticketRecStatus)) {
			criteria.andTicketRecStatusEqualTo(ticketRecStatus);
		}
		return exBusOrderDao.selectByExample(example);
	}
	
	@Override
	public List<String> findTicketAppSandOrders(String supplierId, String ticketStatus) {
		return exBusOrderDao.selectSandAppOrderList(supplierId, ticketStatus);
	}

	@Override
	public List<String> findTicketSuccSandOrders(String supplierId, String ticketStatus, String ticketRecStatus,
			String ticketRefundStatus) {
		return exBusOrderDao.selectSandSuccOrderList(supplierId, ticketStatus, ticketRecStatus, ticketRefundStatus);
	}

	@Override
	public int updateOrderTicketStatus(String supplierId, String sandOrderId, TExBusOrder tOrder) {
		TExBusOrderExample example = new TExBusOrderExample();
		com.shbus.easybus.data.model.TExBusOrderExample.Criteria crit = example.createCriteria();
		crit.andSupplierIdEqualTo(supplierId);
		if (sandOrderId != null) {
			crit.andOrderPackageIdEqualTo(sandOrderId);
		}
		return exBusOrderDao.updateByExampleSelective(tOrder, example);
	}

	@Override
	public SysChinaRegion getSysChinaRegionByDepartStation(String stationId) {
		SysChinaRegion region = departRegionCache.get(stationId);
		if (region == null) {
			region = this.getSysChinaRegionByCode(StationMappingSysChinaRegion.getRegionCodeByStationId(stationId));
		}
		return region;
	}

	@Override
	public List<SysChinaRegion> findSysChinaRegionByRegion6Code(List<String> region6CodeList) {
		List<SysChinaRegion> resultList = new ArrayList<SysChinaRegion>(); 
		TSysChinaRegionExample example = new TSysChinaRegionExample();
		example.createCriteria().andRegionCode6In(region6CodeList);
		List<TSysChinaRegion> l = sysChinaRegionDao.selectByExample(example);
		if (l != null) {
			for (TSysChinaRegion item : l) {
				SysChinaRegion region = new SysChinaRegion();
				BeanUtils.copyProperties(item, region);
				resultList.add(region);
			}
		}
		return resultList;
	}
	
}
