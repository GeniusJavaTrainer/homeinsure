package com.cg.hims.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class PolicyHolder extends AbstractUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5548252353873026954L;
	@Id
	private int policyHolderId;
	private String policyHolderName;
	private String policyName;
	private String premiumType;
	private String creditCard;
	private String dob;
	private String occupation;
	private double annualIncome;
	private String isRetired;
	private String ssn;
	private String emailId;
	private int policyId;
	private HomeAddress address;
	public PolicyHolder() {
		super();
	}
	public PolicyHolder(int policyHolderId, String policyHolderName, String policyName, String premiumType,
			String creditCard, String dob, String occupation, double annualIncome, String isRetired, String ssn,
			String emailId, int policyId, HomeAddress address) {
		super();
		this.policyHolderId = policyHolderId;
		this.policyHolderName = policyHolderName;
		this.policyName = policyName;
		this.premiumType = premiumType;
		this.creditCard = creditCard;
		this.dob = dob;
		this.occupation = occupation;
		this.annualIncome = annualIncome;
		this.isRetired = isRetired;
		this.ssn = ssn;
		this.emailId = emailId;
		this.policyId = policyId;
		this.address = address;
	}
	public int getPolicyHolderId() {
		return policyHolderId;
	}
	public void setPolicyHolderId(int policyHolderId) {
		this.policyHolderId = policyHolderId;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPremiumType() {
		return premiumType;
	}
	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getIsRetired() {
		return isRetired;
	}
	public void setIsRetired(String isRetired) {
		this.isRetired = isRetired;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public HomeAddress getAddress() {
		return address;
	}
	public void setAddress(HomeAddress address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "PolicyHolder [policyHolderId=" + policyHolderId + ", policyHolderName=" + policyHolderName
				+ ", policyName=" + policyName + ", premiumType=" + premiumType + ", creditCard=" + creditCard
				+ ", dob=" + dob + ", occupation=" + occupation + ", annualIncome=" + annualIncome + ", isRetired="
				+ isRetired + ", ssn=" + ssn + ", emailId=" + emailId + ", policyId=" + policyId + ", address="
				+ address + "]";
	}
	
}
