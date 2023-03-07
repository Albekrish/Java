package com.abi.flightreservationsystem.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseAccess {
	private static DatabaseAccess databaseAccess;
	private Statement stmt;
	private Connection con;

	private DatabaseAccess() {
		stmt = null;
		con = null;
	}

	public static DatabaseAccess getInstance() throws Exception {
		if (databaseAccess == null) {
			databaseAccess = new DatabaseAccess();
			databaseAccess.executeConnection();
		}
		return databaseAccess;
	}

	private void executeConnection() throws Exception {
		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "Guduvanchery1988@";
		con = DriverManager.getConnection(url, username, password);
		stmt = con.createStatement();
	}

	public boolean checkAdmin(String userName, String password) {
		try {
			ResultSet admin = stmt.executeQuery(
					"select userName from admin where username='" + userName + "'&& password='" + password + "'");
			if (admin.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean checkUser(String userName, String password) {
		try {
			ResultSet loginName = stmt.executeQuery(
					"select userName from user where username='" + userName + "'&& password='" + password + "'");
			if (loginName.next()) {
				return true;
			}
		} catch (Exception E) {
			E.printStackTrace();
		}
		return false;
	}

	public void addUser(String userMail, String password) {
		try {
			stmt.executeUpdate(
					"insert into userlogin (username,password) values ('" + userMail + "','" + password + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ResultSet getFlightInfo() {
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery("select * from flightdetails");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return rs;
	}

	public ResultSet getRemainingSeat(int flightId) {
		ResultSet totalSeats = null;
		try {
			totalSeats = stmt.executeQuery(
					"select availableseat,currentseat from flightdetails where flightid='" + flightId + "' ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totalSeats;

	}

	public boolean updateValues(int flightId2, int availableSeats, int currentSeat) {
		try {
			stmt.executeUpdate("UPDATE flightdetails SET availableseat = '" + availableSeats + "', currentseat = '"
					+ currentSeat + "' where flightid='" + flightId2 + "'");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void addNewFlight(String flightName, String depature, String destination) {
		try {
			stmt.executeUpdate("insert into flightdetails (flightname,pickup,destination) values ('" + flightName
					+ "','" + depature + "','" + destination + "' )");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ResultSet showAvailableFlight(String origin, String destination) {
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(
					" select * from flightdetails where pickup='" + origin + "' and destination='" + destination + "'");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

}
