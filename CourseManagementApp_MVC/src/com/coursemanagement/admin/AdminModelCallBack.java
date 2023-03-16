package com.coursemanagement.admin;

import java.util.List;

import com.coursemanagement.dto.Admin;
import com.coursemanagement.dto.Course;
import com.coursemanagement.dto.Trainer;

public interface AdminModelCallBack {

	// User getUser(int userId);

	Admin addNewAdmin(String userName);

	Trainer addNewTrainer(String userName);

	List<Course> getCourse(String courseName);

	boolean addCourse(String courseName, double cMoney, String tName);

	boolean removeCourse(String courseName);

}
