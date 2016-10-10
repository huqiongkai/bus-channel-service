/**
 * 
 */
package com.shbus.easybus.service.busv1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.shbus.easybus.thrift.front.ChangeTicketRecStatusToYesReq;
import com.shbus.easybus.thrift.front.ChangeTicketRecStatusToYesResp;
import com.shbus.easybus.thrift.front.ChannelService;
import com.shbus.easybus.thrift.front.OrderBookReq;
import com.shbus.easybus.thrift.front.OrderBookResp;
import com.shbus.easybus.thrift.front.OrderSearchReq;
import com.shbus.easybus.thrift.front.OrderSearchResp;
import com.shbus.easybus.thrift.front.QueryBusReq;
import com.shbus.easybus.thrift.front.QueryBusResp;

/**
 * bus-channel-webapp client.
 * 
 * @author Administrator
 *
 */
public class BusV1ChannelServiceClient implements ChannelService.Iface {
	private Log log = LogFactory.getLog(BusV1ChannelServiceClient.class);
	
	private String bcwThriftWsLocation;

	public String getBcwThriftWsLocation() {
		return bcwThriftWsLocation;
	}

	public void setBcwThriftWsLocation(String bcwThriftWsLocation) {
		this.bcwThriftWsLocation = bcwThriftWsLocation;
		
		buildServiceClient();
	}

	private ChannelService.Client serviceClient;
	private TTransport transport;
	
	private void buildServiceClient() {
		try {
			transport = new THttpClient(bcwThriftWsLocation);
			// 设置传输协议为 TBinaryProtocol
			TProtocol protocol = new TCompactProtocol(transport);
			serviceClient = new ChannelService.Client(protocol);
		} catch (TTransportException e) {
			log.fatal("busv1.channelService.buildServiceClient() error, thrift service url: " + bcwThriftWsLocation, e);
		}
	}
	
	public QueryBusResp busSearch(QueryBusReq req) {
		QueryBusResp queryBusResp = null;

		try {
			transport.open();
			queryBusResp = this.serviceClient.busSearch(req);
		} catch (TException e) {
			log.fatal("busv1.channelService.busSearch() error, unitId=" + req.getUnitId() + ", toStationId="
					+ req.getToStationId(), e);
		} finally {
			transport.close();
		}
		
		return queryBusResp;
	}

	@Override
	public OrderSearchResp orderSearch(OrderSearchReq req) throws TException {
		OrderSearchResp orderSearchResp = null;

		try {
			transport.open();
			orderSearchResp = this.serviceClient.orderSearch(req);
		} catch (TException e) {
			log.fatal("busv1.channelService.orderSearch() error, exOrderId=" + req.getExOrderId(), e);
		} finally {
			transport.close();
		}
		
		return orderSearchResp;
	}

	@Override
	public OrderBookResp orderBook(OrderBookReq req) throws TException {
		OrderBookResp orderBookResp = null;

		try {
			transport.open();
			orderBookResp = this.serviceClient.orderBook(req);
		} catch (TException e) {
			log.fatal("busv1.channelService.orderSearch() error, exOrderId=" + req.getExOrderId(), e);
		} finally {
			transport.close();
		}
		
		return orderBookResp;
	}

	@Override
	public ChangeTicketRecStatusToYesResp changeTicketRecStatusToYes(ChangeTicketRecStatusToYesReq req)
			throws TException {
		ChangeTicketRecStatusToYesResp changeTicketRecStatusToYesResp = null;

		try {
			transport.open();
			changeTicketRecStatusToYesResp = this.serviceClient.changeTicketRecStatusToYes(req);
		} catch (TException e) {
			log.fatal("busv1.channelService.changeTicketRecStatusToYes() error, exOrderId=" + req.getExOrderId(), e);
		} finally {
			transport.close();
		}
		
		return changeTicketRecStatusToYesResp;
	}

}
