package com.bankingapplication.account;

import java.util.List;
import java.util.Scanner;

import com.bankingapplication.dto.TransHistory;
import com.bankingapplication.dto.UserDetail;

public class AccountView {
	private AccountModel accountModel;
	private Scanner scan = new Scanner(System.in);

	public AccountView() {
		accountModel = new AccountModel(this);
	}

	public void accountPage(int userId) {
		int input;
		System.out.println("Welcome userId...");
		System.out.println("1-Profile View");
		System.out.println("2-Money Transfer");
		System.out.println("3- Tranasaction History");
		System.out.println("4-Exit application");
		input = scan.nextInt();

		switch (input) {
		case 1:
			UserDetail userDetail = accountModel.profileView(userId);
			System.out.println(userDetail);
			optionCheck(userId);
			break;
		case 2:
			moneyTransfer(userId);
			optionCheck(userId);
			break;
		case 3:
			List<TransHistory> transHistory = accountModel.transHistory(userId);
			for (TransHistory trans : transHistory) {
				System.out.println(trans);
			}
			optionCheck(userId);
			break;
		case 4:
			System.out.println("Thank you for Visiting");
			break;
		default:
			System.out.println("Invaild option. Please choose correct option");
			accountPage(userId);
			break;
		}
	}

	private void optionCheck(int userId) {
		System.out.println("Do you want to continue? Y or N");
		{
			char option = scan.next().charAt(0);
			if (option == 'Y') {
				accountPage(userId);
			} else {
				System.out.println("Thank you for Visiting!!");
			}
		}
	}

	private void moneyTransfer(int userId) {
		System.out.println("Please enter the Account No. you want to transfer..");
		long tranAccountNo = scan.nextLong();
		System.out.println("Enter the amount you  want to transfer..");
		double tranMoney = scan.nextDouble();
		if (accountModel.moneyTransfer(tranAccountNo, tranMoney, userId)) {
			System.out.println("Money has been transfered successfully");
		} else {
			System.out.println("You dont have required money to transfer.");
		}
	}
}
