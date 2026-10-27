package com.rays.dto;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "food_order")
public class FoodOrderDto extends BaseDTO {

	private String customerName;
	private String foodItem;
	private int quantity;
	private double totalAmount;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getFoodIntem() {
		return foodItem;
	}

	public void setFoodIntem(String foodItem) {
		this.foodItem = foodItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String getValue() {
		return "customerName";
	}

	@Override
	public String getUniqueKey() {
		return "customerName";
	}

	@Override
	public String getUniqueValue() {
		return "customerName";
	}

	@Override
	public String getLabel() {
		return "food_order";
	}

	@Override
	public String getTableName() {
		return "food_order";
	}

}
