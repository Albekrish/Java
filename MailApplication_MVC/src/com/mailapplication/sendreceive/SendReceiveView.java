package com.mailapplication.sendreceive;

import java.util.List;
import java.util.Scanner;

import com.mailapplication.dto.MailHistory;
import com.mailapplication.login.LoginView;

public class SendReceiveView implements SendReceiveViewCallBack {

	private SendReceiveControlerViewCallBack sendControler;
	private Scanner input = new Scanner(System.in);

	public SendReceiveView() {
		sendControler = new SendReceiveControler(this);
	}

	public void sendReceiveIndex(String userMail) {
		sendControler.setMailId(userMail);
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
			List<MailHistory> lists = sendControler.inboxMail(userMail);
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
		sendControler.validateMail(receiveMailId);
	}

	@Override
	public String getContent() {
		System.out.println("Enter the mail content to send");
		String content = input.nextLine();
		return content;
	}

	@Override
	public void invalidMail(String string) {
		sendMail();
	}

	@Override
	public void message(String string) {
		System.out.println(string);
	}
	// continue check
}
