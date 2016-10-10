/**
 * 
 */
package com.shbus.easybus.service.sand;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;

import com.shbus.easybus.IJyBusTicketService;
import com.shbus.easybus.TicketBean;
import com.shbus.easybus.data.vo.ExBusOrderReqBasic;
import com.shbus.easybus.service.back.SandBusDetailVO;
import com.shbus.easybus.service.cache.ICacheManager;
import com.shbus.easybus.thrift.front.PsgInfo;
import com.shbus.easybus.utils.BusContants;

/**
 * @author Administrator
 *
 */
public class SandOrderServiceImpl implements ISandOrderService {
	private final Log log = LogFactory.getLog(SandOrderServiceImpl.class);

	private IJyBusTicketService sandTicketService;
	private String sandOrderUserId;
	private ICacheManager cacheManager;

	public void setSandTicketService(IJyBusTicketService sandTicketService) {
		this.sandTicketService = sandTicketService;
	}

	public void setSandOrderUserId(String sandOrderUserId) {
		this.sandOrderUserId = sandOrderUserId;
	}
	
	public void setCacheManager(ICacheManager cacheManager) {
		this.cacheManager = cacheManager;
	}

	private SandBusDetailVO querySandBusDetail(String sandFlightId, String leaveTimeyyyyMMdd) {
		SandBusDetailVO sandBusDetailVO = cacheManager.getSandBusDetailByFlightId(leaveTimeyyyyMMdd, sandFlightId);
		if (sandBusDetailVO == null) {
			TicketBean vBusDetail = null;
			try {
				vBusDetail = sandTicketService.queryVBusDetail(sandFlightId);
			} catch (Exception e) {
				log.error("querySandBusDetail(), 查询指定班次信息出错！, sandFlightId=" + sandFlightId);
			}
			if (vBusDetail != null) {
				sandBusDetailVO = new SandBusDetailVO();
				BeanUtils.copyProperties(vBusDetail, sandBusDetailVO);
				cacheManager.cacheStoreSandBusDetail(leaveTimeyyyyMMdd, sandBusDetailVO);
			}
		}
		
		return sandBusDetailVO;
	}
	
	@Override
	public Object[] submitTicketOrder(ExBusOrderReqBasic orderReqBasic) throws Exception {
		boolean testOrderFlag = "Y".equalsIgnoreCase(orderReqBasic.getIsTestOrder()); 
		
		Object[] resultArray = new Object[2];
		
		String busCode = orderReqBasic.getRtOrderId();
		List<PsgInfo> psgList = orderReqBasic.getPsgList();
		PsgInfo psgInfo = psgList.get(0);
		
		String sandOrderId = null;
		String orderConfirmResp = null;
		if (testOrderFlag) {
			sandOrderId = "test" + System.currentTimeMillis(); // FOR TEST ONLY
			orderConfirmResp = BusContants.SANDWS_ORDER_CONFIRM_PAY_OK; // FOR TEST ONLY
		} else {
			// 提交订单 
			try {
				sandOrderId = sandTicketService.submitThirdPartyInsOrder(
						this.sandOrderUserId, 		// 购票用户名
						orderReqBasic.getTicketCount() + "", 			// 车票数量
						psgInfo.psgName, 			// 购买人姓名
						psgInfo.psgCertificateNo, 	// 购买人身份证号
						psgInfo.mobile, 			// 购买人手机号
						busCode,					// 车次ID
						"", 						// 被投保人姓名数组
						"", 						// 被投保人证件类型
						""							// 被投保人证件号码
				);
			} catch (Exception e) {
				log.fatal("sandTicketService.submitThirdPartyInsOrder error", e);
			} finally {
				// "01"-预付款不足，空串-失败
				if (StringUtils.isBlank(sandOrderId) || BusContants.SANDWS_SUBMITORDER_PREPAY_ERROR.equals(sandOrderId)
						|| BusContants.SANDWS_UNDER_MAINTAINANCE_ERROR.equals(sandOrderId)) {
					if (BusContants.SANDWS_UNDER_MAINTAINANCE_ERROR.equals(sandOrderId)) {
						log.info("******************sandws is shut down for maintainance");
					}
					throw new Exception("订单提交失败，请重试！");
				}
				
			}
			
			// 确认订单
			try {
				orderConfirmResp = sandTicketService.confirmPayedOrder(sandOrderId);
			} catch (Exception e) {
				log.fatal("sandTicketService.confirmPayedOrder fail for sandOrderId=" + sandOrderId, e);
				try {
					sandTicketService.cancelOrder(sandOrderId);
				} catch (Exception ex) {
					log.fatal("sandTicketService.cancelOrder error, sandOrderId=" + sandOrderId, ex);
				}
			} finally {
				if (!BusContants.SANDWS_ORDER_CONFIRM_PAY_OK.equals(orderConfirmResp)) {
					throw new Exception("订单确认失败，请重试！");
				}
			}
		}
		
		SandBusDetailVO sandBusDetail = null;
		// 获取班次信息
		if (BusContants.SANDWS_ORDER_CONFIRM_PAY_OK.equals(orderConfirmResp)) {
			try {
				String leaveTimeyyyyMMdd = orderReqBasic.getPleaveDtyyyyMMddHHmmss().substring(0, 8);
				sandBusDetail = querySandBusDetail(busCode, leaveTimeyyyyMMdd);
			} catch (Exception e) {
				log.error("订单已成功，但查询指定班次信息出错！, sandOrderId=" + sandOrderId + ", busCode=" + busCode);
			}
		}
		if (sandBusDetail == null) {
			sandBusDetail = new SandBusDetailVO();
			sandBusDetail.setBusNum(busCode);
		}
		
		resultArray[0] = sandOrderId;
		resultArray[1] = sandBusDetail;
		
		return resultArray;
	}
	
	
}
