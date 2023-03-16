package com.coursemanagement.login;

public class CourseLoginController implements CourseLoginControllerCallBack {
	private CourseLoginViewCallBack loginView;
	private CourseLoginModelCallBack loginModel;

	public CourseLoginController(CourseLoginView loginView) {
		this.loginView = loginView;
		this.loginModel = new CourseLoginModel(this);
	}

	public boolean adminValidation(String userId, String password) {
		return loginModel.adminValidation(userId, password);
	}

	@Override
	public boolean studentValidation(String userId, String password) {
		return loginModel.studentValidation(userId, password);
	}

	@Override
	public boolean trainerValidation(String userId, String password) {
		return loginModel.trainerValidation(userId, password);
	}

	@Override
	public boolean addStudent(String userId, String password) {
		return loginModel.addStudent(userId, password);
	}
//
//	@Override
//	public int newUserValidation(String userName, char gender, String dob, long phNo, long adhaarNo, String mailId,
//			String panNo, String street, String city, String state, int pincode) {
//		
//		
//		int phNolen=String.valueOf(phNo).length();
//		int adhaarNolen=String.valueOf(adhaarNo).length();
//		int panNolen=String.valueOf(phNolen).length();		
//		return loginModel.newUserValidation(userName, gender, dob, phNo, adhaarNo, mailId, panNo, street, city, state, pincode);			
//		
//	}
//
//	@Override
//	public boolean addNewUser(int userId, String password) {
//		return loginModel.addNewUser(userId, password);
//	}
//	

}
