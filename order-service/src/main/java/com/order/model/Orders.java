package com.order.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
@Document("OrderCollection")
public class Orders {

	@Id
	private int orderId;
	@JsonFormat(pattern="yyyy-MM-dd") 
	private LocalDate orderDate;
	private int customerId;
	private double amountPaid;
	private String modeOfPayment;
	private String orderStatus;
	private int quantity;
	
	private List<Product> products=new ArrayList<>();
	private List<Address> address=new ArrayList<>();
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderDate=" + orderDate + ", customerId=" + customerId
				+ ", amountPaid=" + amountPaid + ", modeOfPayment=" + modeOfPayment + ", orderStatus=" + orderStatus
				+ ", quantity=" + quantity + ", getOrderId()=" + getOrderId() + ", getOrderDate()=" + getOrderDate()
				+ ", getCustomerId()=" + getCustomerId() + ", getAmountPaid()=" + getAmountPaid()
				+ ", getModeOfPayment()=" + getModeOfPayment() + ", getOrderStatus()=" + getOrderStatus()
				+ ", getQuantity()=" + getQuantity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Orders(int orderId, LocalDate orderDate, int customerId, double amountPaid, String modeOfPayment,
			String orderStatus, int quantity, List<Product> products, List<Address> address) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.customerId = customerId;
		this.amountPaid = amountPaid;
		this.modeOfPayment = modeOfPayment;
		this.orderStatus = orderStatus;
		this.quantity = quantity;
		this.products = products;
		this.address = address;
	}
	public Orders() {
		super();
	}
	public Orders(int i, String string, int j, double d, String string2, String string3, int k, int l, String string4,
			int m, String string5, int n, int o, String string6, String string7, int p) {
		// TODO Auto-generated constructor stub
	}
	public Orders(int orderId2, int orderDate, int customerId2, double amountPaid2, String modeOfPayment2,
			String orderStatus2, int quantity2, List<Product> asList, List<Object> asList2) {
		// TODO Auto-generated constructor stub
	}
	 
	
	
	
}
