package com.bankingapplication.admin;

import java.util.List;
import java.util.Scanner;

import com.bankingapplication.dto.Admin;
import com.bankingapplication.dto.User;
import com.bankingapplication.dto.UserDetail;

public class AdminView {

	private AdminModel adminModel;
	private Scanner scan = new Scanner(System.in);

	public AdminView() {
		adminModel = new AdminModel(this);
	}

	public String approvalNewUser(int userId) {
		User user = adminModel.getUser(userId);
		if (user != null) {
			return user.getPassword();
		} else {
			return "NotApproved";
		}
	}

	public void init(int userId, String password) {
		System.out.println("Welcome Admin!!!");
		System.out.println("1-View Customer Info.");
		System.out.println("2-Add new Admin");
		int input = scan.nextInt();
		switch (input) {
		case 1:
			List<UserDetail> userDetails = adminModel.getUserDetails();
			printUserDetails(userDetails);
			break;
		case 2:
			System.out.println("Enter UserName for new Admin");
			String userName = scan.next();
			Admin admin = adminModel.addNewAdmin(userName);
			System.out.println("New Admin" + userName + " is added successfully!!!");
			System.out.println("Please find below credentials for log-in next time");
			System.out.println("Admin UserId" + admin.getUserId());
			System.out.println("Admin Password" + admin.getPassword());
			break;
		default:
			System.out.println("please enter a valid option");
			init(userId, password);
			break;
		}
		System.out.println("do you want to continue? Y/N");
		char op = scan.next().charAt(0);
		if (op == 'Y') {
			init(userId, password);
		} else {
			System.out.println("Thank you");
		}

	}

	private void printUserDetails(List<UserDetail> userDetails) {
		for (UserDetail userdetail : userDetails) {
			System.out.println(userdetail);
			System.out.println();
		}

	}
}
