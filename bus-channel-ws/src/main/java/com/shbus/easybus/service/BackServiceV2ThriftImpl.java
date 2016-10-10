/**
 * 
 */
package com.shbus.easybus.service;

import org.apache.thrift.TException;

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
 * 直接转发给bus-channel-webapp处理。
 *
 */
public class BackServiceV2ThriftImpl implements Iface {

	private BackService.Iface busV1BackService;
	
	public void setBusV1BackService(BackService.Iface busV1BackService) {
		this.busV1BackService = busV1BackService;
	}

	/* (non-Javadoc)
	 * @see com.shbus.easybus.thrift.back.BackService.Iface#refundOrderApply(com.shbus.easybus.thrift.back.TRefundOrderApplyReq)
	 */
	@Override
	public TRefundOrderApplyResp refundOrderApply(TRefundOrderApplyReq trefundorderapplyreq) throws TException {
		// TODO Auto-generated method stub
		return busV1BackService.refundOrderApply(trefundorderapplyreq);
	}

	/* (non-Javadoc)
	 * @see com.shbus.easybus.thrift.back.BackService.Iface#changeRefundOrderAmount(com.shbus.easybus.thrift.back.TChangeRefundOrderAmountReq)
	 */
	@Override
	public TChangeRefundOrderAmountResp changeRefundOrderAmount(TChangeRefundOrderAmountReq tchangerefundorderamountreq)
			throws TException {
		// TODO Auto-generated method stub
		return busV1BackService.changeRefundOrderAmount(tchangerefundorderamountreq);
	}

	/* (non-Javadoc)
	 * @see com.shbus.easybus.thrift.back.BackService.Iface#changeRefundOrderStatus(com.shbus.easybus.thrift.back.TChangeRefundOrderStatusReq)
	 */
	@Override
	public TChangeRefundOrderStatusResp changeRefundOrderStatus(TChangeRefundOrderStatusReq tchangerefundorderstatusreq)
			throws TException {
		// TODO Auto-generated method stub
		return busV1BackService.changeRefundOrderStatus(tchangerefundorderstatusreq);
	}

	/* (non-Javadoc)
	 * @see com.shbus.easybus.thrift.back.BackService.Iface#changeTicketStatus(com.shbus.easybus.thrift.back.TChangeTicketStatusReq)
	 */
	@Override
	public TChangeTicketStatusResp changeTicketStatus(TChangeTicketStatusReq tchangeticketstatusreq) throws TException {
		// TODO Auto-generated method stub
		return busV1BackService.changeTicketStatus(tchangeticketstatusreq);
	}

	/* (non-Javadoc)
	 * @see com.shbus.easybus.thrift.back.BackService.Iface#changeTicketRecStatus(com.shbus.easybus.thrift.back.TChangeTicketRecStatusReq)
	 */
	@Override
	public TChangeTicketRecStatusResp changeTicketRecStatus(TChangeTicketRecStatusReq tchangeticketrecstatusreq)
			throws TException {
		// TODO Auto-generated method stub
		return busV1BackService.changeTicketRecStatus(tchangeticketrecstatusreq);
	}

	/* (non-Javadoc)
	 * @see com.shbus.easybus.thrift.back.BackService.Iface#generateTicketRecRandom(com.shbus.easybus.thrift.back.TGenerateTicketRecRandomReq)
	 */
	@Override
	public TGenerateTicketRecRandomResp generateTicketRecRandom(TGenerateTicketRecRandomReq tgenerateticketrecrandomreq)
			throws TException {
		// TODO Auto-generated method stub
		return busV1BackService.generateTicketRecRandom(tgenerateticketrecrandomreq);
	}

	/* (non-Javadoc)
	 * @see com.shbus.easybus.thrift.back.BackService.Iface#changeTicketStatusByExOrderId(com.shbus.easybus.thrift.back.TChangeTicketStatusByExOrderIdReq)
	 */
	@Override
	public TChangeTicketStatusByExOrderIdResp changeTicketStatusByExOrderId(
			TChangeTicketStatusByExOrderIdReq tchangeticketstatusbyexorderidreq) throws TException {
		// TODO Auto-generated method stub
		return busV1BackService.changeTicketStatusByExOrderId(tchangeticketstatusbyexorderidreq);
	}

	/* (non-Javadoc)
	 * @see com.shbus.easybus.thrift.back.BackService.Iface#changeRefundOrderStatusByExOrderId(com.shbus.easybus.thrift.back.TChangeRefundOrderStatusByExOrderIdReq)
	 */
	@Override
	public TChangeRefundOrderStatusByExOrderIdResp changeRefundOrderStatusByExOrderId(
			TChangeRefundOrderStatusByExOrderIdReq tchangerefundorderstatusbyexorderidreq) throws TException {
		// TODO Auto-generated method stub
		return busV1BackService.changeRefundOrderStatusByExOrderId(tchangerefundorderstatusbyexorderidreq);
	}

	/* (non-Javadoc)
	 * @see com.shbus.easybus.thrift.back.BackService.Iface#changeTicketRecStatusByExOrderId(com.shbus.easybus.thrift.back.TChangeTicketRecStatusByExOrderIdReq)
	 */
	@Override
	public TChangeTicketRecStatusByExOrderIdResp changeTicketRecStatusByExOrderId(
			TChangeTicketRecStatusByExOrderIdReq tchangeticketrecstatusbyexorderidreq) throws TException {
		// TODO Auto-generated method stub
		return busV1BackService.changeTicketRecStatusByExOrderId(tchangeticketrecstatusbyexorderidreq);
	}

}
