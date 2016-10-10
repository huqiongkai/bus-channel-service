/**
 * 
 */
package com.shbus.easybus.service.db;

import java.util.List;

import com.shbus.easybus.data.model.TExBusOrder;
import com.shbus.easybus.data.model.TSysChannel;
import com.shbus.easybus.data.model.TSysChinaRegion;
import com.shbus.easybus.data.vo.InterfaceAccountDto;
import com.shbus.easybus.data.vo.OrderSearchReqVO;
import com.shbus.easybus.thrift.front.SysChinaRegion;

/**
 * @author Administrator
 *
 */
public interface DBManager {

	InterfaceAccountDto getInterfaceAccount(String userId);

	TSysChannel getSysChannel(long channelId);

	TSysChinaRegion getTSysChinaRegionByCode(String regionCode6);
	
	SysChinaRegion getSysChinaRegionByCode(String regionCode6);
	
	SysChinaRegion getSysChinaRegionByDepartStation(String stationId);

	long InsertExBusOrder(TExBusOrder exBusOrder);

	List<TExBusOrder> findExBusOrders(OrderSearchReqVO orderSearchReqVo, String supplierId);

	int updateOrderTicketRecStatus(String sandOrderId, String exOrderId, String ticketRecStatus);

	List<String> findTicketAppSandOrders(String supplierId, String ticketStatus);

	List<String> findTicketSuccSandOrders(String supplierId, String ticketStatus, String ticketRecStatus,
			String ticketRefundStatus);

	int updateOrderTicketStatus(String supplierId, String sandOrderId, TExBusOrder tOrder);

	List<SysChinaRegion> findSysChinaRegionByRegion6Code(List<String> region6CodeList);

}
