package com.expensemanagement;

import java.util.LinkedList;

import com.expensemanagement.dto.Expense;
import com.expensemanagement.dto.Wallet;

public interface ExpenseModelCallBack {

	boolean updateWallet(String name, float amt) throws Exception;

	Wallet getWallet() throws Exception;

	void addExpense(String details, float amt) throws Exception;

	boolean addMoneyToWallet(float amt) throws Exception;

	LinkedList<Expense> listExpenses() throws Exception;

}
