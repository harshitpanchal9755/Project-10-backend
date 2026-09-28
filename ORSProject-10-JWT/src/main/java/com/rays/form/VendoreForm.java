package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.VendoreDTO;

public class VendoreForm extends BaseForm {

	@NotEmpty(message = "VendoreName is Required")
	private String vendoreName;

	@NotEmpty(message = "MobileNo is Required")
	private String mobileNo;

	@NotEmpty(message = "Address is Required")
	private String address;

	@NotEmpty(message = "ServiceType is Required")
	private String serivetype;

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

	public String getSerivetype() {
		return serivetype;
	}

	public void setSerivetype(String serivetype) {
		this.serivetype = serivetype;
	}
	
	@Override
	public BaseDTO getDto() {
		VendoreDTO dto = (VendoreDTO) initDTO(new VendoreDTO());
		dto.setId(id);
		dto.setVendoreName(vendoreName);
		dto.setMobileNo(mobileNo);
		dto.setAddress(address);
		return dto;
	}

}
