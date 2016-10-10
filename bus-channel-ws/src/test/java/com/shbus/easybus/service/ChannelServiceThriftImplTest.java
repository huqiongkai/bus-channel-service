/**
 * 
 */
package com.shbus.easybus.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.thrift.TException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.CollectionUtils;

import com.google.gson.Gson;
import com.shbus.easybus.thrift.front.AuthVO;
import com.shbus.easybus.thrift.front.CertificateType;
import com.shbus.easybus.thrift.front.ChannelService;
import com.shbus.easybus.thrift.front.ExBusOrder;
import com.shbus.easybus.thrift.front.OrderBookReq;
import com.shbus.easybus.thrift.front.OrderBookResp;
import com.shbus.easybus.thrift.front.OrderSearchReq;
import com.shbus.easybus.thrift.front.OrderSearchResp;
import com.shbus.easybus.thrift.front.PsgInfo;
import com.shbus.easybus.thrift.front.QueryBusReq;
import com.shbus.easybus.thrift.front.QueryBusResp;
import com.shbus.easybus.thrift.front.UnitIdConstants;

import junit.framework.TestCase;

/**
 * @author Administrator
 *
 */
public class ChannelServiceThriftImplTest extends TestCase {

	private ChannelService.Iface serviceInstance;
	
	// interface account: test/eZVtUFhFF6qbyD2F
	AuthVO authVO = new AuthVO("test", DigestUtils.md5Hex("test" + "eZVtUFhFF6qbyD2F"));
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		
		ApplicationContext springContext = new ClassPathXmlApplicationContext(
				new String[] { "conf/applicationContext.xml" });
		serviceInstance = (ChannelService.Iface) springContext.getBean("channelServiceThriftFactoryBean");
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link com.shbus.easybus.service.ChannelServiceV2ThriftImpl#orderSearch(com.shbus.easybus.thrift.front.OrderSearchReq)}.
	 */
	public void testOrderSearch() {
		OrderSearchReq req = new OrderSearchReq();
		authVO = new AuthVO("qunar", DigestUtils.md5Hex("qunar" + "bTSFADQu9TXMfeJm"));
		req.setAuthVO(authVO);
//		req.setExOrderId("SAND1451702550221");
		req.setExOrderId("2781699");
//		req.setIsTestOrder("Y");
		try {
			OrderSearchResp orderSearchResp = serviceInstance.orderSearch(req );
			System.out.println(orderSearchResp.getBusError().toString());
			List<ExBusOrder> orderList = orderSearchResp.getResult();
			if (!CollectionUtils.isEmpty(orderList)) {
				for (ExBusOrder item : orderList) {
					System.out.println(item.getId() + ", " + item.getExOrderId() + ", " + item.getExOrderIdIndex());
				}
			}
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link com.shbus.easybus.service.ChannelServiceV2ThriftImpl#orderBook(com.shbus.easybus.thrift.front.OrderBookReq)}.
	 */
	public void testOrderBook() {
		OrderBookReq req = new OrderBookReq();
		req.setAuthVO(authVO);
		req.setIsTestOrder("Y");
		req.setExOrderId("SAND" + System.currentTimeMillis());
		req.setRtOrderId("rtOrderId001");
		req.setPleaveDtyyyyMMddHHmmss("20160103153000");
		req.setTicketCount(2);
		req.setTicketPrice(32);
		req.setTotalPrice(64);
		req.setUnitId(UnitIdConstants.UNIT_ID_CTBZ);
		req.setToStationId("1000000483");
		List<PsgInfo> psgList = new ArrayList<PsgInfo>();
		psgList.add(new PsgInfo("张三", "324343122332213212", CertificateType.id, "13233331212"));
		psgList.add(new PsgInfo("李四", "423343122332213212", CertificateType.id, "13233331213"));
		req.setPsgList(psgList);
		try {
			OrderBookResp orderBookResp = serviceInstance.orderBook(req);
			System.out.println(orderBookResp.exOrderId + ", " + orderBookResp.busError.toString());
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link com.shbus.easybus.service.ChannelServiceV2ThriftImpl#busSearch(com.shbus.easybus.thrift.front.QueryBusReq)}.
	 */
	public void testBusSearch() {
//		String unitId = UnitIdConstants.UNIT_ID_PDCTDZ; // 2000000021 客运南站 A0001Q
		QueryBusReq queryBusReq = new QueryBusReq();
		queryBusReq.setAuthVO(authVO);
		queryBusReq.setUnitId(UnitIdConstants.UNIT_ID_KYNZ);
//		queryBusReq.setToStationId("1000000483");	// 1000000483 宁波客运总站
		queryBusReq.setDepartDateyyyyMMdd("20160116");
		try {
			QueryBusResp queryBusResp1 = serviceInstance.busSearch(queryBusReq);
			System.out.println(new Gson().toJson(queryBusResp1));
			
//			queryBusReq.setToStationId("1000000482");
//			queryBusReq.setDepartDateyyyyMMdd("20160116");
//			QueryBusResp queryBusResp2 = serviceInstance.busSearch(queryBusReq);
//			System.out.println(queryBusResp2.toString());
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link com.shbus.easybus.service.ChannelServiceV2ThriftImpl#changeTicketRecStatusToYes(com.shbus.easybus.thrift.front.ChangeTicketRecStatusToYesReq)}.
	 */
	public void testChangeTicketRecStatusToYes() {
		fail("Not yet implemented");
	}

}
