package com.rays.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "smartparking")
public class SmartParkingDTO extends BaseDTO {

	private String vehicleName;
	private String vehicleNumber;
	private String vehicleType;
	private String entryTime;

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		return  "vehicleName";
	}

	@Override
	public String getUniqueValue() {
		return "vehicleName";
	}

	@Override
	public String getLabel() {
		return "smartparking";
	}

	@Override
	public String getTableName() {
		return "smartparking";
	}

}
