package com.albekrish.libmanagement.addbooks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookModel {
	private BookController bookController;
	
	private HashMap<String, List<String>> hm =new HashMap<>();
	
	public BookModel(BookController bookController){
		this.bookController=bookController;
	}
	
	public void updateBook(String libName, List<String> bookName) {
		if(!libName.isEmpty() && !bookName.isEmpty()) {			
			hm.put(libName, bookName);
			bookController.updateSuccess(libName);
		}else {
			bookController.updateFailed("Please add the proper details");
		}
		
	}
	


	

}
