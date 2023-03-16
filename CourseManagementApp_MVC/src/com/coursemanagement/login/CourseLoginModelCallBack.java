package com.coursemanagement.login;

public interface CourseLoginModelCallBack {

	boolean adminValidation(String userId, String password);

	boolean studentValidation(String userId, String password);

	boolean trainerValidation(String userId, String password);

	boolean addStudent(String userId, String password);

}
