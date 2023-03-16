package com.bankingapplication.dto;

import java.util.Date;

public class UserDetail {
	private int userId;
	private String userName;
	private char gender;
	private String dob;
	private long phNo;
	private long adhaarNo;
	private String mailId;
	private String panNo;
	private String street;
	private String city;
	private String state;
	private int pincode;
	private long accountNo;
	private final String ifsc = "SBIN0011753";

	public UserDetail(int userId, String userName, char gender, String dob, long phNo, long adhaarNo, String mailId,
			String panNo, String street, String city, String state, int pincode, long accountNo) {
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
		this.dob = dob;
		this.phNo = phNo;
		this.adhaarNo = adhaarNo;
		this.mailId = mailId;
		this.panNo = panNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.accountNo = accountNo;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public long getAdhaarNo() {
		return adhaarNo;
	}

	public void setAdhaarNo(long adhaarNo) {
		this.adhaarNo = adhaarNo;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
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

	@Override
	public String toString() {
		String result = "CustomerId: " + userId + " Account No: " + accountNo + " UserName: " + userName + " Gender: "
				+ gender + " DOB: " + dob + " Phone No.: " + phNo + " Aadhaar No.: " + adhaarNo;
		String result1 = " Mail Id: " + mailId + " Pan No.: " + panNo + " Street: " + street + " City:" + city + " State: "
				+ state + " Pincode: " + pincode + " IFSC: " + ifsc;
		return result + result1;
	}

}
