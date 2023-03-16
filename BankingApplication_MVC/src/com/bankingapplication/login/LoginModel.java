package com.bankingapplication.login;

import java.math.BigInteger;
import java.util.Date;
import java.util.UUID;

import com.bankingapplication.dto.User;
import com.bankingapplication.dto.UserDetail;
import com.bankingapplication.repository.Repository;
import com.bankingapplication.security.PasswordSecurity;

public class LoginModel extends PasswordSecurity implements LoginModelCallBack {
	private LoginControllerCallBack loginController;

	public LoginModel(LoginControllerCallBack loginController) {
		this.loginController = loginController;
	}

	@Override
	public boolean adminValidation(int userId, String password) {
		String pw = decrptKey(password);
		return Repository.getInstance().checkValidAdmin(userId, pw);
	}

	@Override
	public boolean customerValidation(int userId, String password) {
		String pw = decrptKey(password);
		return Repository.getInstance().customerValidation(userId, pw);
	}

	@Override
	public int newUserValidation(String userName, char gender, String dob, long phNo, long adhaarNo, String mailId,
			String panNo, String street, String city, String state, int pincode) {

		int userId = createUserId(userName);
		String password = createPassword(userId);
		long accountNo = createAccountNo(userId);

		Repository.getInstance().addNewUser(userId, password);
		Repository.getInstance().addNewUserDetail(userId, userName, gender, dob, phNo, adhaarNo, mailId, panNo, street,
				city, state, pincode, accountNo);

		return userId;
	}

	@Override
	public boolean addNewUser(int userId, String password) {
		String pw = decrptKey(password);
		return Repository.getInstance().addNewUser(userId, pw);
	}

	private int createUserId(String userName) {
		String generateUUIDNo = String.format("%010d",
				new BigInteger(UUID.randomUUID().toString().replace("-", ""), 16));
		String custId = generateUUIDNo.substring(generateUUIDNo.length() - 8);
		int userId = Integer.parseInt(custId);
		return userId;
	}

	private String createPassword(long userId) {
		String generateUUIDNo = UUID.randomUUID().toString().replace("-", "");
		String custPassword = generateUUIDNo.substring(generateUUIDNo.length() - 8);
		return custPassword;
	}

	private long createAccountNo(long userId) {
		String generateUUIDNo = String.format("%010d",
				new BigInteger(UUID.randomUUID().toString().replace("-", ""), 16));
		String custId = generateUUIDNo.substring(generateUUIDNo.length() - 12);
		long accountNo = Long.parseLong(custId);
		return accountNo;
	}
}
