/**
 * 
 */
package com.shbus.easybus.service.back;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.shbus.easybus.FlightInfoBean;

/**
 * @author Administrator
 *
 */
public class SandBusDataCache implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3666215357697477910L;

	private String unitId;
	private String departDateyyyyMMdd;
	private List<FlightInfoBean> busList = new ArrayList<FlightInfoBean>();

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getDepartDateyyyyMMdd() {
		return departDateyyyyMMdd;
	}

	public void setDepartDateyyyyMMdd(String departDateyyyyMMdd) {
		this.departDateyyyyMMdd = departDateyyyyMMdd;
	}

	public List<FlightInfoBean> getBusList() {
		return busList;
	}

	public void setBusList(List<FlightInfoBean> busList) {
		this.busList = busList;
	}
	
	// ------------------- utility methods ------------
	public void addToBusList(FlightInfoBean item) {
		busList.add(item);
	}

}
