package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CarDto;

public class CarForm extends BaseForm {

	@NotEmpty(message = "CarName is Required")
	private String carname;
	
	@NotEmpty(message = "ShowRoom is Required")
	private String showroom;
	
	@NotEmpty(message = "Location is Required")
	private String location;

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
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
	public BaseDTO getDto() {
		CarDto dto = (CarDto) initDTO(new CarDto());
		
		dto.setId(id);
		dto.setCarName(carname);
		dto.setShowroom(showroom);
		dto.setLocation(location);
		return dto;
	}

}
