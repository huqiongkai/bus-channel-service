/**
 * 
 */
package com.shbus.easybus.utils;

/**
 * @author Administrator
 *
 */
public class BusContants {

	// ---------- constants definition for bus-channel-ws service response --------
	public static final String BUS_ERROR_SUCCESS_CODE = "0000";
	public static final String BUS_ERROR_FAIL_CODE = "-1";
	public static final String BUS_ERROR_MSG_AUTH_FAIL = "签名验证不通过";
	
	// ---------- constants definition for sand webservice response --------
	public static final String SANDWS_ORDER_CONFIRM_PAY_OK = "0001";
	public static final String SANDWS_ORDER_CONFIRM_PAY_FAIL = "0002";
	public static final String SANDWS_SUBMITORDER_PREPAY_ERROR = "01";
	public static final String SANDWS_UNDER_MAINTAINANCE_ERROR = "02";
	public class QueryOrderStatusCode {
		public static final String ORDER_PAY_PENDING = "00";	// 待支付
		public static final String TICKET_READY = "01";			// 待取票
		public static final String TICKET_RECEIVED = "02";		// 已取票
		public static final String ORDER_CANCELLED = "03";		// 已取消
		public static final String TICKET_PROCESSING = "04";	// 出票中
		public static final String REFUND_PENDING = "05";		// 出票失败待退款
		public static final String REFUNDED = "06";				// 出票失败已退款
	}

}
