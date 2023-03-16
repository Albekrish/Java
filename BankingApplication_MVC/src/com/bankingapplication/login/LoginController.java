package com.bankingapplication.login;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginController implements LoginControllerCallBack {
	private LoginViewCallBack loginView;
	private LoginModelCallBack loginModel;

	public LoginController(LoginView loginView) {
		this.loginView = loginView;
		this.loginModel = new LoginModel(this);
	}

	public boolean adminValidation(int userId, String password) {
		return loginModel.adminValidation(userId, password);
	}

	@Override
	public boolean customerValidation(int userId, String password) {
		return loginModel.customerValidation(userId, password);
	}

	@Override
	public int newUserValidation(String userName, char gender, String dob, long phNo, long adhaarNo, String mailId,
			String panNo, String street, String city, String state, int pincode) {
		// String to Date format
//		Date date = null;
//		SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy");
//		try {
//			date=format.parse(dob);
//		} catch (ParseException e) {			
//			e.printStackTrace();
//		}

		int phNolen = String.valueOf(phNo).length();
		int adhaarNolen = String.valueOf(adhaarNo).length();
		int panNolen = String.valueOf(phNolen).length();
		return loginModel.newUserValidation(userName, gender, dob, phNo, adhaarNo, mailId, panNo, street, city, state,
				pincode);

	}

	@Override
	public boolean addNewUser(int userId, String password) {
		return loginModel.addNewUser(userId, password);
	}

}
