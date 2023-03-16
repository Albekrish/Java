package com.coursemanagement.student;

import java.util.List;

import com.coursemanagement.dto.Course;

public interface StudentControllerCallBack {

	List<Course> getCourse(String courseName);

	boolean enrollCourse(String userId, String course);

}
