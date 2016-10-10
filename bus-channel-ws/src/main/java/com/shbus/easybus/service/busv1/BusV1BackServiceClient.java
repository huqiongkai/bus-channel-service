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

import com.shbus.easybus.thrift.back.BackService;
import com.shbus.easybus.thrift.back.BackService.Iface;
import com.shbus.easybus.thrift.back.TChangeRefundOrderAmountReq;
import com.shbus.easybus.thrift.back.TChangeRefundOrderAmountResp;
import com.shbus.easybus.thrift.back.TChangeRefundOrderStatusByExOrderIdReq;
import com.shbus.easybus.thrift.back.TChangeRefundOrderStatusByExOrderIdResp;
import com.shbus.easybus.thrift.back.TChangeRefundOrderStatusReq;
import com.shbus.easybus.thrift.back.TChangeRefundOrderStatusResp;
import com.shbus.easybus.thrift.back.TChangeTicketRecStatusByExOrderIdReq;
import com.shbus.easybus.thrift.back.TChangeTicketRecStatusByExOrderIdResp;
import com.shbus.easybus.thrift.back.TChangeTicketRecStatusReq;
import com.shbus.easybus.thrift.back.TChangeTicketRecStatusResp;
import com.shbus.easybus.thrift.back.TChangeTicketStatusByExOrderIdReq;
import com.shbus.easybus.thrift.back.TChangeTicketStatusByExOrderIdResp;
import com.shbus.easybus.thrift.back.TChangeTicketStatusReq;
import com.shbus.easybus.thrift.back.TChangeTicketStatusResp;
import com.shbus.easybus.thrift.back.TGenerateTicketRecRandomReq;
import com.shbus.easybus.thrift.back.TGenerateTicketRecRandomResp;
import com.shbus.easybus.thrift.back.TRefundOrderApplyReq;
import com.shbus.easybus.thrift.back.TRefundOrderApplyResp;

/**
 * @author Administrator
 *
 */
public class BusV1BackServiceClient implements Iface {
	private Log log = LogFactory.getLog(BusV1BackServiceClient.class);
	
	private String bcwThriftWsLocation;

	public String getBcwThriftWsLocation() {
		return bcwThriftWsLocation;
	}

	public void setBcwThriftWsLocation(String bcwThriftWsLocation) {
		this.bcwThriftWsLocation = bcwThriftWsLocation;

		buildServiceClient();
	}

	private BackService.Client serviceClient;
	private TTransport transport;

	private void buildServiceClient() {
		try {
			transport = new THttpClient(bcwThriftWsLocation);
			// 设置传输协议为 TBinaryProtocol
			TProtocol protocol = new TCompactProtocol(transport);
			serviceClient = new BackService.Client(protocol);
		} catch (TTransportException e) {
			log.fatal("busv1.backService.buildServiceClient() error, thrift service url: " + bcwThriftWsLocation, e);
		}
	}

	@Override
	public TRefundOrderApplyResp refundOrderApply(TRefundOrderApplyReq trefundorderapplyreq) throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TChangeRefundOrderAmountResp changeRefundOrderAmount(TChangeRefundOrderAmountReq tchangerefundorderamountreq)
			throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TChangeRefundOrderStatusResp changeRefundOrderStatus(TChangeRefundOrderStatusReq tchangerefundorderstatusreq)
			throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TChangeTicketStatusResp changeTicketStatus(TChangeTicketStatusReq tchangeticketstatusreq) throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TChangeTicketRecStatusResp changeTicketRecStatus(TChangeTicketRecStatusReq req) throws TException {
		TChangeTicketRecStatusResp tChangeTicketRecStatusResp = null;

		try {
			transport.open();
			tChangeTicketRecStatusResp = this.serviceClient.changeTicketRecStatus(req);
		} catch (TException e) {
			log.error("busv1.backService.changeTicketRecStatus error", e);
		} finally {
			transport.close();
		}

		return tChangeTicketRecStatusResp;
	}

	@Override
	public TGenerateTicketRecRandomResp generateTicketRecRandom(TGenerateTicketRecRandomReq tgenerateticketrecrandomreq)
			throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TChangeTicketStatusByExOrderIdResp changeTicketStatusByExOrderId(
			TChangeTicketStatusByExOrderIdReq tchangeticketstatusbyexorderidreq) throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TChangeRefundOrderStatusByExOrderIdResp changeRefundOrderStatusByExOrderId(
			TChangeRefundOrderStatusByExOrderIdReq tchangerefundorderstatusbyexorderidreq) throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TChangeTicketRecStatusByExOrderIdResp changeTicketRecStatusByExOrderId(
			TChangeTicketRecStatusByExOrderIdReq req) throws TException {
		TChangeTicketRecStatusByExOrderIdResp resp = null;

		try {
			transport.open();
			resp = this.serviceClient.changeTicketRecStatusByExOrderId(req);
		} catch (TException e) {
			log.error("busv1.backService.changeTicketRecStatusByExOrderId error", e);
		} finally {
			transport.close();
		}

		return resp;
	}

}
