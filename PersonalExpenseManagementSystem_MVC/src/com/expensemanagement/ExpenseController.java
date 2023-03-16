package com.expensemanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

import com.expensemanagement.dto.Expense;
import com.expensemanagement.dto.Wallet;

public class ExpenseController implements ExpenseControllerCallBack {
	private ExpenseViewCallBack expenseView;
	private ExpenseModelCallBack expenseModel;
	private BufferedReader br = null;

	public ExpenseController(ExpenseView expenseView) throws Exception {
		this.expenseView = expenseView;
		this.expenseModel = new ExpenseModel(this);
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
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

	@Override
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

	@Override
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

	@Override
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

	@Override
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
