package com.bankingapplication.security;

public abstract class PasswordSecurity {
	static char key = 'm';

	public String encrptKey(String password) {
		String result = "";
		for (int i = 0; i < password.length(); i++) {
			result += (char) (password.charAt(i) + key);

		}
		return result;
	}

	public String decrptKey(String password) {
		String result = "";
		for (int i = 0; i < password.length(); i++) {
			result += (char) (password.charAt(i) - key);
		}
		return result;
	}
}
