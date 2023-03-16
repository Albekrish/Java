package com.expensemanagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;

import com.expensemanagement.dto.Expense;
import com.expensemanagement.dto.Wallet;

public class ExpenseModel implements ExpenseModelCallBack {
	private ExpenseControllerCallBack expenseController;
	private String wpath = "C:/Users/Harish/Desktop/DAT/wallet.dat";
	private String tpath = "C:/Users/Harish/Desktop/DAT/trans.dat";
	private Wallet w;

	public ExpenseModel(ExpenseControllerCallBack expenseController) throws Exception {
		this.expenseController = expenseController;
		verifyFolder();
	}

	public ExpenseModel(Wallet w) throws Exception {
		this.w = w;
		verifyFolder();
	}

	private void verifyFolder() throws Exception {
		File file0 = new File("C:/Users/Harish/Desktop/DAT");

		if (!file0.exists())
			file0.mkdir();

		File file1 = new File(wpath);
		if (file1.exists())
			w = getWallet();

	}

	@Override
	public boolean updateWallet(String name, float amt) throws Exception {
		boolean flag = false;
		try {
			ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream(wpath));
			w = new Wallet(name, amt);
			op.writeObject(w);
			op.close();
			File file = new File(tpath);
			file.delete();
			flag = true;
		} catch (FileNotFoundException e) {
			throw new Exception("Data file not found/Data file may be DELETED!");
		} catch (IOException e) {
			throw new Exception("Error while writing datafile : " + e.getMessage());
		}
		return flag;
	}

	@Override
	public Wallet getWallet() throws Exception {
		try {

//			ObjectOutputStream op1 = new ObjectOutputStream(new FileOutputStream(wpath));
//			w = new Wallet("Abi", 1000);
//			op1.writeObject(w);

			ObjectInputStream op = new ObjectInputStream(new FileInputStream(wpath));
			Object obj = op.readObject();
			Wallet w = (Wallet) obj;
			this.w = w;
			op.close();
			return w;
		} catch (FileNotFoundException fe) {
			throw new Exception("Data file not found/No datafile created yet!");
		} catch (IOException ex) {
			throw new Exception("Error while reading file: " + ex.getMessage());
		} catch (ClassNotFoundException cx) {
			throw new Exception("Invalid datafile/data inside file is modified!");
		}
	}

	@Override
	public void addExpense(String details, float amt) throws Exception {
		Expense e = new Expense(new java.util.Date().toString(), details, amt);
		PrintStream pw = null;
		try {
			pw = new PrintStream(new FileOutputStream(tpath, true));
			withdrawFromWallet(amt);
			pw.println(e);
		} catch (IOException e1) {
			throw new Exception("unable to write transactions");
		} finally {
			pw.close();
		}

	}

	private void withdrawFromWallet(float amt) throws Exception {
		float t = w.getAmount() - amt;
		if (t < 0)
			throw new Exception("No enough cash available in your wallet!!!");
		updateWallet(w.getUserName(), w.getAmount() - amt);
	}

	@Override
	public boolean addMoneyToWallet(float amt) throws Exception {
		return updateWallet(w.getUserName(), w.getAmount() + amt);

	}

	@Override
	public LinkedList<Expense> listExpenses() throws Exception {
		LinkedList<Expense> expenses = new LinkedList<Expense>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(tpath));
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(";");
				Expense e = new Expense(fields[0], fields[1], Float.parseFloat(fields[2]));
				expenses.add(e);
				line = br.readLine();
			}
		} catch (IOException ex) {
			throw new Exception("Unable to read transactions: " + ex.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
			}
		}
		return expenses;
	}
}
