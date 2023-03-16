package com.bankingapplication.dto;

public class Admin {
	private String userName;
	private String password;
	private long userId;

	public Admin(String userName, String password, long userId) {
		this.userName = userName;
		this.password = password;
		this.userId = userId;
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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
}
