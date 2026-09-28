package com.rays.form;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SmartParkingDTO;

public class smartParkingForm extends BaseForm {

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
	public BaseDTO getDto() {
		SmartParkingDTO dto = (SmartParkingDTO) initDTO(new SmartParkingDTO());
		dto.setId(id);
		dto.setVehicleName(vehicleName);
		dto.setVehicleNumber(vehicleNumber);
		dto.setVehicleType(vehicleType);
		dto.setEntryTime(entryTime);
		return dto;

	}

}
