package com.bankingapplication.account;

import java.util.List;

import com.bankingapplication.dto.TransHistory;
import com.bankingapplication.dto.UserDetail;

public class AccountController implements AccountControllerCallBack {
	private AccountViewCallBack accountView;
	private AccountModelCallBack accountModel;

	public AccountController(AccountView loginView) {
		this.accountView = accountView;
		this.accountModel = new AccountModel(this);
	}

	@Override
	public UserDetail profileView(int userId) {
		return accountModel.profileView(userId);

	}

	@Override
	public boolean moneyTransfer(long tranAccountNo, double tranMoney, int userId) {
		return accountModel.moneyTransfer(tranAccountNo, tranMoney, userId);

	}

	@Override
	public List<TransHistory> transHistory(int userId) {
		return accountModel.transHistory(userId);
	}
}
