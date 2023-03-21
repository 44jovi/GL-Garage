package com.qa.garage;

import java.util.Scanner;

import com.qa.garage.vehicle.Bike;
import com.qa.garage.vehicle.Boat;
import com.qa.garage.vehicle.Car;

public class Runner {

	public static void main(String[] args) {
		Garage g = new Garage();

		g.addVehicle(new Car(4, "Black"));
		g.addVehicle(new Boat(0, "Blue"));
		g.addVehicle(new Bike(2, "Red"));
		g.addVehicle(new Car(3, "Red"));
		g.addVehicle(new Car(4, "Green"));
		g.addVehicle(new Bike(2, "Yellow"));

		System.out.println(g);

//		g.removeByType("car");
		g.remove(Car.class);
		System.out.println(g);

		g.addBillable(new Car(4, "Orange"));
		g.addBillable(new Bike(2, "Brown"));
		g.addBillable(new Employee("Bob", 44, "Engine Expert"));

		g.returnBillablesTotal();

		// TODO: Use a scanner to take in the id
		// TODO: Close the scanner in a finally
		// TODO: Close the scanner in a try-with-resources

		Scanner scan = new Scanner(System.in);
		System.out.println("Search by Vehicle ID - please enter ID:");
		int userInput = scan.nextInt();
		System.out.println("Thanks, you entered Vehicle ID " + userInput);

		try {
			System.out.println(g.findById(userInput));
		} catch (VehicleNotFoundException e) {
			System.out.println(e);
		} finally {
			System.out.println("Try again.");
			scan.close();
		}
	}

}
