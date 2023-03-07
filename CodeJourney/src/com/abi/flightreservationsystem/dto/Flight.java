package com.abi.flightreservationsystem.dto;

public class Flight {

	private String flightName;
	private int flightNumber;
	private String origin;
	private String destination;
	private int capacity;
	private int numberOfSeatsleft;
	private double originalPrice;
	private String departureTimeDate;

	public Flight(String fname, int fn, String o, String ds, int c, double op, String dt) {
		if (ds.equals(o) == true) {
			throw new IllegalArgumentException("destination and origin are the same");
		}
		flightName = fname;
		flightNumber = fn;
		origin = o;
		destination = ds;
		capacity = c;
		numberOfSeatsleft = c;
		originalPrice = op;
		departureTimeDate = dt;
	}

	public boolean bookASeat() {
		if (numberOfSeatsleft > 0) {
			numberOfSeatsleft = numberOfSeatsleft - 1;
			return true;
		}
		return false;
	}

	public double getPrice() {
		return originalPrice;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public int getNumberOfSeatsleft() {
		return numberOfSeatsleft;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setPrice(double p) {
		originalPrice = p;
	}

	public void setOrigin(String o) {
		origin = o;
	}

	public void setDestination(String d) {
		destination = d;
	}

	public void setFlightNumber(int fn) {
		flightNumber = fn;
	}

	public void setNumberOfSeatsleft(int s) {
		numberOfSeatsleft = s;
	}

	public void setCapacity(int c) {
		capacity = c;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getDepartureTimeDate() {
		return departureTimeDate;
	}

	public void setDepartureTimeDate(String departureTimeDate) {
		this.departureTimeDate = departureTimeDate;
	}

	@Override
	public String toString() {
		String one = "FlightName -" + flightName;
		String two = "Flight- " + flightNumber;
		String three = "," + origin + " to " + destination;
		String four = ", original price- " + originalPrice + "Rs";
		String five = ", departureTimeDate-" + departureTimeDate;
		return one + two + three + four + five;
	}

}
