package com.cg.hims.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Quote implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6169982377524818344L;
	@Id
	private int quoteId;
	private String premiumType;
	private double premium;
	private double dwellingCoverage;
	private double detachedStructureCoverage;
	private double personalPropertyCoverage;
	private double additionalLivingExpense;
	private double medicalExpense;
	private double deductibleAmount;
	public Quote() {
		super();
	}
	public Quote(int quoteId, String premiumType, double premium, double dwellingCoverage,
			double detachedStructureCoverage, double personalPropertyCoverage, double additionalLivingExpense,
			double medicalExpense, double deductibleAmount) {
		super();
		this.quoteId = quoteId;
		this.premiumType = premiumType;
		this.premium = premium;
		this.dwellingCoverage = dwellingCoverage;
		this.detachedStructureCoverage = detachedStructureCoverage;
		this.personalPropertyCoverage = personalPropertyCoverage;
		this.additionalLivingExpense = additionalLivingExpense;
		this.medicalExpense = medicalExpense;
		this.deductibleAmount = deductibleAmount;
	}
	public int getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(int quoteId) {
		this.quoteId = quoteId;
	}
	public String getPremiumType() {
		return premiumType;
	}
	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public double getDwellingCoverage() {
		return dwellingCoverage;
	}
	public void setDwellingCoverage(double dwellingCoverage) {
		this.dwellingCoverage = dwellingCoverage;
	}
	public double getDetachedStructureCoverage() {
		return detachedStructureCoverage;
	}
	public void setDetachedStructureCoverage(double detachedStructureCoverage) {
		this.detachedStructureCoverage = detachedStructureCoverage;
	}
	public double getPersonalPropertyCoverage() {
		return personalPropertyCoverage;
	}
	public void setPersonalPropertyCoverage(double personalPropertyCoverage) {
		this.personalPropertyCoverage = personalPropertyCoverage;
	}
	public double getAdditionalLivingExpense() {
		return additionalLivingExpense;
	}
	public void setAdditionalLivingExpense(double additionalLivingExpense) {
		this.additionalLivingExpense = additionalLivingExpense;
	}
	public double getMedicalExpense() {
		return medicalExpense;
	}
	public void setMedicalExpense(double medicalExpense) {
		this.medicalExpense = medicalExpense;
	}
	public double getDeductibleAmount() {
		return deductibleAmount;
	}
	public void setDeductibleAmount(double deductibleAmount) {
		this.deductibleAmount = deductibleAmount;
	}
	@Override
	public String toString() {
		return "Quote [quoteId=" + quoteId + ", premiumType=" + premiumType + ", premium=" + premium
				+ ", dwellingCoverage=" + dwellingCoverage + ", detachedStructureCoverage=" + detachedStructureCoverage
				+ ", personalPropertyCoverage=" + personalPropertyCoverage + ", additionalLivingExpense="
				+ additionalLivingExpense + ", medicalExpense=" + medicalExpense + ", deductibleAmount="
				+ deductibleAmount + "]";
	}
	
	
	

}
