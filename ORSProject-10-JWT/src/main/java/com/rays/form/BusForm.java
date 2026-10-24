package com.rays.form;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BusDto;

public class BusForm extends BaseForm {

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
	public BaseDTO getDto() {
		
		BusDto dto = (BusDto) initDTO(new BusDto());
		dto.setId(id);
		dto.setBusName(busName);
		dto.setBusNumber(busNumber);
		dto.setRoute(route);
		dto.setCapacity(capacity);
		
		return dto;
	}

}
