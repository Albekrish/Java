package com.coursemanagement.trainer;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

import com.coursemanagement.dto.Course;
import com.coursemanagement.repository.Repository;

public class TrainerModel implements TrainerModelCallBack {
	private TrainerControllerCallBack adminController;

	public TrainerModel(TrainerController trainerController) {
		this.adminController = trainerController;
	}

	@Override
	public List<Course> viewAssignedCourse(String userId) {
		return Repository.getInstance().viewAssignedCourse(userId);
	}

}
