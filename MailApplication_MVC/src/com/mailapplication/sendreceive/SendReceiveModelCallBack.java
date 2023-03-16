package com.mailapplication.sendreceive;

import java.util.List;

import com.mailapplication.dto.MailHistory;

public interface SendReceiveModelCallBack {

	boolean validateMail(String receiveMailId);

	void setMailId(String userMail);

	boolean sendMail(String receiveMailId, String content);

	List<MailHistory> inboxMail(String userMail);

}
