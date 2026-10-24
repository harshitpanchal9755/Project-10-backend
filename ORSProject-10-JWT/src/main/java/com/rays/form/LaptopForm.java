package com.rays.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LaptopDto;

public class LaptopForm extends BaseForm {

	@NotNull(message = "BranchName is required")
	private String branchName;
	@NotNull(message = "processor is required")
	private String processor;
	@NotNull(message = "Ram is required")
	@Min(value = 1, message = "ram must be greater than 0")
	private int ram;
	@NotNull(message = "Storage is required")
	@Min(value = 1, message = "Storage must be greater than 0")
	private int storage;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	@Override
	public BaseDTO getDto() {

		LaptopDto dto = (LaptopDto) initDTO(new LaptopDto());

		dto.setId(id);
		dto.setBranchName(branchName);
		dto.setProcessor(processor);
		dto.setRam(ram);
		dto.setStorage(storage);
		return dto;
	}

}
