package com.coursemanagement.trainer;

import java.util.List;

import com.coursemanagement.dto.Course;

public interface TrainerControllerCallBack {

	List<Course> viewAssignedCourse(String userId);

}
