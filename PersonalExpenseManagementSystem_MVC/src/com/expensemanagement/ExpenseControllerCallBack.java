package com.expensemanagement;

public interface ExpenseControllerCallBack {

	boolean createWallet();

	void displayWallet();

	void addExpense();

	boolean depositCash();

	void listExpenses();

}
