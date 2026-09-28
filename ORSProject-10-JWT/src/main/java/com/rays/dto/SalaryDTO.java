package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "salary")

public class SalaryDTO extends BaseDTO {

	@Column(name = "employee_name", length = 50)
	private String employeeName;

	@Column(name = "salary", length = 50)
	private String salary;

	@Column(name = "salary_month", length = 50)
	private String salaryMonth;

	@Column(name = "payment_date", length = 50)
	private String paymentDate;

	@Column(name = "payment_mode", length = 50)
	private String paymentMode;

	@Column(name = "status", length = 50)
	private String status;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getSalaryMonth() {
		return salaryMonth;
	}

	public void setSalaryMonth(String salaryMonth) {
		this.salaryMonth = salaryMonth;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
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
		return "salary";
	}

	@Override
	public String getTableName() {
		return "salary";
	}

}
