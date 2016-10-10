/**
 * 
 */
package com.shbus.easybus.backoffice.web;

import java.io.Serializable;

/**
 * @author Administrator
 *
 */
public class OrderQueryParamVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1107752454810019825L;
	
	private String exOrderId;
	private long channelId;
	private String ticketStatus;
	private String ticketRecStatus;
	private String psgName;
	private String psgMobile;
	private String psgCertificateNo;
	private String fromStationId;
	private String toStationName;
	private String isTestOrder;
	
	private String createDateBegin;
	private String createDateEnd;
	
	private String dumpAction;
	private long rowNumBegin;
	private long rowNumEnd;
	
	public long getChannelId() {
		return channelId;
	}
	public void setChannelId(long channelId) {
		this.channelId = channelId;
	}
	public String getDumpAction() {
		return dumpAction;
	}
	public void setDumpAction(String dumpAction) {
		this.dumpAction = dumpAction;
	}
	public long getRowNumBegin() {
		return rowNumBegin;
	}
	public void setRowNumBegin(long rowNumBegin) {
		this.rowNumBegin = rowNumBegin;
	}
	public long getRowNumEnd() {
		return rowNumEnd;
	}
	public void setRowNumEnd(long rowNumEnd) {
		this.rowNumEnd = rowNumEnd;
	}
	public String getExOrderId() {
		return exOrderId;
	}
	public void setExOrderId(String exOrderId) {
		this.exOrderId = exOrderId;
	}
	public void setRowNumEnd(int rowNumEnd) {
		this.rowNumEnd = rowNumEnd;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getTicketRecStatus() {
		return ticketRecStatus;
	}
	public void setTicketRecStatus(String ticketRecStatus) {
		this.ticketRecStatus = ticketRecStatus;
	}
	public String getPsgName() {
		return psgName;
	}
	public void setPsgName(String psgName) {
		this.psgName = psgName;
	}
	public String getPsgMobile() {
		return psgMobile;
	}
	public void setPsgMobile(String psgMobile) {
		this.psgMobile = psgMobile;
	}
	public String getPsgCertificateNo() {
		return psgCertificateNo;
	}
	public void setPsgCertificateNo(String psgCertificateNo) {
		this.psgCertificateNo = psgCertificateNo;
	}
	public String getFromStationId() {
		return fromStationId;
	}
	public void setFromStationId(String fromStationId) {
		this.fromStationId = fromStationId;
	}
	public String getToStationName() {
		return toStationName;
	}
	public void setToStationName(String toStationName) {
		this.toStationName = toStationName;
	}
	public String getIsTestOrder() {
		return isTestOrder;
	}
	public void setIsTestOrder(String isTestOrder) {
		this.isTestOrder = isTestOrder;
	}
	public String getCreateDateBegin() {
		return createDateBegin;
	}
	public void setCreateDateBegin(String createDateBegin) {
		this.createDateBegin = createDateBegin;
	}
	public String getCreateDateEnd() {
		return createDateEnd;
	}
	public void setCreateDateEnd(String createDateEnd) {
		this.createDateEnd = createDateEnd;
	}
	
}
