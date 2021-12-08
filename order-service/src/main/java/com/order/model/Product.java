package com.order.model;

public class Product {

	private int productId;
	private String productName;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	public Product() {
		super();
	}
	
	
}
