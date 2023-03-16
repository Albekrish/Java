package com.coursemanagement.student;

import java.util.List;

import com.coursemanagement.dto.Course;

public class StudentController implements StudentControllerCallBack {

	private StudentViewCallBack studentView;
	private StudentModelCallBack studentModel;

	public StudentController(StudentView studentView) {
		this.studentView = studentView;
		this.studentModel = new StudentModel(this);
	}

	@Override
	public List<Course> getCourse(String courseName) {
		return studentModel.getCourse(courseName);
	}

	@Override
	public boolean enrollCourse(String userId, String course) {
		return studentModel.enrollCourse(userId, course);
	}

}
