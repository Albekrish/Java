package com.coursemanagement.student;

import java.util.List;
import java.util.Scanner;

import com.coursemanagement.dto.Course;

public class StudentView implements StudentViewCallBack {

	private StudentControllerCallBack studentController;
	private Scanner scan = new Scanner(System.in);

	public StudentView() {
		studentController = new StudentController(this);
	}

	public void init(String userId, String password) {
		System.out.println("Welcome " + userId);
		System.out.println("1-View available course");
		System.out.println("2-Register course");
		System.out.println("3-Exit Application");
		int input = scan.nextInt();
		switch (input) {
		case 1:
			System.out.println("Enter the courseName/ All");
			String courseName = scan.next();
			List<Course> courses = studentController.getCourse(courseName);
			for (Course course : courses) {
				System.out.println(course);
			}
			break;
		case 2:
			System.out.println("Please enter the courseName to enroll");
			String course = scan.next();
			if (studentController.enrollCourse(userId, course)) {
				System.out.println("Your are sucessfully enrolled the course");
			} else {
				System.out.println("Please contact Admin to enroll");
			}
		case 3:
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
