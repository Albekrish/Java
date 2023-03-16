package com.expensemanagement;

import java.util.Scanner;

public class ExpenseView implements ExpenseViewCallBack {
	private ExpenseControllerCallBack expenseController;
	private Scanner scan = new Scanner(System.in);

	public ExpenseView() throws Exception {
		expenseController = new ExpenseController(this);
	}

	public static void main(String[] args) throws Exception {
		ExpenseView expenseView = new ExpenseView();
		expenseView.init();
	}

	private void init() {
		System.out.println("--------------- Wallet Manager --------------");
		System.out.println("Please select the correct Option to proceed..");
		System.out.println("C-Create new Wallet");
		System.out.println("I-Get Wallet Info");
		System.out.println("A-Add new expense");
		System.out.println("L-List all expenses");
		System.out.println("D-Deposit amount");
		System.out.println("X-Exit Application");

		char ch = scan.next().charAt(0);
		switch (ch) {
		case 'C':
			if (expenseController.createWallet()) {
				System.out.println("New Wallet is created");
			} else {
				System.out.println("Failed to create new wallet");
			}
			break;
		case 'I':
			expenseController.displayWallet();
			break;
		case 'A':
			expenseController.addExpense();
			break;
		case 'D':
			if (expenseController.depositCash()) {
				System.out.println("Amount is deposited successfully!!");
			} else {
				System.out.println("Amount NOT deposited!");
			}
			break;
		case 'L':
			expenseController.listExpenses();
			break;
		case 'X':
			break;
		default:
			System.out.println("Invalid option. Please try again");
			break;
		}
		System.out.println("Do you wan to continue? Y/N");
		char option = scan.next().charAt(0);
		if (option == 'Y') {
			init();
		} else {
			System.out.println("Thank you!");
		}

	}

}
