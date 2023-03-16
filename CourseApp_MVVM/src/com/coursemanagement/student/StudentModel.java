package com.coursemanagement.student;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

import com.coursemanagement.dto.Course;
import com.coursemanagement.repository.Repository;

public class StudentModel{
	private StudentView studentView;

	public StudentModel(StudentView studentView) {
		this.studentView = studentView;
	}

	public List<Course> getCourse(String courseName) {
		return Repository.getInstance().getcourse(courseName);
	}

	public boolean enrollCourse(String userId, String course) {
		return Repository.getInstance().enrollcourse(userId, course);
	}

}
