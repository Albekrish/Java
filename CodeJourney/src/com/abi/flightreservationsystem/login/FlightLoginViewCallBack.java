package com.abi.flightreservationsystem.login;

public interface FlightLoginViewCallBack {
	void loginSuccess(String user);

	void loginFailed(String errormessage);
}
