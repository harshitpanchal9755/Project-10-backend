package com.rays.form;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.FoodOrderDto;

public class FoodOrderForm extends BaseForm {

	@NotBlank(message = "Customer name is required")
	private String customerName;

	@NotBlank(message = "Food item is required")
	private String foodItem;

	@Min(value = 1, message = "Quantity must be at least 1")
	private int quantity;

	@NotNull(message = "Total amount is required")
	@DecimalMin(value = "0.01", message = "Total amount must be greater than 0")
	private Double totalAmount;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getFoodIntem() {
		return foodIntem;
	}

	public void setFoodIntem(String foodIntem) {
		this.foodIntem = foodIntem;
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
	public BaseDTO getDto() {
		
		FoodOrderDto dto = (FoodOrderDto) initDTO(new FoodOrderDto());
		
		dto.setId(id);
		dto.setCustomerName(customerName);
		dto.setFoodIntem(foodItem);
		dto.setQuantity(quantity);
		dto.setTotalAmount(quantity);
		
		return dto;
	}

}
