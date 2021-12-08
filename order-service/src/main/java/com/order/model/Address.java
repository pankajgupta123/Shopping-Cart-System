package com.order.model;

public class Address {

	private int customerId;
	private String fullName;
	private String mobileNum;
	private String houseNo;
	private String city;
	private String state;
	private String pincode;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [customerId=" + customerId + ", fullName=" + fullName + ", mobileNum=" + mobileNum
				+ ", houseNo=" + houseNo + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	public Address(int customerId, String fullName, String mobileNum, String houseNo, String city, String state,
			String pincode) {
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.mobileNum = mobileNum;
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	
	
	
}
