package com.mailapplication.sendreceive;

import java.util.List;

import com.mailapplication.dto.MailHistory;
import com.mailapplication.repository.Repository;

public class SendReceiveModel implements SendReceiveModelCallBack {

	private SendReceiveControlerModelCallBack sendReceiveControler;
	private String mailId;

	public SendReceiveModel(SendReceiveControler sendReceiveControler) {
		this.sendReceiveControler = sendReceiveControler;
	}

	@Override
	public boolean validateMail(String receiveMailId) {
		return Repository.getInstance().validateToMail(receiveMailId);
	}

	@Override
	public void setMailId(String userMail) {
		this.mailId = userMail;
	}

	@Override
	public boolean sendMail(String receiveMail, String content) {
		return Repository.getInstance().sendMail(mailId, receiveMail, content);

	}

	@Override
	public List<MailHistory> inboxMail(String userMail) {
		return Repository.getInstance().inboxMail(userMail);

	}

}
