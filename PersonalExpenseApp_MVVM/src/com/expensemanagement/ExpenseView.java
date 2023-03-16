package com.expensemanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import com.expensemanagement.dto.Expense;
import com.expensemanagement.dto.Wallet;

public class ExpenseView{
	private ExpenseModel expenseModel;
	private Scanner scan = new Scanner(System.in);
	private BufferedReader br = null;

	public ExpenseView() throws Exception {
		expenseModel = new ExpenseModel(this);
		br = new BufferedReader(new InputStreamReader(System.in));
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
			if (createWallet()) {
				System.out.println("New Wallet is created");
			} else {
				System.out.println("Failed to create new wallet");
			}
			break;
		case 'I':
			displayWallet();
			break;
		case 'A':
			addExpense();
			break;
		case 'D':
			if (depositCash()) {
				System.out.println("Amount is deposited successfully!!");
			} else {
				System.out.println("Amount NOT deposited!");
			}
			break;
		case 'L':
			listExpenses();
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
	public boolean createWallet() {
		String name;
		float amt;
		try {
			System.out.println("Enter your name: ");
			name = br.readLine();
			System.out.println("Enter your balance: ");
			amt = Float.parseFloat(br.readLine());
			return expenseModel.updateWallet(name, amt);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			return false;
		} catch (Exception ae) {
			System.out.println("Could not create new wallet");
			System.out.println("Error: " + ae.getMessage());
			return false;
		}

	}

	public void displayWallet() {
		System.out.println("----- Wallet Info -----------------");
		Wallet w;
		try {
			w = expenseModel.getWallet();
			System.out.println("\nName of User : " + w.getUserName());
			System.out.println("\nBalance      : " + w.getAmount());
		} catch (Exception e) {
			System.out.println("\nError: " + e.getMessage());
		}
		System.out.println("-----------------------------------");

	}

	public void addExpense() {
		try {
			System.out.print("Enter details of expenses: ");
			String details = br.readLine();
			System.out.print("Enter amount: ");
			float amt = Float.parseFloat(br.readLine());
			expenseModel.addExpense(details, amt);
		} catch (IOException ex) {
		} catch (Exception ap) {
			System.out.println("Error: " + ap.getMessage());
		}

	}

	public boolean depositCash() {
		System.out.println("Enter amount to be deposited: ");
		boolean flag=false;
		try {
			float amt = Float.parseFloat(br.readLine());
			flag= expenseModel.addMoneyToWallet(amt);
		} catch (NumberFormatException e) {
			System.out.println("Error: Please enter amount in digits only");
		} catch (IOException e) {
		} catch (Exception ae) {
			System.out.println("Error: " + ae.getMessage());			
		}
		return flag;
	}

	public void listExpenses() {
		LinkedList<Expense> exps = null;
		try {
			exps = expenseModel.listExpenses();
		} catch (Exception e1) {
			System.out.println("Error: " + e1.getMessage());
		}
		if (exps == null || exps.size() == 0) {
			System.out.println("No Expenses made so far?");
			return;
		}
		String h1 = " Date/Time ";
		String h2 = " Details ";
		String h3 = " Amount ";
		System.out.printf("%n%-32s|%-25s|%15s%n", h1, h2, h3);
		for (Expense e : exps) {
			System.out.println("--------------------------------+-------------------------+---------------------");
			System.out.printf("%-31s |%-24s | %12.2f%n", e.getDate(), e.getDetails(), e.getAmount());
		}
		System.out.println("--------------------------------------------------------------------------------");

	}

}
