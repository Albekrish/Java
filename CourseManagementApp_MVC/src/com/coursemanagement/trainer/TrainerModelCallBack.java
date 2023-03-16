package com.coursemanagement.trainer;

import java.util.List;

import com.coursemanagement.dto.Course;

public interface TrainerModelCallBack {

	List<Course> viewAssignedCourse(String userId);

}
