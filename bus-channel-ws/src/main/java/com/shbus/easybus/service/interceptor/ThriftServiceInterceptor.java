/**
 * 
 */
package com.shbus.easybus.service.interceptor;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.shbus.easybus.thrift.front.BusError;
import com.shbus.easybus.utils.BusContants;

/**
 * @author Administrator
 *
 */
public class ThriftServiceInterceptor implements MethodInterceptor {
	private Log log = LogFactory.getLog(ThriftServiceInterceptor.class);

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object res = null;
		try {
			for (Object o : invocation.getArguments()) {
				if (o == null) {
					throw new Exception("请把参数中的必填项目填上");
				}
//				System.out.println(o);	//
				// log the request details, should never remove it
				log.info(o);
			}
			res = invocation.proceed();
		} catch (Throwable e) {
			res = invocation.getMethod().getReturnType().newInstance();
			Method m = res.getClass().getMethod("setBusError", new Class[] { BusError.class });
			if (m == null) {
				log.fatal("找不到setBusError方法");
				throw new Exception("找不到setBusError方法");
			}
			BusError buserror = new BusError();
			buserror.setErrorDesc(e.getMessage());
			buserror.setErrorCode(BusContants.BUS_ERROR_FAIL_CODE);
			m.invoke(res, buserror);
		}
		return res;
	}

}
