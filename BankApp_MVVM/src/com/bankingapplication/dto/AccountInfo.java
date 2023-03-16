package com.bankingapplication.dto;

public class AccountInfo {
	private int userId;
	private long accountNo;
	private final String ifsc = "SBIN0011753";
	private double balance;

	public AccountInfo(int userId, long accountNo, double balance) {
		this.userId = userId;
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfsc() {
		return ifsc;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
