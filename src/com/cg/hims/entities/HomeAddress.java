package com.cg.hims.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class HomeAddress implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4920319438079914200L;
	@Id
	private String residenceType;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zip;
	private String residenceUse;
	public HomeAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HomeAddress(String residenceType, String addressLine1, String addressLine2, String city, String state,
			String zip, String residenceUse) {
		super();
		this.residenceType = residenceType;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.residenceUse = residenceUse;
	}
	public String getResidenceType() {
		return residenceType;
	}
	public void setResidenceType(String residenceType) {
		this.residenceType = residenceType;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getResidenceUse() {
		return residenceUse;
	}
	public void setResidenceUse(String residenceUse) {
		this.residenceUse = residenceUse;
	}
	@Override
	public String toString() {
		return "HomeAddress [residenceType=" + residenceType + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", city=" + city + ", state=" + state + ", zip=" + zip + ", residenceUse="
				+ residenceUse + "]";
	}
	
	
	
}
