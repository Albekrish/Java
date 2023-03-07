package com.abi.flightreservationsystem.dto;

public class Ticket {
	private Flight flight;

	private Passenger passenger;
	private double price;
	private int number;
	private static int count = 0;

	public Ticket(Flight fname, Flight f, Passenger pa, double pr) {
		count++;
		flight = fname;
		flight = f;
		passenger = pa;
		price = pr;
		number = count;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight F) {
		flight = F;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger P) {
		passenger = P;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double P) {
		price = P;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int n) {
		number = n;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int n) {
		count = n;
	}

	@Override
	public String toString() {
		String one = passenger.getName() + ",Flight" + flight.getFlightNumber() + ", FlightName"
				+ flight.getFlightName();
		String two = ", " + flight.getOrigin() + " to " + flight.getDestination();
		String three = ", original price: " + flight.getPrice() + "Rs";
		String four = ", ticket price: " + price + "Rs";
		String five = ", TicketNumber" + number;
		return one + two + three + four + five;
	}
}
