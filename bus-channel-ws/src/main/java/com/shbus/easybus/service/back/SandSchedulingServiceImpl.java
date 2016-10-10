/**
 * 
 */
package com.shbus.easybus.service.back;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.scheduling.SchedulingTaskExecutor;
import org.springframework.util.CollectionUtils;

import com.shbus.easybus.FlightInfoBean;
import com.shbus.easybus.IJyBusTicketService;
import com.shbus.easybus.TicketBean;
import com.shbus.easybus.VBusSearchResult;
import com.shbus.easybus.data.model.TExBusOrder;
import com.shbus.easybus.service.cache.ICacheManager;
import com.shbus.easybus.service.db.DBManager;
import com.shbus.easybus.thrift.front.BusAllInfoVO;
import com.shbus.easybus.thrift.front.BusBasicInfoVO;
import com.shbus.easybus.thrift.front.BusPriceVO;
import com.shbus.easybus.thrift.front.BusQuotaVO;
import com.shbus.easybus.thrift.front.SysChinaRegion;
import com.shbus.easybus.thrift.front.UnitIdConstants;
import com.shbus.easybus.utils.BusContants;
import com.shbus.easybus.utils.SandStationIdMapping;
import com.shbus.easybus.utils.StationMappingSysChinaRegion;
import com.shbus.easybus.utils.ValueCollection;

/**
 * 轮询同步更新sand订单出票、取票状态。
 * 
 * @author Administrator
 *
 */
public class SandSchedulingServiceImpl implements SandSchedulingService {
	private Log log = LogFactory.getLog(SandSchedulingService.class);
	
	private String supplierId;
	private IJyBusTicketService sandTicketService;
	private SchedulingTaskExecutor executorService;
	private DBManager dbManager;

	public void setSandTicketService(IJyBusTicketService sandTicketService) {
		this.sandTicketService = sandTicketService;
	}
	
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public void setDbManager(DBManager dbManager) {
		this.dbManager = dbManager;
		
		buildBlockingQueueFromDB(false);
	}

	public void setExecutorService(SchedulingTaskExecutor executorService) {
		this.executorService = executorService;
	}

	private BlockingQueue<String> appOrderQueue = new LinkedBlockingQueue<String>();

	private String[] extractSandOrderInfo(String sandOrderStatus) {
		String[] returnArr = null;
		if (StringUtils.isNotBlank(sandOrderStatus)) {
			returnArr = sandOrderStatus.trim().split("\\|");	// '|'为转义字符，必须设置为'\\|'
		}
		return returnArr;
	}
	
	/**
	 * 处理杉德订单状态更新。
	 * @param sandOrderId
	 * @param ticketSuccess	订单目前是否已出票成功
	 * @return
	 */
	private int handleSandOrderStatusUpdate(String sandOrderId, boolean ticketSuccess) throws Throwable {
		int rowsAffected = 0;
		if (StringUtils.isNotBlank(sandOrderId)) {
			sandOrderId = sandOrderId.trim();
			String sandOrderInfoResponse = null;
			try {
				sandOrderInfoResponse = sandTicketService.queryOrderInfo(sandOrderId);
			} catch (Throwable t) {
				log.fatal("sandTicketService.queryOrderInfo error for order#: " + sandOrderId, t);
				throw t;
			}
			log.debug("sandTicketService.queryOrderStatus for order#" + sandOrderId + ", " + sandOrderInfoResponse);
			String[] ordInfoArr = extractSandOrderInfo(sandOrderInfoResponse);
			if (ordInfoArr != null && ordInfoArr.length > 0) {
				String sandOrdStatusCode = ordInfoArr[0].trim();
				String sandTicketRecRandomCode = null;
				if (ordInfoArr.length >= 2) {
					String rc = ordInfoArr[1];
					if (StringUtils.isNotBlank(rc) && !"null".equalsIgnoreCase(rc.trim())) {
						sandTicketRecRandomCode = rc.trim();
					}
				}
				TExBusOrder tOrder = null;
				Date currDate = new Date();
				switch (sandOrdStatusCode) {
				case BusContants.QueryOrderStatusCode.TICKET_PROCESSING:	// 出票中，轮询订单默认状态，无需处理
					break;
				case BusContants.QueryOrderStatusCode.TICKET_READY:			// 待取票，出票成功
					if (!ticketSuccess) {
						tOrder = new TExBusOrder();
						tOrder.setTicketStatus(ValueCollection.TicketStatus.SUC.toString());
						tOrder.setTicketConfirmDate(currDate);
						tOrder.setTicketRecStatus(ValueCollection.TicketRecStatus.NO.toString());
						tOrder.setModifyDatetime(currDate);
					}
					break;
				case BusContants.QueryOrderStatusCode.REFUND_PENDING:		// 出票失败待退款
					tOrder = new TExBusOrder();
					if (!ticketSuccess) {
						tOrder.setTicketStatus(ValueCollection.TicketStatus.FAIL.toString());
					}
					tOrder.setTicketRefundStatus(ValueCollection.TicketRefundStatus.APP.toString());
					tOrder.setModifyDatetime(currDate);
					break;
				case BusContants.QueryOrderStatusCode.REFUNDED:				// 出票失败已退款
					tOrder = new TExBusOrder();
					if (!ticketSuccess) {
						tOrder.setTicketStatus(ValueCollection.TicketStatus.FAIL.toString());
					}
					tOrder.setTicketRefundStatus(ValueCollection.TicketRefundStatus.SUC.toString());
					tOrder.setTicketRefundConfirmDate(currDate);
					tOrder.setModifyDatetime(currDate);
					break;
				case BusContants.QueryOrderStatusCode.ORDER_CANCELLED:		// 未付款，已取消，无需处理
					tOrder = new TExBusOrder();
					if (!ticketSuccess) {
						tOrder.setTicketStatus(ValueCollection.TicketStatus.FAIL.toString());
					}
					tOrder.setRemark("订单已由杉德取消");
					tOrder.setTicketRefundStatus(ValueCollection.TicketRefundStatus.APP.toString());
					tOrder.setModifyDatetime(currDate);
					break;
				case BusContants.QueryOrderStatusCode.TICKET_RECEIVED:		// 已取票
					tOrder = new TExBusOrder();
					if (!ticketSuccess) {
						tOrder.setTicketStatus(ValueCollection.TicketStatus.SUC.toString());
						tOrder.setTicketConfirmDate(currDate);
					}
					tOrder.setTicketRecStatus(ValueCollection.TicketRecStatus.YES.toString());
					tOrder.setTicketRecDate(currDate);
					tOrder.setModifyDatetime(currDate);
					break;
				}
				if (tOrder != null) {
					if (StringUtils.isNotBlank(sandTicketRecRandomCode)) {
						tOrder.setTicketRecRandomCode(sandTicketRecRandomCode);
					}
					rowsAffected = dbManager.updateOrderTicketStatus(supplierId, sandOrderId, tOrder);
				}
			}
		}
		
		return rowsAffected;
	}
	
	/**
	 * 处理新订单出票状态同步。
	 */
	private Runnable appOrderTask = new Runnable() {
		@Override
		public void run() {
			List<String> currentOrderList = new ArrayList<String>();
			int count = appOrderQueue.drainTo(currentOrderList);
			log.info("appOrderTask running, thread: " + Thread.currentThread().toString() + " order num: " + count);
			for (String sandOrderId : currentOrderList) {
				int rowsAffected;
				try {
					rowsAffected = handleSandOrderStatusUpdate(sandOrderId, false);
				} catch (Throwable e) {
					rowsAffected = 0;
				}
				if (rowsAffected <= 0) { 		// add to the queue again
					enqueueOrder(sandOrderId);
				} else {
					log.info("updateExBusOrderTicketStatus done, appOrderId=" + sandOrderId);
				}
			}
		}
	};
	
	/**
	 * 处理订单取票状态同步。
	 */
	private Runnable succOrderTask = new Runnable() {
		@Override
		public void run() {
			List<String> sandOrderIds = dbManager.findTicketSuccSandOrders(supplierId,
					ValueCollection.TicketStatus.SUC.toString(), ValueCollection.TicketRecStatus.NO.toString(),
					ValueCollection.TicketRefundStatus.NONE.toString());
			
			log.info("succOrderTask running, thread: " + Thread.currentThread().toString() + " order num: "
					+ (sandOrderIds != null ? sandOrderIds.size() : 0));
			
			if (!CollectionUtils.isEmpty(sandOrderIds)) {
				for (String ordId : sandOrderIds) {
					int rowsAffected;
					try {
						rowsAffected = handleSandOrderStatusUpdate(ordId, true);
					} catch (Throwable e) {
						rowsAffected = 0;
					}
					if (rowsAffected <= 0) {
						log.info("dbManager.updateExBusOrderTicketStatus error, succOrderId=" + ordId);
					}
				}
			}
		}
	};
	
	private void buildBlockingQueueFromDB(boolean refresh) {
		List<String> dbOrders = dbManager.findTicketAppSandOrders(supplierId,
				ValueCollection.TicketStatus.APP.toString());
		
		if (refresh) {
			// 清空当前的队列数据
			List<String> tmpList = new ArrayList<String>();
			appOrderQueue.drainTo(tmpList);
			tmpList = null;
		}
		
		log.info("buildBlockingQueueFromDB, order size for queue: " + dbOrders.size());
		for (String item : dbOrders) {
			if (StringUtils.isNotBlank(item)) {
				enqueueOrder(item);
			}
		}
	}
	
	public void enqueueOrder(String sandOrderId) {
		if (! appOrderQueue.offer(sandOrderId)) {
			if (! appOrderQueue.offer(sandOrderId)) {
				log.error("appOrderQueue.offer fails for sandOrderId=" + sandOrderId);
			}
		}
	}

	@Override
	public void startAppOrderTask() {
		log.info("SandPollingService::startAppOrderTask invoked, " + new Date());
		executorService.execute(this.appOrderTask);
	}
	
	@Override
	public void startSuccOrderTask() {
		log.info("SandPollingService::startSuccOrderTask invoked, " + new Date());
		executorService.execute(this.succOrderTask);
	}

	@Override
	public void syncUpAppOrdersWithDB() {
		log.info("SandPollingService::syncUpAppOrdersWithDB invoked, " + new Date());
		buildBlockingQueueFromDB(true);
	}
	
	private int cacheDayNum;
	private ICacheManager cacheManager;
	
	public void setCacheDayNum(String cacheDayNumStr) {
		try {
			this.cacheDayNum = Integer.parseInt(cacheDayNumStr);
		} catch (Exception e) {
			this.cacheDayNum = 10;
		}
	}
	
	public void setCacheManager(ICacheManager cacheManager) {
		this.cacheManager = cacheManager;

		startSandBusCacheTask();
	}

	private SandBusDetailVO querySandBusDetail(String sandFlightId, String leaveTimeyyyyMMdd) {
		SandBusDetailVO sandBusDetailVO = cacheManager.getSandBusDetailByFlightId(leaveTimeyyyyMMdd, sandFlightId);
		if (sandBusDetailVO == null) {
			TicketBean vBusDetail = null;
			try {
				vBusDetail = sandTicketService.queryVBusDetail(sandFlightId);
			} catch (Exception e) {
				log.error("querySandBusDetail(), 查询指定班次信息出错！, sandFlightId=" + sandFlightId);
			}
			if (vBusDetail != null) {
				sandBusDetailVO = new SandBusDetailVO();
				BeanUtils.copyProperties(vBusDetail, sandBusDetailVO);
				cacheManager.cacheStoreSandBusDetail(leaveTimeyyyyMMdd, sandBusDetailVO);
			}
		}
		
		return sandBusDetailVO;
	}
	
	private void populateSandBusCache(FlightInfoBean item, String leaveTimeyyyyMMdd, Map<String, List<BusAllInfoVO>> resultMap) throws Throwable {
		if (!item.isTimeLimmit() && "Y".equalsIgnoreCase(item.getOnlineStatus())) {	// 是否在购票时间限制内，并且为在线可售状态
			String sandFlightId = item.getFlightOnlineDetailId();
			if (StringUtils.isBlank(sandFlightId)) {
				log.error("popularSandBusCache(), sandFlightId is empty");
				return;
			}
			sandFlightId = sandFlightId.trim();
			SandBusDetailVO sandBusDetail = querySandBusDetail(sandFlightId, leaveTimeyyyyMMdd);
			if (sandBusDetail == null) {
				log.error("popularSandBusCache(), sand bus not found, sandFlightId=" + sandFlightId);
				return;
			}
			
			BusBasicInfoVO busBasicInfoVO = new BusBasicInfoVO();
			String startStationId = SandStationIdMapping.getBusStationId(sandBusDetail.getStationId());
//			startStationId = SandBusStations.getStationIdByName(sandBusDetail.getStartStation())
			if (startStationId == null) {
				log.error("popularSandBusCache(), startStation not supported yet, stationName="
						+ sandBusDetail.getStartStation());
				return;
			}
			
			// FIXME 同名目的地解析
			SysChinaRegion arrive = cacheManager.getSysChinaRegionByCnname(sandBusDetail.getArriveRegionName());
			String toStationId = "";
			if (arrive != null) {
				toStationId = StationMappingSysChinaRegion.getStationIdByRegionCode(arrive.getRegionCode6());
			}
			if (arrive == null || StringUtils.isBlank(toStationId)) {
				log.error("获取车次详情出错，目的地解析失败，班次ID=" + sandFlightId + ", arriveRegionName="
						+ sandBusDetail.getArriveRegionName());
				return;
			}
			toStationId = toStationId.trim();
			
			String leaveTime = leaveTimeyyyyMMdd + sandBusDetail.getStartingTime().trim().replace(":", "") + "00";
			busBasicInfoVO.setPleaveDtyyyyMMddHHmmss(leaveTime);
			BusPriceVO busPriceVO = new BusPriceVO();
			int ticketNum;
			try {
				ticketNum = Integer.parseInt(sandBusDetail.getTicketRemainNums());
				busPriceVO.setPriceFull(((Double) Double.parseDouble(sandBusDetail.getFullTicketPrice())).intValue());
			} catch (NumberFormatException e) {
				log.error("获取车次详情出错，ticketNum or ticketPrice parse error, 班次ID=" + sandFlightId, e);
				return;
			}
			
			busBasicInfoVO.setUnitId(startStationId);
			busBasicInfoVO.setToStationId(toStationId);
			busBasicInfoVO.setDepart(dbManager.getSysChinaRegionByDepartStation(startStationId));
			busBasicInfoVO.setArrive(arrive);
			busBasicInfoVO.setRtorderCode(sandBusDetail.getBusNum());
			busBasicInfoVO.setRtorderId(sandFlightId);
			
			busBasicInfoVO.setBusTypeId(sandBusDetail.getBusType());
			busBasicInfoVO.setToProvinceName(item.getArrvieProvince());
			busBasicInfoVO.setTicketGateName(sandBusDetail.getAboardPlace());
			busBasicInfoVO.setToStationName(StringUtils.isNotBlank(sandBusDetail.getArriveStationName())
					? sandBusDetail.getArriveRegionName() + sandBusDetail.getArriveStationName()
					: sandBusDetail.getArriveRegionName());
			BusQuotaVO busQuotaVO = new BusQuotaVO(ticketNum);
			BusAllInfoVO busVO = new BusAllInfoVO(busPriceVO, busBasicInfoVO, busQuotaVO, null);
			
			String cacheKey = null;
			try {
				cacheKey = startStationId + "." + toStationId + "." + leaveTimeyyyyMMdd;
				if (! resultMap.containsKey(cacheKey)) {
					resultMap.put(cacheKey, new ArrayList<BusAllInfoVO>());
				}
				resultMap.get(cacheKey).add(busVO);
			} catch (Exception e) {
				log.error("add new busVO fail for cacheKey=" + cacheKey, e);
			}
		}
	}
	
	private void performSandBusDataUpdate(String unitId, String departDateyyyyMMdd) {
		log.info("sandBusCacheTask::queryVBusList, unitId=" + unitId + ", departDateyyyyMMdd=" + departDateyyyyMMdd);
		
		VBusSearchResult sandResp;
		try {
			sandResp = sandTicketService.queryVBusList(unitId, "", departDateyyyyMMdd);
		} catch (Throwable t) {
			sandResp = null;
		}
		if (sandResp != null && "N".equalsIgnoreCase(sandResp.getIsClose())) {
			List<FlightInfoBean> flights = sandResp.getFlightInfoList();
			if (! CollectionUtils.isEmpty(flights)) {
				Map<String, List<BusAllInfoVO>> resultMap = new HashMap<String, List<BusAllInfoVO>>();
				String leaveTimeyyyyMMdd = departDateyyyyMMdd.replace("-", "");
				for (FlightInfoBean item : flights) {
					try {
						populateSandBusCache(item, leaveTimeyyyyMMdd, resultMap);
					} catch (Throwable e) {
						continue;
					}
				}
				
				if (! CollectionUtils.isEmpty(resultMap)) {
					cacheManager.cacheStoreSandBusData(resultMap);
				}
			}
		}
	}
	
	private Runnable sandBusCacheTask = new Runnable() {
		@Override
		public void run() {
			Calendar calend = Calendar.getInstance();
			Date today = calend.getTime();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			final String commaStr = ",";
			String ccgnwUnitId = new StringBuilder()
					.append(SandStationIdMapping.getSandStationId(UnitIdConstants.UNIT_ID_CTBZ)).append(commaStr)
					.append(UnitIdConstants.UNIT_ID_CSKYZ).append(commaStr).append(UnitIdConstants.UNIT_ID_GQKYZ)
					.append(commaStr).append(UnitIdConstants.UNIT_ID_NHKYZ).append(commaStr)
					.append(UnitIdConstants.UNIT_ID_WSKYZ).toString();
			String pdhtUnitId = SandStationIdMapping.getSandStationId(UnitIdConstants.UNIT_ID_PDCTDZ) + commaStr
					+ SandStationIdMapping.getSandStationId(UnitIdConstants.UNIT_ID_HTLKYZ); 
			for (int i = 0; i < cacheDayNum; i ++) {
				if (i > 0) {
					calend.add(Calendar.DAY_OF_MONTH, 1);
				}
				
//				calend.add(Calendar.DAY_OF_MONTH, 1);	// for test only
				String departDateyyyyMMdd = dateFormat.format(calend.getTime()).substring(0, 10);
				
				performSandBusDataUpdate(SandStationIdMapping.getSandStationId(UnitIdConstants.UNIT_ID_HQCTXZ),
						departDateyyyyMMdd);
				/*performSandBusDataUpdate(SandStationIdMapping.getSandStationId(UnitIdConstants.UNIT_ID_KYNZ),
						departDateyyyyMMdd);*/
				performSandBusDataUpdate(pdhtUnitId, departDateyyyyMMdd);
				performSandBusDataUpdate(ccgnwUnitId, departDateyyyyMMdd);
			}
			
			// clean bus data before today which should be expired
			cacheManager.afterSandBusSyncDone(new SimpleDateFormat("yyyyMMddHHmmss").format(today).substring(0, 8));
		}
	};

	@Override
	public void startSandBusCacheTask() {
		log.info("SandPollingService::startSandBusCacheTask invoked, " + new Date());
		executorService.execute(this.sandBusCacheTask);
	}
	
}
