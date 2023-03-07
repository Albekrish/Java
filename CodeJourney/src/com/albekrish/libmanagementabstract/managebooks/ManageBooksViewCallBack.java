package com.albekrish.libmanagementabstract.managebooks;

import java.util.HashSet;

public abstract class ManageBooksViewCallBack {
	public abstract void manageBooksIndex();
	abstract void getBookName();
	abstract void bookAdded(String message);
	abstract void duplicateBook(String message);
	abstract void showBooks(HashSet<String> bookNames);
	abstract void exitMethod();	
}
