package com.wf.training.Others;

public class Company {

	String code;
	String title;
	String operation;
	int shareCount;
	float sharePrice;
	String sector;
	String currencyPreference;
	float turnoverAmount;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public int getShareCount() {
		return shareCount;
	}
	public void setShareCount(int shareCount) {
		this.shareCount = shareCount;
	}
	public float getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(float sharePrice) {
		this.sharePrice = sharePrice;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getCurrencyPreference() {
		return currencyPreference;
	}
	public void setCurrencyPreference(String currencyPreference) {
		this.currencyPreference = currencyPreference;
	}
	public float getTurnoverAmount() {
		return turnoverAmount;
	}
	public void setTurnoverAmount(float turnoverAmount) {
		this.turnoverAmount = turnoverAmount;
	}

	public void getCompleteProfile() {}
}
