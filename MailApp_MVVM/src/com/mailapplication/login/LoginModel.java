package com.mailapplication.login;

import java.time.LocalDate;

import com.mailapplication.repository.Repository;

public class LoginModel{

	private LoginView loginView;

	public LoginModel(LoginView loginView) {
		this.loginView = loginView;
	}

	public boolean validate(String emailId) {
		return Repository.getInstance().checkNewEmail(emailId);
	}

	public boolean addNewEmail(String emailId, String password, String firstName, String lastName, LocalDate dob,
			String gender, String phoneNo) {
		return Repository.getInstance().addNewUser(emailId, password, firstName, lastName, dob, gender, phoneNo);

	}

	public boolean validateMail(String mailId, String password) {
		return Repository.getInstance().validateMail(mailId, password);
	}

	public boolean forgotPassword(String mailId, String phoneNo) {
		return Repository.getInstance().forgotPassword(mailId, phoneNo);

	}

	public boolean resetPassword(String mailId, String pw) {
		return Repository.getInstance().resetPassword(mailId, pw);
	}

}
