package com.albekrish.libmanagementabstract.login;

public interface LoginViewCallBack {
	void loginSuccess(String userName);
	void loginFailure(String errorMessage);
}
