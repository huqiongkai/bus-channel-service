/**
 * 
 */
package com.shbus.easybus.backoffice.service;

import java.util.List;

import com.shbus.easybus.backoffice.web.OrderQueryParamVO;
import com.shbus.easybus.data.model.TExBusOrder;

/**
 * @author Administrator
 *
 */
public interface IDbManager {

	List<TExBusOrder> searchExBusOrders(OrderQueryParamVO orderQueryParamVO);

	List<TExBusOrder> searchDailyExBusOrders(String dailyDateyyyyMMdd);

	List<TExBusOrder> pageSelectExBusOrders(OrderQueryParamVO orderQueryParamVO);

}
