package com.rays.dto;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "vehicle")
public class VehicleDTO extends BaseDTO {
	
	@Column(name = "VehicleName", length = 45)
	private String vehicleName;
	@Column(name = "Model", length = 45)
	private String model;
	@Column(name = "Color", length = 45)
	private String color;
	

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "vehicleName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return vehicleName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "vehicle";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "vehicle";
	}
	

}
