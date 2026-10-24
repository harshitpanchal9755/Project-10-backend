package com.rays.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "bus")
public class BusDto extends BaseDTO {

	private String busName;
	private String busNumber;
	private String route;
	private int capacity;

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "busName";
	}

	@Override
	public String getUniqueValue() {
		return "busName";
	}

	@Override
	public String getLabel() {
		return "bus";
	}

	@Override
	public String getTableName() {
		return "bus";
	}

}
