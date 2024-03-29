package com.mailapplication.login;

import java.time.LocalDate;

public class LoginControler implements LoginControlerModelCallBack, LoginControlerViewCallBack {

	private LoginViewCallBack loginView;
	private LoginModelCallBack loginModel;

	public LoginControler(LoginView loginView) {
		this.loginView = loginView;
		loginModel = new LoginModel(this);
	}

	@Override
	public void validate(String firstName, String lastName, String dob, String gender, String phoneNo) {
		if (!firstName.matches("[a-zA-Z]+")) {
			loginView.errorMessage("Invalid Name");
		} else if (!lastName.matches("[a-zA-Z]+")) {
			loginView.errorMessage("Invalid Name");
		} else if (!gender.equals("male") && !(gender.equals("female"))) {
			loginView.errorMessage("Enter a valid input");
		} else if (!dob.matches("[0-9]{4}[-?][0-9]{2}[-?][0-9]{2}")) {
			loginView.errorMessage("Invalid DateOfBirth");
		} else if (!phoneNo.matches("[9876]{1}[0-9]+")) {
			loginView.errorMessage("Invalid phoneNo");			
		} else {
			String emailId = loginView.getUserName();
			emailId += "@gmail.com";
			if (loginModel.validate(emailId))// to check unique mailId
			{
				String password = loginView.getPassword();
				if (password.length() < 8) {
					System.out.println("Invalid password");
					loginView.getDetails();
					return;
				}
				loginModel.addNewEmail(emailId, password, firstName, lastName, LocalDate.parse(dob), gender, phoneNo);
				loginView.checkContinue();
			} else {
				System.out.println("Invalid username");
			}
		}

	}

	@Override
	public void continueCheck(String option) {
		if (option.equals("y") || option.equals("Y") || option.equals("yes") || option.equals("YES")) {
			loginView.loginIndex();
		} else {
			loginView.exitMethod();
		}
	}

	@Override
	public void validateMail(String mailId, String password) {
		if (loginModel.validateMail(mailId, password)) {
			loginView.callSendReceive(mailId);
		} else {
			loginView.errorMessage("Invalid username or password");
		}

	}

	@Override
	public boolean forgotPassword(String mailId, String phoneNo) {
		return loginModel.forgotPassword(mailId, phoneNo);

	}

	@Override
	public boolean resetPassword(String mailId, String pw) {
		return loginModel.resetPassword(mailId, pw);

	}
}
