package com.coursemanagement.trainer;

import java.util.List;
import com.coursemanagement.dto.Course;
import com.coursemanagement.repository.Repository;

public class TrainerModel{
	private TrainerView trainerView;

	public TrainerModel(TrainerView trainerView) {
		this.trainerView = trainerView;
	}

	public List<Course> viewAssignedCourse(String userId) {
		return Repository.getInstance().viewAssignedCourse(userId);
	}

}
