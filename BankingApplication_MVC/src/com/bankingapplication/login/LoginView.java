package com.bankingapplication.login;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bankingapplication.account.AccountView;
import com.bankingapplication.admin.AdminView;
import com.bankingapplication.security.PasswordSecurity;

public class LoginView extends PasswordSecurity implements LoginViewCallBack {

	private LoginControllerCallBack loginController;
	private Scanner scan = new Scanner(System.in);

	public LoginView() {
		loginController = new LoginController(this);
	}

	public static void main(String[] args) {
		LoginView loginView = new LoginView();
		loginView.checkForLogin();
	}

	private void checkForLogin() {
		int userId, input;
		String password, pw, userName, dob;
		System.out.println("Welcome to TNSB...");
		System.out.println("1-Admin Login");
		System.out.println("2-User Login");
		System.out.println("3- New User sign-up");
		System.out.println("4-Exit application");
		AdminView adminView = new AdminView();
		AccountView accountView = new AccountView();
		input = scan.nextInt();

		switch (input) {
		case 1:
			System.out.println("Enter Admin/user ID");
			userId = scan.nextInt();
			System.out.println("Enter Password");
			password = scan.next();
			pw = encrptKey(password);

			if (loginController.adminValidation(userId, pw)) {
				adminView.init(userId, pw);
			} else {
				System.out.println("Please check your credentials...");
				checkForLogin();
			}
			break;
		case 2:
			System.out.println("Enter your customeId.");
			userId = scan.nextInt();
			System.out.println("Enter Password");
			password = scan.next();
			pw = encrptKey(password);
			// System.out.println(pw);
			if (loginController.customerValidation(userId, pw)) {
				accountView.accountPage(userId);
			} else {
				System.out.println("Please check your credentials..");
				checkForLogin();
			}
			break;
		case 3:
			System.out.println("New user sign-up page");
			System.out.println("Enter your fullname as per Aadhaar card");
			userName = scan.next();
			System.out.println("Enter your gender: F or M");
			char gender = scan.next().charAt(0);
			scan.nextLine();
			System.out.println("Enter your DOB (dd/mm/yyyy)");
			dob = scan.nextLine(); // find age
			System.out.println("Enter you phone No..");
			long phNo = scan.nextLong();
			System.out.println("Enter your Aadhaar No. ");
			long adhaarNo = scan.nextLong();
			scan.nextLine();
			System.out.println("Enter your mailId");
			String mailId = scan.nextLine();
			System.out.println("Enter your PAN no.");
			String panNo = scan.nextLine();
			System.out.println("Enter your permanant address");
			System.out.println("Enter address ");
			String street = scan.nextLine();
			System.out.println("City");
			String city = scan.next();
			System.out.println("Enter state");
			String state = scan.next();
			System.out.println("Enter pincode");
			int pincode = scan.nextInt();
			if (validateInput(userName, gender, dob, phNo, adhaarNo, mailId, panNo, street, city, state, pincode)) {
				userId = loginController.newUserValidation(userName, gender, dob, phNo, adhaarNo, mailId, panNo, street,
						city, state, pincode);
				if (userId != 0) {
					String message = "";
					System.out.println("successfuly registerd with TNSB bank!!!!!!");
					System.out.println("Your customerID is " + userId);
					System.out.println("Your account is under processing.. Please wait for sometime..");
					try {
						Thread.sleep(3000);
						message = adminView.approvalNewUser(userId);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (!message.equals("NotApproved")) {
						System.out.println("User Account has been Approed!!!!!! Please find your account details..");
						System.out.println("CustomerId: " + userId);
						System.out.println("Password: " + message);
						System.out.println("Please login with your credentials to reset your password..");
						firstUserLogin(userId, message);
					} else {
						System.out.println(
								"Your account hasnot approved..Please contact your branch Manage for further processing.");
					}
				} else {
					System.out.println("please check the details");
					checkForLogin();
				}
			} else {
				callBack();
			}
			break;
		case 4:
			callBack();
			break;
		default:
			System.out.println("please enter a valid option");
			checkForLogin();
			break;
		}
	}

	private void firstUserLogin(int userId, String message) {
		String password = "";
		System.out.println("customerId");
		int custId = scan.nextInt();
		if (custId == userId) {
			System.out.println("password");
			String pw = scan.next();
			if (pw.equals(message)) {
				System.out.println("Please reset your password.. Enter new password");
				password = scan.next();
				String encrptPw = encrptKey(password);
				System.out.println("Re-enter your password");
				String rePassword = scan.next();
				if (password.equals(rePassword)) {
					boolean flag = loginController.addNewUser(userId, encrptPw);
					if (flag) {
						System.out.println("Account is activated. Please Login with 2-User Login to continue");
						checkForLogin();
					} else {
						System.out.println("Account is not activated.. Please check with your branch manager");
						firstUserLogin(userId, message);
					}
				} else {
					System.out.println("Password mismatch..please try again");
					firstUserLogin(userId, message);
				}
			} else {
				System.out.println("Please check your password");
				firstUserLogin(userId, message);
			}
		} else {
			System.out.println("Please enter your correct customerId ");
			firstUserLogin(userId, message);
		}

	}

	private void callBack() {
		System.out.println("do you want to continue? Y/N");
		char ip = scan.next().charAt(0);
		if (ip == 'Y') {
			checkForLogin();
		} else {
			System.out.println("Thankyou for visiting us!!");
		}
	}

	private boolean validateInput(String userName, char gender, String dob, long phNo, long adhaarNo, String mailId,
			String panNo, String street, String city, String state, int pincode) {
		boolean flag = false;
		userName = userName.toLowerCase();
		String phoneNo = String.valueOf(phNo);
		String aadharNo = String.valueOf(adhaarNo);

		Pattern pattern = Pattern.compile("^(.+)@(.+)$"); // email
		Matcher matcher = pattern.matcher(mailId);
		// Pattern pattern1 =
		// Pattern.compile("^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\\\d\\\\d$");
		// // DOB
		// Matcher matcher1 = pattern1.matcher(dob);

		if (!userName.matches("[a-z]+")) {
			System.out.println("Please enter a valid name");
		} else if (!(gender == 'F') && !(gender == 'M')) {
			System.out.println("Please enter a valid gender");
		} else if (!phoneNo.matches("[0-9]+") && !(phoneNo.length() == 10)) {
			System.out.println("Enter a valid PhoneNo");
		} else if (!aadharNo.matches("[0-9]+") && !(aadharNo.length() == 12)) {
			System.out.println("Please enter a valid aadhar No");
		} else if (!matcher.matches()) {
			System.out.println("Please enter a valid email");
		} else if (!dob.matches("[0-9/]+")) {
			System.out.println("Please enter a valid DOB");
		} else {
			flag = true;
		}
		return flag;
	}

}
