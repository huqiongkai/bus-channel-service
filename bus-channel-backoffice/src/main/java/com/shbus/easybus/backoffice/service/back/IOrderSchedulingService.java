/**
 * 
 */
package com.shbus.easybus.backoffice.service.back;

/**
 * @author Administrator
 *
 */
public interface IOrderSchedulingService {

	/**
	 * 启动每日订单统计报表任务
	 */
	void startDailyReportTask();

}
