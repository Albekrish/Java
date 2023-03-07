package com.albekrish.libmanagementabstract.login;

public interface LoginModelControlerCallBack {
	void loginSuccess(String userName);
	void loginFailure(String errorMessage);	
}
