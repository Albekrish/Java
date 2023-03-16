package com.bankingapplication.account;

import java.util.List;

import com.bankingapplication.dto.TransHistory;
import com.bankingapplication.dto.UserDetail;
import com.bankingapplication.repository.Repository;

public class AccountModel implements AccountModelCallBack {
	private AccountControllerCallBack accountController;

	public AccountModel(AccountControllerCallBack accountController) {
		this.accountController = accountController;
	}

	@Override
	public UserDetail profileView(int userId) {
		return Repository.getInstance().getProfile(userId);
	}

	@Override
	public boolean moneyTransfer(long tranAccountNo, double tranMoney, int userId) {
		return Repository.getInstance().moneyTransfer(tranAccountNo, tranMoney, userId);
	}

	@Override
	public List<TransHistory> transHistory(int userId) {
		return Repository.getInstance().transHistory(userId);
	}
}
