/**
 * 
 */
package com.shbus.easybus.service;

import java.util.HashSet;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.thrift.TException;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import com.shbus.easybus.data.model.TSysChannel;
import com.shbus.easybus.data.vo.ExBusOrderReqBasic;
import com.shbus.easybus.data.vo.OrderSearchReqVO;
import com.shbus.easybus.service.back.SandBusDetailVO;
import com.shbus.easybus.service.db.ICommonService;
import com.shbus.easybus.service.sand.ISandOrderService;
import com.shbus.easybus.thrift.front.BusAllInfoVO;
import com.shbus.easybus.thrift.front.BusError;
import com.shbus.easybus.thrift.front.ChangeTicketRecStatusToYesReq;
import com.shbus.easybus.thrift.front.ChangeTicketRecStatusToYesResp;
import com.shbus.easybus.thrift.front.ChannelService.Iface;
import com.shbus.easybus.thrift.front.ExBusOrder;
import com.shbus.easybus.thrift.front.OrderBookReq;
import com.shbus.easybus.thrift.front.OrderBookResp;
import com.shbus.easybus.thrift.front.OrderSearchReq;
import com.shbus.easybus.thrift.front.OrderSearchResp;
import com.shbus.easybus.thrift.front.QueryBusReq;
import com.shbus.easybus.thrift.front.QueryBusResp;
import com.shbus.easybus.utils.BusContants;
import com.shbus.easybus.utils.SandStationIdMapping;

import junit.framework.Assert;

/**
 * @author Administrator
 *
 */
public class ChannelServiceV2ThriftImpl implements Iface {
	private Log log  = LogFactory.getLog(ChannelServiceV2ThriftImpl.class);
	
	private String supplierId;
	private ICommonService commonService;
	private ISandOrderService sandOrderService;
	
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public void setCommonService(ICommonService commonService) {
		this.commonService = commonService;
	}

	public void setSandOrderService(ISandOrderService sandOrderService) {
		this.sandOrderService = sandOrderService;
	}

	@Override
	public OrderSearchResp orderSearch(OrderSearchReq req) throws TException {
		TSysChannel accountChannel = commonService.doAuth(req.getAuthVO());
		Assert.assertNotNull(BusContants.BUS_ERROR_MSG_AUTH_FAIL, accountChannel);
		
		OrderSearchReqVO sandReqVo = new OrderSearchReqVO(accountChannel.getChannelId().intValue(),
				accountChannel.getChannelName());
		BeanUtils.copyProperties(req, sandReqVo);
		
		// 查询sand订单（supplierId=SAND15）
		List<ExBusOrder> sandOrderResult = commonService.queryExBusOrders(sandReqVo, supplierId);
		OrderSearchResp orderSearchResp = new OrderSearchResp();
		orderSearchResp.setResult(sandOrderResult);
		orderSearchResp.setBusError(new BusError(BusContants.BUS_ERROR_SUCCESS_CODE, null));
		
		return orderSearchResp;
	}

	@Override
	public OrderBookResp orderBook(OrderBookReq req) throws TException {
		TSysChannel accountChannel = commonService.doAuth(req.getAuthVO());
		Assert.assertNotNull(BusContants.BUS_ERROR_MSG_AUTH_FAIL, accountChannel);
		Assert.assertTrue("出发站点(unitId)目前不支持！",
				StringUtils.isNotBlank(SandStationIdMapping.getSandStationId(req.getUnitId())));
		Assert.assertTrue("订单无效，缺少订票人信息！", ! CollectionUtils.isEmpty(req.getPsgList()));

		ExBusOrderReqBasic orderReqBasic = new ExBusOrderReqBasic();
		BeanUtils.copyProperties(req, orderReqBasic);
		
		Object[] sandOrderResult = null;
		try {
			sandOrderResult = sandOrderService.submitTicketOrder(orderReqBasic);
		} catch (Exception e1) {
			throw new TException(e1);
		}
		
		OrderBookResp orderBookResp = new OrderBookResp();
		String exOrderId = req.getExOrderId();
		orderBookResp.setExOrderId(exOrderId);
		if (sandOrderResult != null && sandOrderResult.length == 2) {
			String sandOrderId = (String) sandOrderResult[0];
			SandBusDetailVO sandBusDetail = sandOrderResult[1] != null ? (SandBusDetailVO) sandOrderResult[1] : null;
			try {
				commonService.placeExBusOrder(supplierId, sandOrderId, sandBusDetail, orderReqBasic, accountChannel);
			} catch (Exception e) {	// should be tracked for fix, because order has been submitted to sand success
				log.fatal("commonService.placeExBusOrder error, sandOrderId=" + sandOrderId + ", exOrderId="
						+ orderReqBasic.getExOrderId(), e);
			}
			orderBookResp.setBusError(new BusError(BusContants.BUS_ERROR_SUCCESS_CODE, null));
		} else {
			orderBookResp.setBusError(new BusError(BusContants.BUS_ERROR_FAIL_CODE, "订单处理失败，请重试！"));
		}
		
		return orderBookResp;
	}
	
	@Override
	public QueryBusResp busSearch(QueryBusReq req) throws TException {
		TSysChannel accountChannel = commonService.doAuth(req.getAuthVO());
		Assert.assertNotNull(BusContants.BUS_ERROR_MSG_AUTH_FAIL, accountChannel);
		String unitId = req.getUnitId();
		Assert.assertNotNull("出发站(unitId)不能为空", unitId);
		unitId = unitId.trim();
		
		List<BusAllInfoVO> resultList = commonService.executeBusQuery(unitId, req.getToStationId(),
				req.getDepartDateyyyyMMdd());
		
		QueryBusResp queryBusResp = new QueryBusResp();
		queryBusResp.setBusAllInfoVOList(new HashSet<BusAllInfoVO>());
		if (! CollectionUtils.isEmpty(resultList)) {
			queryBusResp.getBusAllInfoVOList().addAll(resultList);
		}
		queryBusResp.setBusError(new BusError(BusContants.BUS_ERROR_SUCCESS_CODE, null));
		
		return queryBusResp;
	}

	@Override
	public ChangeTicketRecStatusToYesResp changeTicketRecStatusToYes(ChangeTicketRecStatusToYesReq req)
			throws TException {
		TSysChannel accountChannel = commonService.doAuth(req.getAuthVO());
		Assert.assertNotNull(BusContants.BUS_ERROR_MSG_AUTH_FAIL, accountChannel);
		
		throw new TException("API Depreacted!");
	}

}
