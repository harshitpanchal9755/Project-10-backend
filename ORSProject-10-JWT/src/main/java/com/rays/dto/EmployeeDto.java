package com.rays.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "employee")
public class EmployeeDto extends BaseDTO {

	private String employeeName;
	private String company;
	private String salary;
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
	public String getValue() {
		// TODO Auto-generated method stub
		return "employeeName";
	}

	@Override
	public String getUniqueKey() {
		return "employeeName";
	}

	@Override
	public String getUniqueValue() {
		return "employeeName";
	}

	@Override
	public String getLabel() {
		return "employee";
	}

	@Override
	public String getTableName() {
		return "employee";
	}

}
