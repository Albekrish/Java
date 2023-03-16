package com.bankingapplication.dto;

public class User {
	private String password;
	private long userId;

	public User(long userId, String password) {
		this.password = password;
		this.userId = userId;
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
