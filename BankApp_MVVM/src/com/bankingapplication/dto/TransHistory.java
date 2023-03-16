package com.bankingapplication.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class TransHistory {
	private int userId;
	private String options; // (withdraw/ deposit)
	private long accountFrom;
	private long accountTo;
	private double amount;
	private LocalDate date;
	private LocalTime time;

	public TransHistory(int userId, String options, long accountFrom, long accountTo, double amount, LocalDate date,
			LocalTime time) {
		this.userId = userId;
		this.options = options;
		this.accountFrom = accountFrom;
		this.accountTo = accountTo;
		this.amount = amount;
		this.date = date;
		this.time = time;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public long getAccountFrom() {
		return accountFrom;
	}

	public void setAccountFrom(long accountFrom) {
		this.accountFrom = accountFrom;
	}

	public long getAccountTo() {
		return accountTo;
	}

	public void setAccountTo(long accountTo) {
		this.accountTo = accountTo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		String result = "CustomerId:" + userId + " Account From:" + accountFrom + " Account To:" + accountTo
				+ " Amount:" + amount + " Date:" + date + " Time:" + time + " Option:" + options;
		return result;
	}
}
