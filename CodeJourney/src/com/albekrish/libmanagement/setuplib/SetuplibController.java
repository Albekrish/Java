package com.albekrish.libmanagement.setuplib;

public class SetuplibController {

	private SetuplibView setuplibView;
	private SetuplibModel setuplibModel;
	public SetuplibController(SetuplibView setuplibView) {
		this.setuplibView=setuplibView;
		setuplibModel=new SetuplibModel(this);
	}
	
	public void UpdateLibDetails(String libName, String address) {
		setuplibModel.userDetails(libName, address);
		
	}
	
	public void updateSuccess(String libName) {
		setuplibView.updateSuccess(libName);

	}

	public void updateFailiure(String errorMessage) {
		setuplibView.updateFailed(errorMessage);

	}

}
