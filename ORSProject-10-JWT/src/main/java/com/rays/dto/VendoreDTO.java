package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "vendore")
public class VendoreDTO extends BaseDTO {

	@Column(name = "vendore_name", length = 50)
	private String vendoreName;
	
	@Column(name = "mobile_no", length = 50)
	private String mobileNo;
	
	@Column(name = "address", length = 50)
	private String address;
	
	@Column(name = "service_type", length = 50)
	private String serviceType;
	

	public String getVendoreName() {
		return vendoreName;
	}

	public void setVendoreName(String vendoreName) {
		this.vendoreName = vendoreName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "vendoreName"; 
	}

	@Override
	public String getUniqueValue() {
		return "vendoreName";
	}

	@Override
	public String getLabel() {
		return "vendore";
	}

	@Override
	public String getTableName() {
		return "vendore";
	}

}
