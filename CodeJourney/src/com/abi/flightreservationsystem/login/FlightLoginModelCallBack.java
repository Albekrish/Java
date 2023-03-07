package com.abi.flightreservationsystem.login;

public interface FlightLoginModelCallBack {
	void checkCredentials(String userName, String password);

	void newUser(String userName, String password);

	void adminCheckCredentials(String userName, String password);

}
