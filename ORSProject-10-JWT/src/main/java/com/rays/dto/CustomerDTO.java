package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "customer")
public class CustomerDTO extends BaseDTO {

	@Column(name = "customer_name", length = 50)
	private String customerName;
	@Column(name = "email", length = 50)
	private String email;
	@Column(name = "phone_name", length = 50)
	private String phoneNumber;
	@Column(name = "address", length = 50)
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
	public String getValue() {
		return null;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "customerName";
	}

	@Override
	public String getUniqueValue() {
		return "customerName";
	}

	@Override
	public String getLabel() {
		return "customer";
	}

	@Override
	public String getTableName() {
		return "customer";
	}

}
