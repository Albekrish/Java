package com.albekrish.libmanagement.addbooks;

import java.util.List;

public class BookController {
	private BookView bookView;
	private BookModel bookModel;
	
	public BookController(BookView bookView) {
		this.bookView =bookView;
		bookModel=new BookModel(this);
	}
	
	

	public void updateBook(String libName, List<String> bookName) {
		bookModel.updateBook(libName,bookName);
		
	}
	public void updateSuccess(String libName) {
		bookView.updateSuccess(libName);
	}

	public void updateFailed(String errorMessage) {
		bookView.updateFailed(errorMessage);
	}
}
