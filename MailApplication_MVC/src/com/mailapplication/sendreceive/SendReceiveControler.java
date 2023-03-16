package com.mailapplication.sendreceive;

import java.util.List;

import com.mailapplication.dto.MailHistory;

public class SendReceiveControler implements SendReceiveControlerModelCallBack, SendReceiveControlerViewCallBack {

	private SendReceiveViewCallBack sendReceiveView;
	private SendReceiveModelCallBack sendReceiveModel;

	public SendReceiveControler(SendReceiveView sendReceiveView) {
		this.sendReceiveView = sendReceiveView;
		sendReceiveModel = new SendReceiveModel(this);
	}

	@Override
	public void validateMail(String receiveMailId) {
		if (sendReceiveModel.validateMail(receiveMailId)) {
			String content = sendReceiveView.getContent();
			boolean flag = sendReceiveModel.sendMail(receiveMailId, content);
			if (flag) {
				sendReceiveView.message("Mail sent successfully!!");
			} else {
				sendReceiveView.invalidMail("Unable to send due to low network..Please try again..");
			}
		} else {
			sendReceiveView.invalidMail("Enter a valid mail");
		}
	}

	@Override
	public void setMailId(String userMail) {
		sendReceiveModel.setMailId(userMail);
	}

	@Override
	public List<MailHistory> inboxMail(String userMail) {
		return sendReceiveModel.inboxMail(userMail);

	}

}
