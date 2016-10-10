/**
 * 
 */
package com.shbus.easybus.data.vo;

import java.io.Serializable;

import com.shbus.easybus.thrift.front.CertificateType;

/**
 * @author Administrator
 *
 */
public class OrderSearchReqVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1088875078247727485L;

	public String supplierId;
	public int channelId;
	public String channelName;

	/**
	 * 外部订单号
	 */
	public String exOrderId; // optional
	/**
	 * 取票状态 NONE:无申请 ,APP:处理中,FAIL:失败,SUC:成功;
	 */
	public String ticketRecStatus; // optional
	/**
	 * 出票状态 NONE:无申请 ,APP:处理中,FAIL:失败,SUC:成功;
	 */
	public String ticketStatus; // optional
	/**
	 * 出票时间 （查询时间范围-开始 yyyyMMdd）
	 */
	public String ticketConfirmDateBegin; // optional
	/**
	 * 出票时间 （查询时间范围-结束 yyyyMMdd）
	 */
	public String ticketConfirmDateEnd; // optional
	/**
	 * 取票时间 （查询时间范围-开始 yyyyMMdd）
	 */
	public String ticketRecDateBegin; // optional
	/**
	 * 取票时间 （查询时间范围-结束 yyyyMMdd）
	 */
	public String ticketRecDateEnd; // optional
	/**
	 * 客人姓名
	 */
	public String psgName; // optional
	/**
	 * 证件类型
	 * 
	 * @see CertificateType
	 */
	public CertificateType psgCertificateType; // optional
	/**
	 * 证件号
	 */
	public String psgCertificateNo; // optional
	/**
	 * 手机号
	 */
	public String psgMobile; // optional
	/**
	 * 第几页 每页默认10个 第一页从1开始
	 */
	public int pageIndex; // required
	/**
	 * 是否测试订单 Y:测试订单 N:非测试订单
	 */
	public String isTestOrder; // required
	/**
	 * 创建时间 （查询时间范围-开始 yyyyMMdd）
	 */
	public String ticketCreateDateBegin; // optional
	/**
	 * 创建时间 （查询时间范围-结束 yyyyMMdd）
	 */
	public String ticketCreateDateEnd; // optional

	public OrderSearchReqVO(int channelId, String channelName) {
		this.channelId = channelId;
		this.channelName = channelName;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getExOrderId() {
		return exOrderId;
	}

	public void setExOrderId(String exOrderId) {
		this.exOrderId = exOrderId;
	}

	public String getTicketRecStatus() {
		return ticketRecStatus;
	}

	public void setTicketRecStatus(String ticketRecStatus) {
		this.ticketRecStatus = ticketRecStatus;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getTicketConfirmDateBegin() {
		return ticketConfirmDateBegin;
	}

	public void setTicketConfirmDateBegin(String ticketConfirmDateBegin) {
		this.ticketConfirmDateBegin = ticketConfirmDateBegin;
	}

	public String getTicketConfirmDateEnd() {
		return ticketConfirmDateEnd;
	}

	public void setTicketConfirmDateEnd(String ticketConfirmDateEnd) {
		this.ticketConfirmDateEnd = ticketConfirmDateEnd;
	}

	public String getTicketRecDateBegin() {
		return ticketRecDateBegin;
	}

	public void setTicketRecDateBegin(String ticketRecDateBegin) {
		this.ticketRecDateBegin = ticketRecDateBegin;
	}

	public String getTicketRecDateEnd() {
		return ticketRecDateEnd;
	}

	public void setTicketRecDateEnd(String ticketRecDateEnd) {
		this.ticketRecDateEnd = ticketRecDateEnd;
	}

	public String getPsgName() {
		return psgName;
	}

	public void setPsgName(String psgName) {
		this.psgName = psgName;
	}

	public CertificateType getPsgCertificateType() {
		return psgCertificateType;
	}

	public void setPsgCertificateType(CertificateType psgCertificateType) {
		this.psgCertificateType = psgCertificateType;
	}

	public String getPsgCertificateNo() {
		return psgCertificateNo;
	}

	public void setPsgCertificateNo(String psgCertificateNo) {
		this.psgCertificateNo = psgCertificateNo;
	}

	public String getPsgMobile() {
		return psgMobile;
	}

	public void setPsgMobile(String psgMobile) {
		this.psgMobile = psgMobile;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getIsTestOrder() {
		return isTestOrder;
	}

	public void setIsTestOrder(String isTestOrder) {
		this.isTestOrder = isTestOrder;
	}

	public String getTicketCreateDateBegin() {
		return ticketCreateDateBegin;
	}

	public void setTicketCreateDateBegin(String ticketCreateDateBegin) {
		this.ticketCreateDateBegin = ticketCreateDateBegin;
	}

	public String getTicketCreateDateEnd() {
		return ticketCreateDateEnd;
	}

	public void setTicketCreateDateEnd(String ticketCreateDateEnd) {
		this.ticketCreateDateEnd = ticketCreateDateEnd;
	}

}
