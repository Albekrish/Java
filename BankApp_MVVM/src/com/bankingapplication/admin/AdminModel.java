package com.bankingapplication.admin;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

import com.bankingapplication.dto.Admin;
import com.bankingapplication.dto.User;
import com.bankingapplication.dto.UserDetail;
import com.bankingapplication.repository.Repository;

public class AdminModel {
	private AdminView adminView;

	public AdminModel(AdminView adminView) {
		this.adminView = adminView;
	}

	
	public User getUser(int userId) {
		return Repository.getInstance().getUser(userId);
	}

	
	public Admin addNewAdmin(String userName) {
		int userId = createUserId(userName);
		String password = createPassword(userId);
		return Repository.getInstance().addNewAdmin(userName, password, userId);
	}

	
	public List<UserDetail> getUserDetails() {
		return Repository.getInstance().getUserDetails();
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

}
