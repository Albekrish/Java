package com.abi.flightreservationsystem.Repository;

import java.util.ArrayList;
import java.util.List;

import com.abi.flightreservationsystem.dto.Admin;
import com.abi.flightreservationsystem.dto.Flight;
import com.abi.flightreservationsystem.dto.Passenger;
import com.abi.flightreservationsystem.dto.Ticket;
import com.abi.flightreservationsystem.dto.User;

public class FlightRepository {
	private static FlightRepository flightDbInstance;

	List<Flight> flights = new ArrayList<Flight>();
	List<Ticket> tickets = new ArrayList<Ticket>();
	List<User> users = new ArrayList<User>();
	List<Admin> admins = new ArrayList<Admin>();

	private FlightRepository() {

	}

	public static FlightRepository getInstance() {
		if (flightDbInstance == null) {
			flightDbInstance = new FlightRepository();
			flightDbInstance.initialSetup();
		}
		return flightDbInstance;
	}

	private void initialSetup() {
		// Adding Admin details to the list
		// adminCredentials.add(new Credentials("0001", "admin", "ZSGS"));
		// adminCredentials.add(new Credentials("0002", "bala", "ZSGS"));
		flights.add(new Flight("AirIndia", 1, "chennai", "coimbatore", 70, 7000.00, "7.00AM 18-02-2023"));
		users.add(new User("Abi", "Abi"));
		admins.add(new Admin("Admin", "Admin"));

	}

	public User checkValidUser1(String userName, String password) {
		for (User credential : users) {
			if (credential.getUserName().equals(userName) && credential.getPassword().equals(password)) {
				return credential;
			}
		}
		return null;
	}

	public boolean checkValidUser(String userName, String password) {
		for (User credential : users) {
			if (credential.getUserName().equals(userName) && credential.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkValidAdmin(String userName, String password) {
		for (Admin credential : admins) {
			if (credential.getUserName().equals(userName) && credential.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkAdmin(String userName) {
		for (Admin credential : admins) {
			if (credential.getUserName().equals(userName)) {
				return true;
			}
		}
		return false;
	}

	public boolean addUser(String userName, String password) {
		users.add(new User(userName, password));
		return true;
	}

	public List<Flight> displayAvailableFlights(String userName, String password) {
		return flights;

	}

	public List<Flight> bookSeat(int flightNumber, Passenger p) {
		return flights;
	}

	public Ticket AddTicket(Flight fname, Flight f, Passenger pa, double pr) {
		Ticket a = new Ticket(fname, f, pa, pr);
		tickets.add(a);
		return a;
	}

	public List<Flight> displayAvailableFlights(int flightNumber) {
		return flights;
	}

	public Flight createFlight(String fname, int fN, String origin, String destination, int c, double op, String dt) {
		Flight F = new Flight(fname, fN, origin, destination, c, op, dt);
		flights.add(F);
		return F;

	}

	public boolean cancelTicket(int tnumber, String pname) {
		for (Ticket ticket : tickets) {
			if (ticket.getNumber() == tnumber && ticket.getPassenger().getName().equals(pname)) {
				return true;
			}
		}
		return false;

	}

}
