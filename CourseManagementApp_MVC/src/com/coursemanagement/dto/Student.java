package com.coursemanagement.dto;

public class Student {
	private String userId;
	private String password;
	private Course course;

	public Student(String userId, String password, Course course) {
		this.userId = userId;
		this.password = password;
		this.course = course;
	}

	public Student(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [userId=" + userId + ", courseName=" + course.getCourse() + ", CourseAmount" + course.getMoney()
				+ ", CourseTrainer" + course.getTrainer() + "]";
	}

}
