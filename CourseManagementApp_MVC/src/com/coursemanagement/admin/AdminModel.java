package com.coursemanagement.admin;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

import com.coursemanagement.dto.Admin;
import com.coursemanagement.dto.Course;
import com.coursemanagement.dto.Trainer;
import com.coursemanagement.repository.Repository;

public class AdminModel implements AdminModelCallBack {
	private AdminControllerCallBack adminController;

	public AdminModel(AdminController adminController) {
		this.adminController = adminController;
	}

//	@Override
//	public User getUser(int userId) {
//		return Repository.getInstance().getUser(userId);
//	}

	@Override
	public Trainer addNewTrainer(String userName) {
		String password = createPassword();
		return Repository.getInstance().addNewTrainer(userName, password);
	}

	@Override
	public Admin addNewAdmin(String userName) {
		String password = createPassword();
		return Repository.getInstance().addNewAdmin(userName, password);
	}

//	@Override
//	public List<UserDetail> getUserDetails() {
//		return Repository.getInstance().getUserDetails();
//	}
////	
//	private int createUserId(String userName) {		
//		String generateUUIDNo = String.format("%010d",new BigInteger(UUID.randomUUID().toString().replace("-",""),16));		
//        String custId = generateUUIDNo.substring( generateUUIDNo.length() - 8);
//        int userId= Integer.parseInt(custId);
//        return userId;
//	}
	private String createPassword() {
		String generateUUIDNo = UUID.randomUUID().toString().replace("-", "");
		String custPassword = generateUUIDNo.substring(generateUUIDNo.length() - 8);
		return custPassword;
	}

	@Override
	public List<Course> getCourse(String courseName) {
		return Repository.getInstance().getcourse(courseName);
	}

	@Override
	public boolean addCourse(String courseName, double cMoney, String tName) {
		return Repository.getInstance().addCourse(courseName, cMoney, tName);
	}

	@Override
	public boolean removeCourse(String courseName) {
		return Repository.getInstance().removeCourse(courseName);
	}

}
