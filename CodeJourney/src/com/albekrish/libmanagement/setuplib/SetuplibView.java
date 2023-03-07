package com.albekrish.libmanagement.setuplib;

import java.util.Scanner;

public class SetuplibView {

	private Scanner scanner=new Scanner(System.in);
	
	private SetuplibController setuplibController;
	
	public SetuplibView() {
		setuplibController =new SetuplibController(this);
	}
	
	public static void main(String[] args) {
		SetuplibView setuplibView=new SetuplibView();
		setuplibView.userDetails();
				
	}
	
	private void userDetails() {
		System.out.println("Wlecome to Library");
		System.out.println("Enter Library Name:");
		String libName = scanner.nextLine();
		System.out.println("Enter address:");
		String address = scanner.nextLine();
		setuplibController.UpdateLibDetails(libName, address);
	}
	
	public void updateSuccess(String libName) {
		System.out.println("\n-->Welcome To " + libName + " Library<--\n");
		System.out.println("Thanks for Login.");
	}

	public void updateFailed(String errorMessage) {
		System.out.println(errorMessage);
		userDetails();
	}
}
