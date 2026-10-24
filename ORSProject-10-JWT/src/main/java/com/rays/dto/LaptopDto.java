package com.rays.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "laptop")
public class LaptopDto extends BaseDTO {

	private String branchName;
	private String processor;
	private int ram;
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
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "branchName";
	}

	@Override
	public String getUniqueValue() {
		return "branchName";
	}

	@Override
	public String getLabel() {
		return "laptop";
	}

	@Override
	public String getTableName() {
		return "laptop";
	}

}
