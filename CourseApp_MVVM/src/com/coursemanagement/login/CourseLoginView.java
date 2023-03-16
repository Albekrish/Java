package com.coursemanagement.login;

import java.util.Scanner;

import com.coursemanagement.admin.AdminView;
import com.coursemanagement.student.StudentView;
import com.coursemanagement.trainer.TrainerView;

public class CourseLoginView{
	private CourseLoginModel loginModel;
	private Scanner scan = new Scanner(System.in);

	public CourseLoginView() {
		loginModel = new CourseLoginModel(this);
	}

	public static void main(String[] args) {
		CourseLoginView loginView = new CourseLoginView();
		loginView.checkForLogin();
	}

	private void checkForLogin() {
		String password, userId;
		System.out.println("Welcome to Swayam Course..");
		System.out.println("1-Admin Login");
		System.out.println("2- Student Login");
		System.out.println("3-Trainer login");
		System.out.println("4-New Student sign-up");
		int input = scan.nextInt();

		switch (input) {
		case 1: // Admin
			System.out.println("Enter Admin Name");
			userId = scan.next();
			System.out.println("Enter Password");
			password = scan.next();
			if (loginModel.adminValidation(userId, password)) {
				AdminView adminView = new AdminView();
				adminView.init(userId, password);
			} else {
				System.out.println("Please check your credentials...");
				checkForLogin();
			}
			break;
		case 2: // Student
			System.out.println("Enter User Name");
			userId = scan.next();
			System.out.println("Enter Password");
			password = scan.next();
			if (loginModel.studentValidation(userId, password)) {
				StudentView studentView = new StudentView();
				studentView.init(userId, password);
			} else {
				System.out.println("Please check your credentials..");
				checkForLogin();
			}
			break;
		case 3: // Trainer
			System.out.println("Enter Trainer Name");
			userId = scan.next();
			System.out.println("Enter Password");
			password = scan.next();
			if (loginModel.trainerValidation(userId, password)) {
				TrainerView trainerView = new TrainerView();
				trainerView.init(userId, password);
			} else {
				System.out.println("Please check your credentials..");
				checkForLogin();
			}
			break;
		case 4:// new user sign-up page
			System.out.println("New Student sign-up page");
			System.out.println("Enter userName");
			userId = scan.next();
			System.out.println("Enter password");
			password = scan.next();
			System.out.println("Re-enter password");
			String password1 = scan.next();
			if (password.equals(password1)) {
				if (loginModel.addStudent(userId, password)) {
					System.out.println("Your account is create successfully..Please log-in with Student sign-in page");
				} else {
					System.out.println("sign-up failed.Please check with aAdmin or try again");
					checkForLogin();
				}
			} else {
				System.out.println("Password mismatch. please sign-up again");
				checkForLogin();
			}
			break;
		default:
			System.out.println("please enter a valid option");
			checkForLogin();
			break;
		}

	}
}
