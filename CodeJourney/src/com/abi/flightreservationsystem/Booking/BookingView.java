package com.abi.flightreservationsystem.Booking;

import java.util.List;
import java.util.Scanner;

import com.abi.flightreservationsystem.dto.Flight;
import com.abi.flightreservationsystem.dto.Passenger;
import com.abi.flightreservationsystem.dto.Ticket;
import com.abi.flightreservationsystem.dto.Member;
import com.abi.flightreservationsystem.dto.NonMember;

public class BookingView {

	private BookingController bookingController;
	private static Scanner scan1 = new Scanner(System.in);

	public BookingView() {
		bookingController = new BookingController(this);

	}

//	public static void main(String[] args) {
//		new BookingView().intialSetup("Admin");
//
//	}

	public void intialSetup(String user) {
		String input, destination, origin, name, pname;
		int FN, age, years, tnumber, noSeat;
		boolean flag = false;

		while (flag != true) {
			System.out.println("Enter 1 to create a flight ");
			System.out.println("Enter 2 to display all flights ");
			System.out.println("Enter 3 to get flight information");
			System.out.println("Enter 4 to book a seat");
			System.out.println("Enter 5 to cancel booking");
			System.out.println("Enter 6 to exit application");
			input = scan1.next();

			switch (input) {
			case "1":
				if (bookingController.checkAdmin(user)) {
					createFlights();
				} else {
					System.out.println("Please login as admin to create a flight");
				}
				break;
			case "2":
				System.out.println("Enter flight origin");
				origin = scan1.next();
				System.out.println("Enter flight destination");
				destination = scan1.next();
				List<Flight> result = bookingController.displayAvailableFlights(origin, destination);
				if (result.isEmpty()) {
					System.out.println("Currently there is no vaialble flight");
				} else {
					System.out.println("List of Flights: ");
					for (Flight flight : result) {
						System.out.println(flight);
					}
				}
				// flag = true;
				break;
			case "3":
				System.out.println("Enter Flight number");
				FN = scan1.nextInt();
				Flight F = bookingController.getFlight(FN);
				if (F == null) {
					System.out.println("Flight " + FN + " does not exist");
				} else {
					System.out.println("Info for Flight " + FN + ":");
					System.out.println(F);
				}
				break;
			case "4":
				System.out.println("Please enter the no. of tickets you want to book..");
				noSeat = scan1.nextInt();
				System.out.println("Enter flight number");
				FN = scan1.nextInt();

				Flight flight;
				flight = bookingController.getFlight(FN);
				if (flight.getNumberOfSeatsleft() - noSeat >= 0) {
					Passenger P;
					Ticket t = null;

					System.out.println("If passenger is non memeber enter n, if passenger is a member enter m");
					input = scan1.next();
					System.out.println("Enter passengers age");
					age = scan1.nextInt();
					System.out.println("Enter passengers name");
					name = scan1.next();

					if (input.equals("n") == true) {
						P = new NonMember(age, name);
						t = bookingController.bookSeat(FN, P);
					} else if (input.equals("m") == true) {
						System.out.println("For how many years has the passenger been a member");
						years = scan1.nextInt();
						P = new Member(years, age, name);
						t = bookingController.bookSeat(FN, P);
					}
					if (t.equals(null)) {
						System.out.println("No available seats.");
					} else {
						System.out.println("Ticket is Booked...");
						System.out.println(t);
					}
				} else {
					System.out.println(flight.getNumberOfSeatsleft()
							+ " seats are only available to book. Please select with in the limit");
				}
				break;
			case "5":
				System.out.println("Enter the ticket no to cancel booking");
				tnumber = scan1.nextInt();
				System.out.println("Enter the passenger name ");
				pname = scan1.next();
				if (bookingController.cancelTicket(tnumber, pname)) {
					System.out.println(tnumber + "-The ticket is cancelled..");
				} else {
					System.out.println("Please check the ticket details..");
				}
				break;
			case "6":
				flag = true;
				System.out.println("Program is terminated");
				break;
			default:
				System.out.println("You entered an invalid option");
				break;
			}
		}
	}

	public void createFlights() {
		int FN, c;
		double op;
		String origin, destination, dt, fname;
		// scan1.next();
		System.out.println("Enter flight name");
		fname = scan1.next();
		System.out.println("Enter flight Number");
		FN = scan1.nextInt();
		System.out.println("Enter flight origin");
		origin = scan1.next();
		System.out.println("Enter flight destination");
		destination = scan1.next();
		System.out.println("Enter flight capacity");
		c = scan1.nextInt();
		System.out.println("Enter original price of ticket");
		op = scan1.nextDouble();
		System.out.println("Enter flight departure time and date");
		dt = scan1.next();
		Flight F = bookingController.createFlights(fname, FN, origin, destination, c, op, dt);

		System.out.println("The following flight has been created:");
		System.out.println("....................");
		System.out.println(F);
		System.out.println(".....................");
	}

}
