package com.core.java.session;

import java.util.Date;

public class DatatypesExamples {

}

//Insurance industry/domain example
class Policy {

	private long policyId;
	private int coverageYears;
	private String type;
	private int noOfYears;
	private Date dueDate;
	private Date startDate;
	private Date expiryDate;
	private long premiumAmount;
	private Date totalPremium;

	public long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}

	public int getCoverageYears() {
		return coverageYears;
	}

	public void setCoverageYears(int coverageYears) {
		this.coverageYears = coverageYears;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfYears() {
		return noOfYears;
	}

	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public long getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(long premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public Date getTotalPremium() {
		return totalPremium;
	}

	public void setTotalPremium(Date totalPremium) {
		this.totalPremium = totalPremium;
	}
}
