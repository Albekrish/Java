package com.coursemanagement.trainer;

import java.util.List;
import java.util.Scanner;

import com.coursemanagement.dto.Course;

public class TrainerView implements TrainerViewCallBack {

	private TrainerControllerCallBack trainerController;
	private Scanner scan = new Scanner(System.in);

	public TrainerView() {
		trainerController = new TrainerController(this);
	}

	public void init(String userId, String password) {
		System.out.println("Welcome " + userId);
		System.out.println("1-View Course Assigned");
		// System.out.println("2-View Students");
		System.out.println("2-Exit Application");
		int input = scan.nextInt();
		switch (input) {
		case 1:
			List<Course> courseList = trainerController.viewAssignedCourse(userId);
			if (courseList.isEmpty()) {
				System.out.println("There is no course assigned to you as of now.");
			} else {
				for (Course course : courseList) {
					System.out.println(course);
				}
			}
			break;
		case 2:
			System.out.println("Thank you !!");
			break;
		default:
			System.out.println("please enter a valid option");
			init(userId, password);
			break;
		}
		System.out.println("Do you want to continue? Y/N");
		char op = scan.next().charAt(0);
		if (op == 'Y') {
			init(userId, password);
		} else {
			System.out.println("Thank you!");
		}
	}

}
