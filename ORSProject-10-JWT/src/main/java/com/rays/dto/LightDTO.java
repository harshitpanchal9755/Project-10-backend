package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "light")
public class LightDTO extends BaseDTO {

	@Column(name = "light_code", length = 50)
	private String lightCode;
	@Column(name = "room_light", length = 50)
	private String roomName;
	@Column(name = "brightness_level", length = 50)
	private String brightnessLevel;
	@Column(name = "status", length = 50)
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
	public String getValue() {
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "roomName";
	}

	@Override
	public String getUniqueValue() {
		return "roomName";
	}

	@Override
	public String getLabel() {
		return "light";
	}

	@Override
	public String getTableName() {
		return "light";
	}

}
