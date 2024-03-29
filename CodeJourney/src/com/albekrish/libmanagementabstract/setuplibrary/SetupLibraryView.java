package com.albekrish.libmanagementabstract.setuplibrary;

import java.util.*;

import com.albekrish.libmanagementabstract.managebooks.ManageBooksView;
import com.albekrish.libmanagementabstract.managebooks.ManageBooksViewCallBack;


public class SetupLibraryView extends SetupLibraryViewCallBack{
	private Scanner input = new Scanner(System.in);
	private SetupLibraryControlerCallBack setupLibraryControler;
	private ManageBooksViewCallBack manageBooksView;
	public SetupLibraryView() {
		setupLibraryControler = new SetupLibraryControler(this);
		manageBooksView=new ManageBooksView();
	}

	public void checkLibrary() {
		System.out.println("\t ******************");
		System.out.println("Enter the LibraryName");
		String libraryName = input.nextLine();
		System.out.println("Enter Address");
		String address = input.nextLine();
		setupLibraryControler.libraryCheck(libraryName, address);
	}

	public void libraryFound(String libraryName) {
		System.out.println("Welcome to " + libraryName +"-->");
		manageBooksView.manageBooksIndex();	
	}

	public void libraryNotFound(String errorMessage) {
		System.out.println(errorMessage);
		checkLibrary();
	}

}
