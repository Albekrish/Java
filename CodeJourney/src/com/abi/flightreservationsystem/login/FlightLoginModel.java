package com.abi.flightreservationsystem.login;

import com.abi.flightreservationsystem.Repository.FlightRepository;

public class FlightLoginModel implements FlightLoginModelCallBack {
	private FlightLoginModelControlerCallBack loginController;

	public FlightLoginModel(FlightLoginModelControlerCallBack loginController) {
		this.loginController = loginController;
	}

	@Override
	public void checkCredentials(String userName, String password) {
		if (FlightRepository.getInstance().checkValidUser(userName, password)) {
			loginController.loginSuccess(userName);
		} else {
			loginController.loginFailed("\nInvalid Credentials. Please try again!\n");
		}

	}

	@Override
	public void adminCheckCredentials(String userName, String password) {
		if (FlightRepository.getInstance().checkValidAdmin(userName, password)) {
			loginController.loginSuccess(userName);
		} else {
			loginController.loginFailed("\nInvalid Credentials. Please try again!\n");
		}

	}

	@Override
	public void newUser(String userName, String password) {
		if (FlightRepository.getInstance().addUser(userName, password)) {
			loginController.loginSuccess(userName);
		} else {
			loginController.loginFailed("\nInvalid Credentials. Please try again!\n");
		}

	}

	public interface FlightLoginModelControlerCallBack {
		void loginSuccess(String user);

		void loginFailed(String errormessage);
	}
}
