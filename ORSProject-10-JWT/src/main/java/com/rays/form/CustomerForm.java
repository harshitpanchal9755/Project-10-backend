package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CustomerDTO;

public class CustomerForm extends BaseForm {

	@NotEmpty(message = "CustomerName is Required")
	private String customerName;
	@NotEmpty(message = "Email is Required")
	private String email;
	@NotEmpty(message = "PhoneNumber is Required")
	private String phoneNumber;
	@NotEmpty(message = "Address is Required")
	private String address;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public BaseDTO getDto() {

		CustomerDTO dto = (CustomerDTO) initDTO(new CustomerDTO());

		dto.setId(id);
		dto.setCustomerName(customerName);
		dto.setEmail(email);
		dto.setPhoneNumber(phoneNumber);
		dto.setAddress(address);
		return dto;
	}

}
