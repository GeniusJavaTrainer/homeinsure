package com.cg.hims.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Agent extends AbstractUser implements Serializable{
	
	/**
	 * 
	 */
	@Id
	private static final long serialVersionUID = -3277256898560568108L;
	
	public Agent() {
		super();
	}
	
	private int agentId;
	private String agentName;
	private String designation;
	private String salary; 
	private String address;
	private String email;
	private String mobileNo;
	
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
	private List<PolicyHolder> policyHoldersList;
	private List<Policy> policies;
	
	public Agent(int agentId, String agentName, String designation, String salary, String address, String email,
			String mobileNo, List<PolicyHolder> policyHoldersList, List<Policy> policies) {
		super();
		this.agentId = agentId;
		this.agentName = agentName;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
		this.email = email;
		this.mobileNo = mobileNo;
		this.policyHoldersList = policyHoldersList;
		this.policies = policies;
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public List<PolicyHolder> getPolicyHoldersList() {
		return policyHoldersList;
	}
	public void setPolicyHoldersList(List<PolicyHolder> policyHoldersList) {
		this.policyHoldersList = policyHoldersList;
	}
	public List<Policy> getPolicies() {
		return policies;
	}
	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", agentName=" + agentName + ", designation=" + designation + ", salary="
				+ salary + ", address=" + address + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", policyHoldersList=" + policyHoldersList + ", policies=" + policies + "]";
	}
	
	
	
	

}
