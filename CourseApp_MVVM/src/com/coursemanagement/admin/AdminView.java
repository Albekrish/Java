package com.coursemanagement.admin;

import java.util.List;
import java.util.Scanner;

import com.coursemanagement.dto.Admin;
import com.coursemanagement.dto.Course;
import com.coursemanagement.dto.Trainer;

public class AdminView{

	private AdminModel adminModel;
	private Scanner scan = new Scanner(System.in);

	public AdminView() {
		adminModel = new AdminModel(this);
	}

	public void init(String userId, String password) {
		String userName, courseName, tName;
		double cMoney;
		System.out.println("Welcome Admin!!!");
		System.out.println("1-Add Trainer.");
		System.out.println("2-Add new Admin");
		System.out.println("3-View Course");
		System.out.println("4-Add Course");
		System.out.println("5-Remove Course");
		System.out.println("6-Exit Application");
		int input = scan.nextInt();
		switch (input) {
		case 1:
			System.out.println("Enter UserName for new Trainer");
			userName = scan.next();
			Trainer trainer = adminModel.addNewTrainer(userName);
			System.out.println("New Trainer " + userName + " is added successfully!!!");
			System.out.println("Please find below credentials for log-in next time");
			System.out.println("Admin UserId : " + trainer.getUserId());
			System.out.println("Admin Password: " + trainer.getPassword());
			break;
		case 2:
			System.out.println("Enter UserName for new Admin");
			userName = scan.next();
			Admin admin = adminModel.addNewAdmin(userName);
			System.out.println("New Admin" + userName + " is added successfully!!!");
			System.out.println("Please find below credentials for log-in next time");
			System.out.println("Admin UserId" + admin.getUserId());
			System.out.println("Admin Password" + admin.getPassword());
			break;
		case 3: // viewCourse
			System.out.println("Enter the courseName/ All");
			courseName = scan.next();
			List<Course> courses = adminModel.getCourse(courseName);
			for (Course course : courses) {
				System.out.println(course);
			}
			break;
		case 4: // Add Course
			System.out.println("Enter the CourseName");
			courseName = scan.next();
			System.out.println("Enter the CourseMoney");
			cMoney = scan.nextDouble();
			// scan.next();
			System.out.println("Enter the Trainer Name");
			tName = scan.next();
			if (adminModel.addCourse(courseName, cMoney, tName)) {
				System.out.println("Course is added successfully!!");
			} else {
				System.out.println("Failed to add course.Please try again..");
			}
			break;
		case 5: // remove Course
			System.out.println("Enter the course name ");
			courseName = scan.next();
			if (adminModel.removeCourse(courseName)) {

			} else {
				System.out.println("The course is not available in the Database");
			}
			break;
		case 6:
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
