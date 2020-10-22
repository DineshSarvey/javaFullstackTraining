package com.wf.training.UserInfo;

import com.wf.training.Others.Trader;

public class Investor extends User implements Trader{
	
	float investedAmount;
	float earnedAmount;
	String currencyPreference;

	public void setInvestedAmount(float amount) {}
	
	public void setEarnedAmount(float amount) {}
	
	public void setCurrencyPreference(String pref) {}
	
	public float getInvestedAmount() {
		return this.investedAmount;
	}
	
	public float getEarnedAmount() {
		return this.earnedAmount;
	}
	
	public String getCurrencyPreference() {
		return this.currencyPreference;
	}
	
	public void addBonus() {}

}
