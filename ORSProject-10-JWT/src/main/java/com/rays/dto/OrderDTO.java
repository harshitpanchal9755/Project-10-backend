package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "orders")
public class OrderDTO extends BaseDTO {

	@Column(name = "OrderName", length = 45)
	private String orderName;
	@Column(name = "Amount", length = 45)
	private Double amount;
	@Column(name = "Status", length = 45)
	private String status;
	@Column(name = "OrderDate", length = 45)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "orderName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return orderName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "order";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "orders";
	}

}
