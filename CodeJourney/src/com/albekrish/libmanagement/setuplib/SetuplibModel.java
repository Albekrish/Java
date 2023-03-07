package com.albekrish.libmanagement.setuplib;

import java.util.HashMap;

public class SetuplibModel {
	private  SetuplibController setuplibController;
	
	private HashMap<String, String> hm=new HashMap<>();
	public SetuplibModel(SetuplibController setuplibController) {
		this.setuplibController=setuplibController;
	}
	public void userDetails(String libName, String address) {		
		if(!libName.isEmpty() && !address.isEmpty()) {
			hm.put(libName, address);
			setuplibController.updateSuccess(libName);
		}else {
			setuplibController.updateFailiure("\n unable update details. Please try again!\n");
		}
		
	}

}
