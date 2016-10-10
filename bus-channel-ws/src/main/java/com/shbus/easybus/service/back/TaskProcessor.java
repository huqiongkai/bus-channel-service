package com.shbus.easybus.service.back;

/**
 * 
 * @author Administrator
 *
 */
public interface TaskProcessor {

	void processOrders();

	void updateOrderCacheFromDB();

}
