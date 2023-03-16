package com.bankingapplication.admin;

import java.util.List;

import com.bankingapplication.dto.Admin;
import com.bankingapplication.dto.User;
import com.bankingapplication.dto.UserDetail;

public class AdminController implements AdminControllerCallBack {

	private AdminViewCallBack adminView;
	private AdminModelCallBack adminModel;

	public AdminController(AdminView adminView) {
		this.adminView = adminView;
		this.adminModel = new AdminModel(this);
	}

	@Override
	public User getUser(int userId) {
		return adminModel.getUser(userId);
	}

	@Override
	public Admin addNewAdmin(String userName) {
		return adminModel.addNewAdmin(userName);
	}

	@Override
	public List<UserDetail> getUserDetails() {
		return adminModel.getUserDetails();
	}

}
