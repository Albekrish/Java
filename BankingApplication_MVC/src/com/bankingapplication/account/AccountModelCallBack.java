package com.bankingapplication.account;

import java.util.List;

import com.bankingapplication.dto.TransHistory;
import com.bankingapplication.dto.UserDetail;

public interface AccountModelCallBack {

	UserDetail profileView(int userId);

	boolean moneyTransfer(long tranAccountNo, double tranMoney, int userId);

	List<TransHistory> transHistory(int userId);

}
