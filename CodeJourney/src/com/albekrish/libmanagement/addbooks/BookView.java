package com.albekrish.libmanagement.addbooks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookView {
	private BookController bookController;
	private Scanner sc=new Scanner(System.in);
	
	public BookView() {
		bookController=new BookController(this);
	}

	public static void main(String[] args) {
		BookView bookView=new BookView();
		bookView.updateBook();

	}

	private void updateBook() {
		List<String> bookName=new ArrayList<>();
		System.out.println("Wlecome to Library \n");
		System.out.println("Please enter LibName to addBook");
		String libName=sc.nextLine();
		System.out.println("Please enter the no.of book to add in the library");
		int n=sc.nextInt();
		System.out.println("Please enter BookName to add library:");
		for(int i=0;i<n;i++) {
			bookName.add(sc.next());			
		}
		bookController.updateBook(libName, bookName);
		
	}
	public void updateSuccess(String libName) {
		System.out.println("The books are added to "+libName+" successfully");
		System.out.println("Thank You! Please Visit again");
	}

	public void updateFailed(String errorMessage) {
		System.out.println(errorMessage);
		updateBook();
	}
}
