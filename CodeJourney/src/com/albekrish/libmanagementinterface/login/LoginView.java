package com.albekrish.libmanagementinterface.login;

import java.util.Scanner;

public class LoginView {
	private LoginController loginController;
	private Scanner scanner = new Scanner(System.in);

	LoginView() {
		loginController = new LoginController(this);
	}

	public static void main(String[] args) {
		LoginView loginView = new LoginView();
		loginView.checkForLogin();
	}

	private void checkForLogin() {
		System.out.println("Welcome to Library Management System\n ------------------------");
		System.out.println("Enter User Name");
		String userName = scanner.next();
		System.out.println("Enter password");
		String password = scanner.next();
		loginController.checkCredentialsOnline(userName, password);

	}

	public void loginSuccess(String userName) {
		System.out.println("\n-->Welcome " + userName + "<--\n");
		System.out.println("Thanks for Login.");
	}

	public void loginFailed(String errorMessage) {
		System.out.println(errorMessage);
		checkForLogin();
	}

}
