package com.cg.hims.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

public abstract class AbstractUser implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8900835335325445335L;
	
	private String userName;
	private String password;
	private String role;
	public AbstractUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AbstractUser(String userName, String password, String role) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", role=" + role + "]";
	}
}
