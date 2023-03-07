package com.abi.flightreservationsystem.login;

public interface FlightLoginControllerCallBack {

	void checkCredentials(String userName, String password);

	void newUser(String userName, String password);

	void adminCheckCredentials(String userName, String password);
}
