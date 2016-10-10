/**
 * 
 */
package com.shbus.easybus.service.cache;

import java.util.List;
import java.util.Map;

import com.shbus.easybus.service.back.SandBusDetailVO;
import com.shbus.easybus.thrift.front.BusAllInfoVO;
import com.shbus.easybus.thrift.front.SysChinaRegion;

/**
 * @author Administrator
 *
 */
public interface ICacheManager {

	SysChinaRegion getSysChinaRegionByRegion6Code(String region6Code);

	SysChinaRegion getSysChinaRegionByCnname(String regionCnname);

	void cacheStoreSandBusData(Map<String, List<BusAllInfoVO>> dataMap);

	List<String> getAllMemKeys();

	/**
	 * 同步所有的memcache key.
	 */
	void refreshAllMemKeySet();

	/**
	 * 清理前几天的班次cache.
	 * 
	 * @param dateyyyyMMdd
	 */
	void afterSandBusSyncDone(String dateyyyyMMdd);

	List<BusAllInfoVO> getSandBusesByUnitId(String unitId);

	List<BusAllInfoVO> getSandBusesByAllConds(String unitId, String toStationId, String departDateyyyyMMdd);

	List<BusAllInfoVO> getSandBusesByFromToStation(String unitId, String toStationId);

	List<BusAllInfoVO> getSandBusesByUnitIdAndDepartDay(String unitId, String departDateyyyyMMdd);

	SandBusDetailVO getSandBusDetailByFlightId(String leaveTimeyyyyMMdd, String sandFlightId);

	void cacheStoreSandBusDetail(String leaveTimeyyyyMMdd, SandBusDetailVO sandBusDetailVO);

}
