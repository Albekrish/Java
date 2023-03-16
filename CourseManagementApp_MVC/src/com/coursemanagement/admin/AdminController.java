package com.coursemanagement.admin;

import java.util.List;

import com.coursemanagement.dto.Admin;
import com.coursemanagement.dto.Course;
import com.coursemanagement.dto.Trainer;

public class AdminController implements AdminControllerCallBack {

	private AdminViewCallBack adminView;
	private AdminModelCallBack adminModel;

	public AdminController(AdminView adminView) {
		this.adminView = adminView;
		this.adminModel = new AdminModel(this);
	}

//	@Override
//	public User getUser(int userId) {
//		return adminModel.getUser(userId);
//	}

	@Override
	public Admin addNewAdmin(String userName) {
		return adminModel.addNewAdmin(userName);
	}

	@Override
	public Trainer addNewTrainer(String userName) {
		return adminModel.addNewTrainer(userName);
	}

	@Override
	public List<Course> getCourse(String courseName) {
		return adminModel.getCourse(courseName);
	}

	@Override
	public boolean addCourse(String courseName, double cMoney, String tName) {
		return adminModel.addCourse(courseName, cMoney, tName);
	}

	@Override
	public boolean removeCourse(String courseName) {
		return adminModel.removeCourse(courseName);
	}

//	@Override
//	public List<UserDetail> getUserDetails() {
//		return adminModel.getUserDetails();
//	}

}
