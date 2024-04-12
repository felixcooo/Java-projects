//package app;

import Homeworks.Airplane;
import Homeworks.Passenger;

public class Driver {

	public static void main(String[] args) {

		// Create an Airplane that will store up to 100 Passengers
		Airplane airplane = new Airplane(100);

		// Create 5 Passenger Objects with the details specified
		Passenger p1 = new Passenger("Albert", 1879, 198.5, 'm', 2);
		Passenger p2 = new Passenger("Grace", 1906, 105, 'f', 1);
		Passenger p3 = new Passenger("Tim", 1955, 216.3, 'm', 2);
		Passenger p4 = new Passenger("Steve", 1955, 160, 'm', 2);
		Passenger p5 = new Passenger("Sergey", 1973, 165.35, 'm', 1);

		// Add the 5 Passenger objects to the Airplane
		airplane.addPassenger(p1);
		airplane.addPassenger(p2);
		airplane.addPassenger(p3);
		airplane.addPassenger(p4);
		airplane.addPassenger(p5);

		// Call the printDetails method from the Airplane to print all the Airplane and
		// Passenger details
		airplane.printAllDetails();

	}// end main

}// end class
