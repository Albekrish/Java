package com.coursemanagement.login;

import com.coursemanagement.repository.Repository;

public class CourseLoginModel{
	private CourseLoginView loginView;

	public CourseLoginModel(CourseLoginView loginView) {
		this.loginView = loginView;
	}

	public boolean adminValidation(String userId, String password) {
		return Repository.getInstance().checkValidAdmin(userId, password);
	}

	public boolean studentValidation(String userId, String password) {
		return Repository.getInstance().studentValidation(userId, password);
	}

	public boolean trainerValidation(String userId, String password) {
		return Repository.getInstance().trainerValidation(userId, password);
	}

	public boolean addStudent(String userId, String password) {
		return Repository.getInstance().addStudent(userId, password);
	}

//	@Override
//	public int newUserValidation(String userName, char gender, String dob, long phNo, long adhaarNo, String mailId,
//			String panNo, String street, String city, String state, int pincode) {	
//		
//		int userId= createUserId(userName);
//		String password=createPassword(userId);	
//		long accountNo=createAccountNo(userId);
//		
//		Repository.getInstance().addNewUser(userId, password);
//		Repository.getInstance().addNewUserDetail(userId, userName, gender, dob, phNo, adhaarNo, mailId, panNo, street, city, state, pincode, 
//					 accountNo);
//		
//		return userId;	
//	}
//
//	
//	@Override
//	public boolean addNewUser(int userId, String password) {
//		String pw= decrptKey(password);
//		return Repository.getInstance().addNewUser(userId, pw);
//	}

}
