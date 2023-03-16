package com.bankingapplication.login;

public interface LoginControllerCallBack {

	boolean adminValidation(int userId, String password);

	boolean customerValidation(int userId, String pw);

	int newUserValidation(String userName, char gender, String dob, long phNo, long adhaarNo, String mailId,
			String panNo, String street, String city, String state, int pincode);

	boolean addNewUser(int userId, String password);

}
