package com.mailapplication.sendreceive;

import java.util.List;

import com.mailapplication.dto.MailHistory;

public interface SendReceiveControlerViewCallBack {

	void validateMail(String receiveMailId);

	void setMailId(String userMail);

	List<MailHistory> inboxMail(String userMail);

}
