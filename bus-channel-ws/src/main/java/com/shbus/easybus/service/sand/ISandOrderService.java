/**
 * 
 */
package com.shbus.easybus.service.sand;

import com.shbus.easybus.data.vo.ExBusOrderReqBasic;

/**
 * @author Administrator
 *
 */
public interface ISandOrderService {

	Object[] submitTicketOrder(ExBusOrderReqBasic orderReqBasic) throws Exception;

}
