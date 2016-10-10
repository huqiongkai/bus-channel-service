/**
 * 
 */
package com.shbus.easybus.data.vo;

import java.io.Serializable;
import java.util.List;

import com.shbus.easybus.thrift.front.PsgInfo;

/**
 * @author Administrator
 *
 */
public class ExBusOrderReqBasic implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 140989478607552800L;

	private String rtOrderId;
	private int totalPrice;
	private int ticketCount;
	private String pleaveDtyyyyMMddHHmmss;
	private int ticketPrice;
	private String exOrderId;
	private String unitId;
	private String toStationId;
	private String isTestOrder;
	
	private List<PsgInfo> psgList;

	public String getRtOrderId() {
		return rtOrderId;
	}

	public void setRtOrderId(String rtOrderId) {
		this.rtOrderId = rtOrderId;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getTicketCount() {
		return ticketCount;
	}

	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}

	public String getPleaveDtyyyyMMddHHmmss() {
		return pleaveDtyyyyMMddHHmmss;
	}

	public void setPleaveDtyyyyMMddHHmmss(String pleaveDtyyyyMMddHHmmss) {
		this.pleaveDtyyyyMMddHHmmss = pleaveDtyyyyMMddHHmmss;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getExOrderId() {
		return exOrderId;
	}

	public void setExOrderId(String exOrderId) {
		this.exOrderId = exOrderId;
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

	public String getIsTestOrder() {
		return isTestOrder;
	}

	public void setIsTestOrder(String isTestOrder) {
		this.isTestOrder = isTestOrder;
	}

	public List<PsgInfo> getPsgList() {
		return psgList;
	}

	public void setPsgList(List<PsgInfo> psgList) {
		this.psgList = psgList;
	}
	
}
