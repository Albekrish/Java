package com.mailapplication.sendreceive;

import java.util.List;

import com.mailapplication.dto.MailHistory;
import com.mailapplication.repository.Repository;

public class SendReceiveModel{

	private SendReceiveView sendReceiveView;
	private String mailId;

	public SendReceiveModel(SendReceiveView sendReceiveView) {
		this.sendReceiveView = sendReceiveView;
	}

	public boolean validateMail(String receiveMailId) {
		return Repository.getInstance().validateToMail(receiveMailId);
	}

	public void setMailId(String userMail) {
		this.mailId = userMail;
	}

	public boolean sendMail(String receiveMail, String content) {
		return Repository.getInstance().sendMail(mailId, receiveMail, content);

	}

	public List<MailHistory> inboxMail(String userMail) {
		return Repository.getInstance().inboxMail(userMail);

	}

}
