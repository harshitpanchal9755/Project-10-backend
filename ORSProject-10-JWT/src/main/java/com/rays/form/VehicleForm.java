package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.VehicleDTO;

public class VehicleForm extends BaseForm {
	@NotEmpty(message = "VehicleName is Required")
	private String vehicleName;
	
	@NotEmpty(message = "Model is Required")
	private String model;
	
	@NotEmpty(message = "Color is Required")
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
	public BaseDTO getDto() {
		VehicleDTO dto = (VehicleDTO) initDTO(new VehicleDTO());
		dto.setId(id);
		dto.setVehicleName(vehicleName);
		dto.setModel(model);
		dto.setColor(color);
		return dto;
	}
}
