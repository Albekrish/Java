package com.bankingapplication.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.bankingapplication.dto.AccountInfo;
import com.bankingapplication.dto.Admin;
import com.bankingapplication.dto.TransHistory;
import com.bankingapplication.dto.User;
import com.bankingapplication.dto.UserDetail;

public class Repository {
	private static Repository repository = null;

	List<User> users = new ArrayList<>();
	List<Admin> admins = new ArrayList<>();
	List<UserDetail> userDetails = new ArrayList<>();
	List<AccountInfo> accountInfos = new ArrayList<>();
	List<TransHistory> transHistorys = new ArrayList<>();

	public static Repository getInstance() { // singleton class
		if (repository == null) {
			repository = new Repository();
			repository.intialSetup();
		}
		return repository;
	}

	void intialSetup() { // init values for pojo
		users.add(new User(38786815, "Abi"));
		users.add(new User(38786845, "Naveen"));
		admins.add(new Admin("Admin", "Admin", 13881401));
		userDetails.add(new UserDetail(38786815, "Abi", 'F', "31/05/1996", 9789284868L, 768463756482L,
				"abirami.krishnasamy@gmail.com", "BDSPA67898", "2/12 kumarnagar, pollachi", "Coimbatore", "TamilNadu",
				642207, 435789690876L));
		userDetails.add(
				new UserDetail(38786845, "Naveen", 'M', "13/07/2002", 9789234568L, 768461236482L, "naveen.r@gmail.com",
						"BDSPA67123", "2/12 periyarnagar, pollachi", "Coimbatore", "TamilNadu", 642126, 435789692345L));
		accountInfos.add(new AccountInfo(38786815, 435789690876L, 2000));
		accountInfos.add(new AccountInfo(38786845, 435789692345L, 2000));
		transHistorys.add(new TransHistory(38786815, "credit", 435789690876L, 435789692345L, 1000,
				LocalDate.of(2023, 02, 20), LocalTime.of(02, 30, 45)));
		transHistorys.add(new TransHistory(38786845, "debit", 435789692345L, 435789690876L, 500,
				LocalDate.of(2023, 02, 21), LocalTime.of(01, 33, 30)));
	}

	public boolean checkValidAdmin(int userId, String password) {
		for (Admin credential : admins) {
			if (credential.getUserId() == userId && credential.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public boolean customerValidation(int userId, String pw) {
		for (User credential : users) {
			if (credential.getUserId() == userId && credential.getPassword().equals(pw)) {
				return true;
			}
		}
		return false;
	}

	public boolean addNewUser(int userId, String password) {
		users.add(new User(userId, password));
		return true;
	}

	public UserDetail addNewUserDetail(int userId, String userName, char gender, String dob, long phNo, long adhaarNo,
			String mailId, String panNo, String street, String city, String state, int pincode, long accountNo) {
		userDetails.add(new UserDetail(userId, userName, gender, dob, phNo, adhaarNo, mailId, panNo, street, city,
				state, pincode, accountNo));
		for (UserDetail userDetail : userDetails) {
			if (userDetail.getUserId() == userId) {
				return userDetail;
			}
		}
		return null;
	}

	public User getUser(int userId) {
		for (User user : users) {
			if (user.getUserId() == userId) {
				return user;
			}
		}
		return null;
	}

	public Admin addNewAdmin(String userName, String password, int userId) {
		admins.add(new Admin(userName, password, userId));
		return admins.get(userId);
	}

	public List<UserDetail> getUserDetails() {
		return userDetails;
	}

	public UserDetail getProfile(int userId) {
		for (UserDetail userDetail : userDetails) {
			if (userDetail.getUserId() == userId) {
				return userDetail;
			}
		}
		return null;
	}

	public boolean moneyTransfer(long tranAccountNo, double tranMoney, int userId) {

		for (AccountInfo accountInfo : accountInfos) {
			if (accountInfo.getUserId() == userId) {
				if (accountInfo.getBalance() >= tranMoney) {
					accountInfo.setBalance(accountInfo.getBalance() - tranMoney);
					// transHistoryMethod(tranAccountNo, tranMoney, userId,"credit");
					transHistorys.add(new TransHistory(userId, "credit", accountInfo.getAccountNo(), tranAccountNo,
							tranMoney, LocalDate.now(), LocalTime.now()));
					for (AccountInfo tranAccountInfo : accountInfos) {
						if (tranAccountInfo.getAccountNo() == tranAccountNo) {
							tranAccountInfo.setBalance(tranAccountInfo.getBalance() + tranMoney);
							transHistorys.add(
									new TransHistory(tranAccountInfo.getUserId(), "debit", accountInfo.getAccountNo(),
											tranAccountNo, tranMoney, LocalDate.now(), LocalTime.now()));
						}
					}
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public List<TransHistory> transHistory(int userId) {
		List<TransHistory> result = new LinkedList<>();
		for (TransHistory transHistory : transHistorys) {
			if (transHistory.getUserId() == userId) {
				result.add(transHistory);
			}
		}
		return result;
	}

//	public void transHistoryMethod(long tranAccountNo, double tranMoney, int userId, String options){
//		if(options.equals("credit")){
//			for(TransHistory transHistory: transHistorys) {
//				if(transHistory.getUserId()==userId) {
//					transHistory.setAccountTo(tranAccountNo);
//					transHistory.setAmount(transHistory.getAmount()-tranMoney);
//					transHistory.setOptions("credit");
//					transHistory.setDate(LocalDate.now());
//					transHistory.setTime(LocalTime.now());
//				}				
//			}			
//			
//		}else if(options.equals("debit")) {
//			for(TransHistory transHistory: transHistorys) {
//				if(transHistory.==tranAccountNo) {
//					transHistory.setAccountTo(tranAccountNo);
//					transHistory.setAmount(transHistory.getAmount()-tranMoney);
//					transHistory.setOptions("credit");
//					transHistory.setDate(LocalDate.now());
//					transHistory.setTime(LocalTime.now());
//				}				
//			}
//		}
//		
//}
}
