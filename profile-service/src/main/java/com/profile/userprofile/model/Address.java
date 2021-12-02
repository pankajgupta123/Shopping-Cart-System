package com.profile.userprofile.model;

import java.util.Objects;

public class Address {

	private String houseNo;
	private String streetName;
	private String colonyName;
	private String city;
	private String state;
	private String pincode;
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getColonyName() {
		return colonyName;
	}
	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
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
	public Address(String houseNo, String streetName, String colonyName, String city, String state, String pincode) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.colonyName = colonyName;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, colonyName, houseNo, pincode, state, streetName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(colonyName, other.colonyName)
				&& Objects.equals(houseNo, other.houseNo) && Objects.equals(pincode, other.pincode)
				&& Objects.equals(state, other.state) && Objects.equals(streetName, other.streetName);
	}
	
	
}
