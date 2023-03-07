package com.abi.flightreservationsystem.login;

import java.util.Scanner;

import com.abi.flightreservationsystem.Booking.BookingView;

public class FlightLoginView implements FlightLoginViewCallBack {

	private FlightLoginControllerCallBack loginController;
	private Scanner scanner = new Scanner(System.in);

	public FlightLoginView() {
		loginController = new FlightLoginController(this);
	}

	public static void main(String[] args) {
		FlightLoginView loginView = new FlightLoginView();
		loginView.checkForLogin();
	}

	private void checkForLogin() {
		System.out.println("Wlecome to Indian Airlines-Flight Booking System.....");
		System.out.println("1-AdminLogin");
		System.out.println("2-userLogin");
		System.out.println("3-newUser sign-un");
		System.out.println("select the option to proceed further");
		int n = scanner.nextInt();
		String userName, password, password1;
		switch (n) {
		case 1:
			System.out.println("Enter Admin Name");
			userName = scanner.next();
			System.out.println("Enter Admin password");
			password = scanner.next();
			loginController.adminCheckCredentials(userName, password);
			break;
		case 2:
			System.out.println("Enter User Name");
			userName = scanner.next();
			System.out.println("Enter password"); // password hashing
			password = scanner.next();
			loginController.checkCredentials(userName, password);
			break;
		case 3:
			System.out.println("Sign-up page ....");
			System.out.println("Enter username");
			userName = scanner.next();
			System.out.println("Enter password");
			password = scanner.next();
			System.out.println("Please re-confirm password");
			password1 = scanner.next();
			if (password.equals(password1)) {
				loginController.newUser(userName, password);
			} else {
				System.out.println("Password mismatch. Please try again ....");
				checkForLogin();
			}
		}
	}

	@Override
	public void loginSuccess(String user) {
		System.out.println("\n-->Welcome " + user + "<--\n");
		BookingView bookingview = new BookingView();
		bookingview.intialSetup(user);
	}

	@Override
	public void loginFailed(String errorMessage) {
		System.out.println(errorMessage);
		checkForLogin();
	}

}
