package com.bankingapplication.account;

import java.util.List;

import com.bankingapplication.dto.TransHistory;
import com.bankingapplication.dto.UserDetail;
import com.bankingapplication.repository.Repository;

public class AccountModel {
	private AccountView accountView;

	public AccountModel(AccountView accountView) {
		this.accountView = accountView;
	}

	public UserDetail profileView(int userId) {
		return Repository.getInstance().getProfile(userId);
	}

	public boolean moneyTransfer(long tranAccountNo, double tranMoney, int userId) {
		return Repository.getInstance().moneyTransfer(tranAccountNo, tranMoney, userId);
	}

	public List<TransHistory> transHistory(int userId) {
		return Repository.getInstance().transHistory(userId);
	}
}
