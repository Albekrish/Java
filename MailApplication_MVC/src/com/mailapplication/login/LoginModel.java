package com.mailapplication.login;

import java.time.LocalDate;

import com.mailapplication.repository.Repository;

public class LoginModel implements LoginModelCallBack {

	private LoginControlerModelCallBack loginControler;

	public LoginModel(LoginControler loginControler) {
		this.loginControler = loginControler;
	}

	@Override
	public boolean validate(String emailId) {
		return Repository.getInstance().checkNewEmail(emailId);
	}

	@Override
	public boolean addNewEmail(String emailId, String password, String firstName, String lastName, LocalDate dob,
			String gender, String phoneNo) {
		return Repository.getInstance().addNewUser(emailId, password, firstName, lastName, dob, gender, phoneNo);

	}

	@Override
	public boolean validateMail(String mailId, String password) {
		return Repository.getInstance().validateMail(mailId, password);
	}

	@Override
	public boolean forgotPassword(String mailId, String phoneNo) {
		return Repository.getInstance().forgotPassword(mailId, phoneNo);

	}

	@Override
	public boolean resetPassword(String mailId, String pw) {
		return Repository.getInstance().resetPassword(mailId, pw);
	}

}
