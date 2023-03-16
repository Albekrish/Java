package com.coursemanagement.student;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

import com.coursemanagement.dto.Course;
import com.coursemanagement.repository.Repository;

public class StudentModel implements StudentModelCallBack {
	private StudentControllerCallBack studentController;

	public StudentModel(StudentController studentController) {
		this.studentController = studentController;
	}

	@Override
	public List<Course> getCourse(String courseName) {
		return Repository.getInstance().getcourse(courseName);
	}

	@Override
	public boolean enrollCourse(String userId, String course) {
		return Repository.getInstance().enrollcourse(userId, course);
	}

}
