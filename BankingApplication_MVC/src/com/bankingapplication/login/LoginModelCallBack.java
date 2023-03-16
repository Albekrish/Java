package com.bankingapplication.login;

import java.util.Date;

public interface LoginModelCallBack {

	boolean adminValidation(int userId, String password);

	boolean customerValidation(int userId, String password);

	int newUserValidation(String userName, char gender, String dob, long phNo, long adhaarNo, String mailId,
			String panNo, String street, String city, String state, int pincode);

	boolean addNewUser(int userId, String password);

}
