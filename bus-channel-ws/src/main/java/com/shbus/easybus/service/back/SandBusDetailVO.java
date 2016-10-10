/**
 * 
 */
package com.shbus.easybus.service.back;

/**
 * @author Administrator
 *
 */
public class SandBusDetailVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String aboardPlace;
    private String arriveRegionName;
    private String arriveStation;
    private String arriveStationName;
    private String busNum;
    private String busType;
    private String flightOnlineDetailId;
    private String fullTicketPrice;
//    private XMLGregorianCalendar ridingTime;
//    private XMLGregorianCalendar sellTime;
    private String sellUnit;
    private String startStation;
    private String startingTime;
    private String stationId;
    private String ticketRemainNums;
    
	public String getAboardPlace() {
		return aboardPlace;
	}
	public void setAboardPlace(String aboardPlace) {
		this.aboardPlace = aboardPlace;
	}
	public String getArriveRegionName() {
		return arriveRegionName;
	}
	public void setArriveRegionName(String arriveRegionName) {
		this.arriveRegionName = arriveRegionName;
	}
	public String getArriveStation() {
		return arriveStation;
	}
	public void setArriveStation(String arriveStation) {
		this.arriveStation = arriveStation;
	}
	public String getArriveStationName() {
		return arriveStationName;
	}
	public void setArriveStationName(String arriveStationName) {
		this.arriveStationName = arriveStationName;
	}
	public String getBusNum() {
		return busNum;
	}
	public void setBusNum(String busNum) {
		this.busNum = busNum;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getFlightOnlineDetailId() {
		return flightOnlineDetailId;
	}
	public void setFlightOnlineDetailId(String flightOnlineDetailId) {
		this.flightOnlineDetailId = flightOnlineDetailId;
	}
	public String getFullTicketPrice() {
		return fullTicketPrice;
	}
	public void setFullTicketPrice(String fullTicketPrice) {
		this.fullTicketPrice = fullTicketPrice;
	}
	public String getSellUnit() {
		return sellUnit;
	}
	public void setSellUnit(String sellUnit) {
		this.sellUnit = sellUnit;
	}
	public String getStartStation() {
		return startStation;
	}
	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}
	public String getStartingTime() {
		return startingTime;
	}
	public void setStartingTime(String startingTime) {
		this.startingTime = startingTime;
	}
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public String getTicketRemainNums() {
		return ticketRemainNums;
	}
	public void setTicketRemainNums(String ticketRemainNums) {
		this.ticketRemainNums = ticketRemainNums;
	}
    
}
