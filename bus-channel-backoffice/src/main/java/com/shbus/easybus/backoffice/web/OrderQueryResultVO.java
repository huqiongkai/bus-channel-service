/**
 * 
 */
package com.shbus.easybus.backoffice.web;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 *
 */
public class OrderQueryResultVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2234906847211539562L;

	private long id;
	private long channelId;
	private String channelName;
	private Date createDate;
	private String exOrderId;
	private String psgName;
	private String psgCertificateType;
	private String psgCertificateNo;
	private String psgMobile;
	private String fromStationName;
	private String toStationName;
	private Date pleaveDt;
	private String ticketStatus;
	private Date ticketConfirmDate;
	private long exOrderIdIndex;
	private String rtorderId;
	private String rtorderCode;
	private String unitId;
	private String toStationId;
	private String ticketRecStatus;
	private Date ticketRecDate;
	private String orderPackageId;
	private String isTestOrder;

	private Double ticketPrice;
	private String ticketRecRandomCode;
	
	public String getTicketRecRandomCode() {
		return ticketRecRandomCode;
	}

	public void setTicketRecRandomCode(String ticketRecRandomCode) {
		this.ticketRecRandomCode = ticketRecRandomCode;
	}

	public Double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getChannelId() {
		return channelId;
	}

	public void setChannelId(long channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getExOrderId() {
		return exOrderId;
	}

	public void setExOrderId(String exOrderId) {
		this.exOrderId = exOrderId;
	}

	public String getPsgName() {
		return psgName;
	}

	public void setPsgName(String psgName) {
		this.psgName = psgName;
	}

	public String getPsgCertificateType() {
		return psgCertificateType;
	}

	public void setPsgCertificateType(String psgCertificateType) {
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

	public String getFromStationName() {
		return fromStationName;
	}

	public void setFromStationName(String fromStationName) {
		this.fromStationName = fromStationName;
	}

	public String getToStationName() {
		return toStationName;
	}

	public void setToStationName(String toStationName) {
		this.toStationName = toStationName;
	}

	public Date getPleaveDt() {
		return pleaveDt;
	}

	public void setPleaveDt(Date pleaveDt) {
		this.pleaveDt = pleaveDt;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public Date getTicketConfirmDate() {
		return ticketConfirmDate;
	}

	public void setTicketConfirmDate(Date ticketConfirmDate) {
		this.ticketConfirmDate = ticketConfirmDate;
	}

	public long getExOrderIdIndex() {
		return exOrderIdIndex;
	}

	public void setExOrderIdIndex(long exOrderIdIndex) {
		this.exOrderIdIndex = exOrderIdIndex;
	}

	public String getRtorderId() {
		return rtorderId;
	}

	public void setRtorderId(String rtorderId) {
		this.rtorderId = rtorderId;
	}

	public String getRtorderCode() {
		return rtorderCode;
	}

	public void setRtorderCode(String rtorderCode) {
		this.rtorderCode = rtorderCode;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getToStationId() {
		return toStationId;
	}

	public void setToStationId(String toStationId) {
		this.toStationId = toStationId;
	}

	public String getTicketRecStatus() {
		return ticketRecStatus;
	}

	public void setTicketRecStatus(String ticketRecStatus) {
		this.ticketRecStatus = ticketRecStatus;
	}

	public Date getTicketRecDate() {
		return ticketRecDate;
	}

	public void setTicketRecDate(Date ticketRecDate) {
		this.ticketRecDate = ticketRecDate;
	}

	public String getOrderPackageId() {
		return orderPackageId;
	}

	public void setOrderPackageId(String orderPackageId) {
		this.orderPackageId = orderPackageId;
	}

	public String getIsTestOrder() {
		return isTestOrder;
	}

	public void setIsTestOrder(String isTestOrder) {
		this.isTestOrder = isTestOrder;
	}
}
