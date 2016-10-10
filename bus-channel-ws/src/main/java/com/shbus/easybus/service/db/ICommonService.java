/**
 * 
 */
package com.shbus.easybus.service.db;

import java.util.List;

import com.shbus.easybus.data.model.TSysChannel;
import com.shbus.easybus.data.vo.ExBusOrderReqBasic;
import com.shbus.easybus.data.vo.OrderSearchReqVO;
import com.shbus.easybus.service.back.SandBusDetailVO;
import com.shbus.easybus.thrift.front.AuthVO;
import com.shbus.easybus.thrift.front.BusAllInfoVO;
import com.shbus.easybus.thrift.front.ExBusOrder;

/**
 * @author Administrator
 *
 */
public interface ICommonService {

	List<ExBusOrder> queryExBusOrders(OrderSearchReqVO orderSearchReqVo, String supplierId);

	List<BusAllInfoVO> executeBusQuery(String unitId, String toStationId, String departDateyyyyMMdd);

	void placeExBusOrder(String supplierId, String sandOrderId, SandBusDetailVO sandBusDetail,
			ExBusOrderReqBasic orderReqBasic, TSysChannel accountChannel) throws Exception;

	TSysChannel doAuth(AuthVO authVO);

}
