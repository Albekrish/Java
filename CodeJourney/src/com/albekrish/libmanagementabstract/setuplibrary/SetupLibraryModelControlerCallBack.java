package com.albekrish.libmanagementabstract.setuplibrary;

public interface SetupLibraryModelControlerCallBack {
	void libraryFound(String libraryName);
	void libraryNotFound(String errorMessage);
}
