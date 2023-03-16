package com.mailapplication.login;

public interface LoginViewCallBack {

	void errorMessage(String string);

	void loginIndex();

	void exitMethod();

	void checkContinue();

	String getUserName();

	String getPassword();

	void getDetails();

	void callSendReceive(String mailId);

}
