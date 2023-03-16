package com.mailapplication.login;

public interface LoginControlerViewCallBack {

	void validate(String firstName, String lastName, String dob, String gender, String phoneNo);

	void continueCheck(String option);

	void validateMail(String mailId, String password);

	boolean forgotPassword(String mailId, String phoneNo);

	boolean resetPassword(String mailId, String pw);

}
