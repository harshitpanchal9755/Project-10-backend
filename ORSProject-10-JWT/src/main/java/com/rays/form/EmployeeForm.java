package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.EmployeeDto;

public class EmployeeForm extends BaseForm {

	@NotEmpty(message = "EmployeeName is Required")
	private String employeeName;

	@NotEmpty(message = "Company is Required")
	private String company;

	@NotEmpty(message = "Salary is Required")
	private String salary;

	@NotNull(message = "Dob is Required")
	private Date dob;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public BaseDTO getDto() {

		EmployeeDto dto = new EmployeeDto();
		dto.setId(id);
		dto.setEmployeeName(employeeName);
		dto.setCompany(company);
		dto.setSalary(salary);
		dto.setDob(dob);
		return dto;
	}

}
