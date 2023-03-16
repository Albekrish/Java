package com.mailapplication.login;

import java.time.LocalDate;
import java.util.Scanner;

import com.mailapplication.sendreceive.SendReceiveView;

public class LoginView{

	private LoginModel loginModel;
	private Scanner input = new Scanner(System.in);

	public LoginView() {
		loginModel = new LoginModel(this);
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
		if (forgotPassword(mailId, phoneNo)) {
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
			if (resetPassword(mailId, pw)) {
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
		validateMail(mailId, password);
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
		validate(firstName, lastName, dob, gender, phoneNo);
	}

	public String getUserName() {
		System.out.print("Enter user name ---> ");
		String emailId = input.nextLine();
		return emailId;
	}

	public void errorMessage(String string) {
		System.out.println(string);
		checkContinue();
	}

	public void checkContinue() {
		System.out.print("Do you want to continue? (y/n) -->");
		String option = input.nextLine();
		continueCheck(option);
	}

	public void exitMethod() {
		System.out.println("Thank you for Visiting");
	}

	public String getPassword() {
		System.out.println("Enter password");
		String password = input.nextLine();
		return password;
	}

	public void callSendReceive(String mailId) {
		SendReceiveView sendReceiveView = new SendReceiveView();
		sendReceiveView.sendReceiveIndex(mailId);
	}

	public void validate(String firstName, String lastName, String dob, String gender, String phoneNo) {
		if (!firstName.matches("[a-zA-Z]+")) {
			errorMessage("Invalid Name");
		} else if (!lastName.matches("[a-zA-Z]+")) {
			errorMessage("Invalid Name");
		} else if (!gender.equals("male") && !(gender.equals("female"))) {
			errorMessage("Enter a valid input");
		} else if (!dob.matches("[0-9]{4}[-?][0-9]{2}[-?][0-9]{2}")) {
			errorMessage("Invalid DateOfBirth");
		} else if (!phoneNo.matches("[9876]{1}[0-9]+")) {
			errorMessage("Invalid phoneNo");			
		} else {
			String emailId = getUserName();
			emailId += "@gmail.com";
			if (loginModel.validate(emailId))// to check unique mailId
			{
				String password = getPassword();
				if (password.length() < 8) {
					System.out.println("Invalid password");
					getDetails();
					return;
				}
				loginModel.addNewEmail(emailId, password, firstName, lastName, LocalDate.parse(dob), gender, phoneNo);
				checkContinue();
			} else {
				System.out.println("Invalid username");
			}
		}

	}

	public void continueCheck(String option) {
		if (option.equals("y") || option.equals("Y") || option.equals("yes") || option.equals("YES")) {
			loginIndex();
		} else {
			exitMethod();
		}
	}

	public void validateMail(String mailId, String password) {
		if (loginModel.validateMail(mailId, password)) {
			callSendReceive(mailId);
		} else {
			errorMessage("Invalid username or password");
		}

	}

	public boolean forgotPassword(String mailId, String phoneNo) {
		return loginModel.forgotPassword(mailId, phoneNo);

	}

	public boolean resetPassword(String mailId, String pw) {
		return loginModel.resetPassword(mailId, pw);

	}

}
