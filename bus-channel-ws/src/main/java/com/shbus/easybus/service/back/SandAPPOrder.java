/**
 * 
 */
package com.shbus.easybus.service.back;

import java.io.Serializable;

/**
 * @author Administrator
 *
 */
public class SandAPPOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6952751959311478317L;
	private String sandOrderId; // sand订单号
//	private long exBusOrderId; // oracle订单号
	private String exOrderId; // 外部订单号
//	private String psgName; // 订单人姓名
//	private String currentTicketStatus; // 出票状态，默认状态：APP（处理中）
//	private String currentTicketRecStatus; // 取票状态
//	private long channelId; // 订单渠道ID
//	private String channelName; // 渠道名称

	public String getSandOrderId() {
		return sandOrderId;
	}

	public void setSandOrderId(String sandOrderId) {
		this.sandOrderId = sandOrderId;
	}

	public String getExOrderId() {
		return exOrderId;
	}

	public void setExOrderId(String exOrderId) {
		this.exOrderId = exOrderId;
	}

	/*	public String getCurrentTicketStatus() {
		return currentTicketStatus;
	}

	public void setCurrentTicketStatus(String currentTicketStatus) {
		this.currentTicketStatus = currentTicketStatus;
	}

		public String getCurrentTicketRecStatus() {
		return currentTicketRecStatus;
	}

	public void setCurrentTicketRecStatus(String currentTicketRecStatus) {
		this.currentTicketRecStatus = currentTicketRecStatus;
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
	}*/

}
