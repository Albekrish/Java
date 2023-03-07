package com.abi.flightreservationsystem.Booking;

import java.util.List;
import java.util.Scanner;
import com.abi.flightreservationsystem.dto.Flight;
import com.abi.flightreservationsystem.dto.Passenger;
import com.abi.flightreservationsystem.dto.Ticket;

public class BookingController {

	private BookingView bookingView;
	private BookingModel bookingModel;

	public BookingController(BookingView bookingView) {
		this.bookingView = bookingView;
		this.bookingModel = new BookingModel(this);

	}

	public List<Flight> displayAvailableFlights(String origin, String destination) {
		return bookingModel.displayAvailableFlights(origin, destination);
	}

	public Flight getFlight(int flightNumber) {
		Flight flight = bookingModel.getFlight(flightNumber);
		return flight;
	}

	public Ticket bookSeat(int flightNumber, Passenger p) {
		return bookingModel.bookSeat(flightNumber, p);
	}

	public boolean checkAdmin(String userName) {
		return bookingModel.checkAdmin(userName);
	}

	public boolean cancelTicket(int tnumber, String pname) {
		return bookingModel.cancelTicket(tnumber, pname);

	}

	public Flight createFlights(String fname, int fN, String origin, String destination, int c, double op, String dt) {
		return bookingModel.createFlights(fname, fN, origin, destination, c, op, dt);

	}

}
