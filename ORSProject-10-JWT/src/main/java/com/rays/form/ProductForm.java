package com.rays.form;

import java.util.Date;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ProductDTO;

public class ProductForm extends BaseForm {

	private String productName;
	private String productCategory;
	private Date orderDate;
	private int price;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public BaseDTO getDto() {
		ProductDTO dto = (ProductDTO) initDTO(new ProductDTO());
		dto.setId(id);
		dto.setProductName(productName);
		dto.setProductCategory(productCategory);
		dto.setOrderDate(orderDate);
		dto.setPrice(price);
		
		return dto;
		
	}

}
