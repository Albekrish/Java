package com.coursemanagement.trainer;

import java.util.List;

import com.coursemanagement.dto.Course;

public class TrainerController implements TrainerControllerCallBack {

	private TrainerViewCallBack trainerView;
	private TrainerModelCallBack trainerModel;

	public TrainerController(TrainerView trainerView) {
		this.trainerView = trainerView;
		this.trainerModel = new TrainerModel(this);
	}

	@Override
	public List<Course> viewAssignedCourse(String userId) {
		return trainerModel.viewAssignedCourse(userId);
	}

}
