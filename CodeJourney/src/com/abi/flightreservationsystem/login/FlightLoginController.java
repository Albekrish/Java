package com.abi.flightreservationsystem.login;

import com.abi.flightreservationsystem.login.FlightLoginModel.FlightLoginModelControlerCallBack;

public class FlightLoginController implements FlightLoginControllerCallBack, FlightLoginModelControlerCallBack {
	private FlightLoginViewCallBack loginView;
	private FlightLoginModelCallBack loginModel;

	public FlightLoginController(FlightLoginView loginView) {
		this.loginView = loginView;
		this.loginModel = new FlightLoginModel(this);
	}

	@Override
	public void adminCheckCredentials(String userName, String password) {
		loginModel.adminCheckCredentials(userName, password);
	}

	@Override
	public void checkCredentials(String userName, String password) {
		loginModel.checkCredentials(userName, password);
	}

	@Override
	public void newUser(String userName, String password) {
		loginModel.newUser(userName, password);
	}

	@Override
	public void loginSuccess(String user) {
		loginView.loginSuccess(user);
	}

	@Override
	public void loginFailed(String errorMessage) {
		loginView.loginFailed(errorMessage);
	}

}
