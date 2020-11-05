package com.cg.hims.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Admin extends AbstractUser implements Serializable  {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2502943582620046166L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int adminId;
	private String adminName;
	private String contact;
	
	public Admin() {
		super();
	}

	public Admin(String username, String password, String role, int adminId, String adminName, String contact) {
		super(username, password, role);
		this.adminId = adminId;
		this.adminName = adminName;
		this.contact = contact;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", contact=" + contact + "]";
	}
}