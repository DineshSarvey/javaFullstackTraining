package com.wf.training.UserInfo;

public class User {

	String userID;
	String password;
	int userType; //0-Admin, 1-Backofficerep, 2-Investor
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	
	public void register(String uid, String pwd) {
		this.setUserID(uid);
		this.setPassword(pwd);
	}
	
}
