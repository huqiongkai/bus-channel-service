/**
 * 
 */
package com.shbus.easybus.service.back;

/**
 * @author Administrator
 *
 */
public interface SandSchedulingService {

	void enqueueOrder(String ord);

	void startAppOrderTask();

	void startSuccOrderTask();

	void syncUpAppOrdersWithDB();
	
	void startSandBusCacheTask();

}
