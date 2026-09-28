package com.rays.form;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SalaryDTO;

public class SalaryForm extends BaseForm {

	private String employeeName;
	private String salary;
	private String salaryMonth;
	private String paymentDate;
	private String paymentMode;
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
	public BaseDTO getDto() {
		
		SalaryDTO dto = (SalaryDTO) initDTO(new SalaryDTO());
		
		dto.setId(id);
		dto.setEmployeeName(employeeName);
		dto.setSalary(salary);
		dto.setSalaryMonth(salaryMonth);
		dto.setPaymentDate(paymentDate);
		dto.setPaymentMode(paymentMode);
		dto.setStatus(status);
		
		return dto;
		
	}

}
