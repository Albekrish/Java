package com.mailapplication.login;

import java.util.Scanner;

import com.mailapplication.sendreceive.SendReceiveView;

public class LoginView implements LoginViewCallBack {

	private LoginControlerViewCallBack loginControler;
	private Scanner input = new Scanner(System.in);

	public LoginView() {
		loginControler = new LoginControler(this);
	}

	public static void main(String[] args) {
		LoginView loginView = new LoginView();
		loginView.loginIndex();
	}

	public void loginIndex() {
		System.out.println("----> Welcome to Mail Service <----");
		System.out.println("1-LogIn ");
		System.out.println("2-SignUp");
		System.out.println("3-Forget Password..");
		System.out.print("Enter your option --->");
		int option = input.nextInt();
		input.nextLine();
		switch (option) {
		case 1:
			mailLogin();
			break;
		case 2:
			getDetails();
			break;
		case 3:
			forgotPassword();
			break;
		default:
			System.out.println("Enter a valid option ");
			break;
		}
	}

	private void forgotPassword() {
		System.out.println("Enter mail Id");
		String mailId = input.nextLine();
		System.out.print("Enter phone no---> ");
		String phoneNo = input.nextLine();
		if (loginControler.forgotPassword(mailId, phoneNo)) {
			resetPassword(mailId);
		} else {
			System.out.println("Account doesn't exist..please give correct credentials");
		}
	}

	private void resetPassword(String mailId) {
		System.out.println("Please enter the password");
		String pw = input.next();
		System.out.println("re-enter the password again");
		String pw1 = input.next();
		if (pw.equals(pw1)) {
			if (loginControler.resetPassword(mailId, pw)) {
				System.out.println("Password reset success!!");
				System.out.println("Please login-in again");
				loginIndex();
			} else {
				System.out.println("Password reset failed. please contact admin");
				checkContinue();
			}
		} else {
			System.out.println("password mismatch..please try again");
			checkContinue();
		}
	}

	private void mailLogin() {
		System.out.println("Enter mail Id");
		String mailId = input.nextLine();
		System.out.println("Enter Password");
		String password = input.nextLine();
		loginControler.validateMail(mailId, password);
	}

	public void getDetails() {
		System.out.print("Enter First Name --> ");
		String firstName = input.nextLine();
		System.out.print("Enter Last Name ---> ");
		String lastName = input.nextLine();
		System.out.print("Enter Date Of Birth (yyyy-mm-dd) --->");
		String dob = input.nextLine();
		System.out.print("Enter gender(male/female) ---> ");
		String gender = input.nextLine();
		System.out.print("Enter phone no---> ");
		String phoneNo = input.nextLine();
		loginControler.validate(firstName, lastName, dob, gender, phoneNo);
	}

	@Override
	public String getUserName() {
		System.out.print("Enter user name ---> ");
		String emailId = input.nextLine();
		return emailId;
	}

	@Override
	public void errorMessage(String string) {
		System.out.println(string);
		checkContinue();
	}

	public void checkContinue() {
		System.out.print("Do you want to continue? (y/n) -->");
		String option = input.nextLine();
		loginControler.continueCheck(option);
	}

	@Override
	public void exitMethod() {
		System.out.println("Thank you for Visiting");
	}

	@Override
	public String getPassword() {
		System.out.println("Enter password");
		String password = input.nextLine();
		return password;
	}

	@Override
	public void callSendReceive(String mailId) {
		SendReceiveView sendReceiveView = new SendReceiveView();
		sendReceiveView.sendReceiveIndex(mailId);
	}

}
