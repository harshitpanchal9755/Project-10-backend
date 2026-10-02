package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OrderDTO;

public class OrderForm extends BaseForm {

	@NotEmpty(message = "OrderName is Required")
	private String orderName;
	
	@NotNull(message = "Amount is Required")
	@Min(value = 1, message = "Amount must be greater than 0")
	private Double amount;
	
	@NotEmpty(message = "Status is Required")
	private String status;
	
	@NotNull(message = "OrderDate is Required")
	private Date orderDate;

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public BaseDTO getDto() {

		OrderDTO dto = (OrderDTO) initDTO(new OrderDTO());

		dto.setId(id);
		dto.setOrderName(orderName);
		dto.setAmount(amount);
		dto.setOrderDate(orderDate);
		dto.setStatus(status);
		return dto;
	}

}
