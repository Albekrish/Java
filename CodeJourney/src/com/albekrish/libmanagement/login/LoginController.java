package com.albekrish.libmanagement.login;

public class LoginController {
	private LoginView loginView;
	private LoginModel loginModel;

	public LoginController(LoginView loginView) {
		this.loginView = loginView;
		this.loginModel = new LoginModel(this);
	}

	public void checkCredentialsOnline(String userName, String password) {
		loginModel.checkCredentials(userName, password);
	}

	public void loginSuccess(String userName) {
		loginView.loginSuccess(userName);

	}

	public void loginFailiure(String errorMessage) {
		loginView.loginFailed(errorMessage);

	}

}
