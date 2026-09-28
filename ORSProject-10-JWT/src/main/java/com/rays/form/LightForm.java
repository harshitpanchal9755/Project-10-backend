package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LightDTO;

public class LightForm extends BaseForm {

	@NotEmpty(message = "LightCode is Required")
	private String lightCode;
	@NotEmpty(message = "RoomName is Required")
	private String roomName;
	@NotEmpty(message = "BrightnessLevel is Required")
	private String brightnessLevel;
	@NotEmpty(message = "Status is Required")
	private String Status;

	public String getLightCode() {
		return lightCode;
	}

	public void setLightCode(String lightCode) {
		this.lightCode = lightCode;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getBrightnessLevel() {
		return brightnessLevel;
	}

	public void setBrightnessLevel(String brightnessLevel) {
		this.brightnessLevel = brightnessLevel;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public BaseDTO getDto() {
		LightDTO dto = (LightDTO) initDTO(new LightDTO());
		dto.setId(id);
		dto.setLightCode(lightCode);
		dto.setRoomName(roomName);
		dto.setStatus(Status);
		return dto;
	}

}
