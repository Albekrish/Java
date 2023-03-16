package com.bankingapplication.admin;

import java.util.List;

import com.bankingapplication.dto.Admin;
import com.bankingapplication.dto.User;
import com.bankingapplication.dto.UserDetail;

public interface AdminControllerCallBack {

	User getUser(int userId);

	Admin addNewAdmin(String userName);

	List<UserDetail> getUserDetails();

}
