package com.mailapplication.sendreceive;

import java.util.List;
import java.util.Scanner;

import com.mailapplication.dto.MailHistory;
import com.mailapplication.login.LoginView;

public class SendReceiveView{

	private SendReceiveModel sendModel;
	private Scanner input = new Scanner(System.in);

	public SendReceiveView() {
		sendModel = new SendReceiveModel(this);
	}

	public void sendReceiveIndex(String userMail) {
		setMailId(userMail);
		System.out.println("Welcome --->" + userMail);
		System.out.println("Enter 1: Send mail");
		System.out.println("Enter 2: Inbox");
		System.out.println("Enter 3: Log-out");
		String option = input.nextLine();
		switch (Integer.parseInt(option)) {
		case 1:
			sendMail();
			break;
		case 2:
			List<MailHistory> lists = inboxMail(userMail);
			System.out.println("your have" + lists.size() + " no. of mails in your inbox");
			for (MailHistory list : lists) {
				System.out.println(list);
			}
			break;
		case 3:
			System.out.println("Log-out Success");
			 new LoginView().loginIndex();
			 break;
		default:
			System.out.println("invalid option");
			break;
		}
	}

	private void sendMail() {
		System.out.print("Enter the receiver mail id ---> ");
		String receiveMailId = input.nextLine();
		validateMail(receiveMailId);
	}

	public String getContent() {
		System.out.println("Enter the mail content to send");
		String content = input.nextLine();
		return content;
	}

	public void invalidMail(String string) {
		sendMail();
	}

	public void message(String string) {
		System.out.println(string);
	}
	// continue check
	public void validateMail(String receiveMailId) {
		if (sendModel.validateMail(receiveMailId)) {
			String content = getContent();
			boolean flag = sendModel.sendMail(receiveMailId, content);
			if (flag) {
				message("Mail sent successfully!!");
			} else {
				invalidMail("Unable to send due to low network..Please try again..");
			}
		} else {
			invalidMail("Enter a valid mail");
		}
	}

	public void setMailId(String userMail) {
		sendModel.setMailId(userMail);
	}

	public List<MailHistory> inboxMail(String userMail) {
		return sendModel.inboxMail(userMail);

	}


}
