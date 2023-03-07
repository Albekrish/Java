package com.abi.flightreservationsystem.Booking;

import java.util.ArrayList;
import java.util.List;

import com.abi.flightreservationsystem.Repository.FlightRepository;
import com.abi.flightreservationsystem.dto.Flight;
import com.abi.flightreservationsystem.dto.Passenger;
import com.abi.flightreservationsystem.dto.Ticket;

public class BookingModel {
	private BookingController bookingController;

	public BookingModel(BookingController bookingController) {
		this.bookingController = bookingController;

	}

	public Flight createFlights(String fname, int fN, String origin, String destination, int c, double op, String dt) {
		Flight F = FlightRepository.getInstance().createFlight(fname, fN, origin, destination, c, op, dt);
		return F;
	}

	public List<Flight> displayAvailableFlights(String origin, String destination) {
		List<Flight> flights = FlightRepository.getInstance().displayAvailableFlights(origin, destination);
		List<Flight> result = new ArrayList<>();
		int size, seats;
		String o, d;
		size = flights.size();
		for (int i = 0; i < size; i++) {
			o = flights.get(i).getOrigin();
			d = flights.get(i).getDestination();
			seats = flights.get(i).getNumberOfSeatsleft();

			if ((o.equals(origin) == true) && (d.equals(destination) == true) && seats > 0) {
				result.add(flights.get(i));
			}
		}
		return result;
	}

	public Ticket bookSeat(int flightNumber, Passenger p) {
		List<Flight> flights = FlightRepository.getInstance().bookSeat(flightNumber, p);
		Ticket a = null;
		int size = flights.size();
		boolean flag = false;
		int index = 0, seats;

		for (int i = 0; i < size; i++) {
			if (flights.get(i).getFlightNumber() == flightNumber) {
				flag = true;
				index = i;
				break;
			}
		}
		double price;
		seats = flights.get(index).getNumberOfSeatsleft();
		if (flag == true && (seats > 0)) {
			flights.get(index).bookASeat();
			price = p.applyDiscount(flights.get(index).getPrice());

			a = FlightRepository.getInstance().AddTicket(flights.get(0), flights.get(index), p, price);
		}
		return a;
	}

	public boolean checkAdmin(String userName) {
		return FlightRepository.getInstance().checkAdmin(userName);
	}

	public Flight getFlight(int flightNumber) {
		List<Flight> flights = FlightRepository.getInstance().displayAvailableFlights(flightNumber);
		int size = flights.size();
		for (int i = 0; i < size; i++) {
			if (flights.get(i).getFlightNumber() == flightNumber) {
				return flights.get(i);
			}
		}
		return null;
	}

	public boolean cancelTicket(int tnumber, String pname) {
		return FlightRepository.getInstance().cancelTicket(tnumber, pname);

	}

}
