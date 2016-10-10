/**
 * 
 */
package com.shbus.easybus.backoffice.service;

import java.util.List;

import com.shbus.easybus.backoffice.web.OrderQueryParamVO;
import com.shbus.easybus.backoffice.web.OrderQueryResultVO;

/**
 * @author Administrator
 *
 */
public interface ICommonOrderService {

	List<OrderQueryResultVO> searchExBusOrders(OrderQueryParamVO orderQueryParamVO);

	/**
	 * 
	 * @return
	 */
	List<OrderQueryResultVO> searchDailyExBusOrders(String dailyDateyyyyMMdd);

	/**
	 * 
	 * @param orderQueryParamVO
	 * @return 返回生成的报表文件路径
	 * @throws Throwable 
	 */
	String generateOrderSearchReport(OrderQueryParamVO orderQueryParamVO) throws Throwable;

	List<OrderQueryResultVO> pageSearchExBusOrders(OrderQueryParamVO orderQueryParamVO);

}
