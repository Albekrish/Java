package com.mailapplication.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

import com.mailapplication.dto.MailHistory;

public class Repository {

	private static Repository repository;
	private Statement stmt;
	private Connection con;

	private Repository() {
		con = null;
		stmt = null;
	}

	public static Repository getInstance() {
		if (repository == null) {
			repository = new Repository();
			repository.getConnection();
		}
		return repository;
	}

	public static void main(String[] args) {
		// getInstance().validateMail("Abi", "welcome");
		// getInstance().addNewUser("Abi","welcome","Abirami","krish",LocalDate.now(),"female","phoneno");
		boolean flag = getInstance().sendMail("Abi", "abirami.k@gmail.com", "Mail is working ");
	}

	private void getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/mail";
			String username = "root";
			String password = "Guduvanchery1988@";
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
		} catch (Exception e) {
			System.out.println("Unable to connect database");
		}
	}

	public boolean checkNewEmail(String emailId) {
		try {
			ResultSet email = stmt.executeQuery("select * from userdetail where mail_id ='" + emailId + "'");
			if (email.next())
				return false;
		} catch (Exception e) {
			System.out.println(e);
		}

		return true;
	}

	public boolean addNewUser(String emailId, String password, String firstName, String lastName, LocalDate dob,
			String gender, String phoneNo) {
		try {
			stmt.executeUpdate("insert into userdetail (mail_id,first_name,last_name,dob,password,gender) values ('"
					+ emailId + "','" + firstName + "','" + lastName + "','" + dob + "','" + password + "','" + gender
					+ "') ");
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public boolean validateMail(String mailId, String password) {
		try {
			ResultSet validate = stmt.executeQuery(
					"Select * from userdetail where mail_id='" + mailId + "'&& password='" + password + "'");
			if (validate.next())
				return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public boolean validateToMail(String receiveMailId) {
		try {
			ResultSet validate = stmt.executeQuery("Select * from userdetail where mail_id='" + receiveMailId + "'");
			if (validate.next())
				return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public boolean sendMail(String mailId, String receiveMail, String content) {
		try {
			stmt.executeUpdate("insert into mailhistory values('" + mailId + "','" + receiveMail + "','" + content
					+ "','" + LocalDate.now().toString() + "','" + LocalTime.now().toString() + "')");
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public List<MailHistory> inboxMail(String userMail) {
		List<MailHistory> result = new LinkedList<>();
		MailHistory mailHistory = new MailHistory();
		try {
			ResultSet inbox = stmt.executeQuery("select * from mailhistory where to_mail = '" + userMail + "'");
			while (inbox.next()) {
				mailHistory.setFrom(inbox.getString("from"));
				mailHistory.setContent(inbox.getString("content"));
				mailHistory.setDate(inbox.getDate("date"));
				mailHistory.setTime(inbox.getTime("time"));
				result.add(mailHistory);
			}
			return result;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

	}

	public boolean forgotPassword(String mailId, String phoneNo) {
		try {
			ResultSet validate = stmt.executeQuery(
					"Select * from userdetail where mail_id='" + mailId + "'&& phoneno='" + phoneNo + "'");
			if (validate.next())
				return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
//UPDATE `mail`.`userdetail` SET `phoneno` = '8798654345' WHERE (`mail_id` = 'Lakshmi@gmail.com');

	public boolean resetPassword(String mailId, String pw) {
		try {
			stmt.executeUpdate("Update userdetail SET password = '" + pw + "' where mail_id = '" + mailId + "';");
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

}
