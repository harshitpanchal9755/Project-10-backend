package com.rays.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "car")
public class CarDto extends BaseDTO {
	
	private String carname;
	private String showroom;
	private String location;
	
	public String getCarName() {
		return carname;
	}
	public void setCarName(String carname) {
		this.carname = carname;
	}
	public String getShowroom() {
		return showroom;
	}
	public void setShowroom(String showroom) {
		this.showroom = showroom;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "carname";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return "carname";
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "car";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "car";
	}
	
	

}
