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

		// "Manually" closing the scanner:
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Search by Vehicle ID - please enter ID:");
//		int userInput = scan.nextInt();
//		System.out.println("Thanks, you entered Vehicle ID " + userInput);
//
//		try {
//			System.out.println(g.findById(userInput));
//		} catch (VehicleNotFoundException e) {
//			System.out.println(e);
//		} finally {
//			System.out.println("Try again.");
//			scan.close();
//		}

		// Automatically closing the scanner with try-with-resources block
//		try (Scanner scan = new Scanner(System.in)) {
//			System.out.println("Search by Vehicle ID - please enter ID:");
//			int userInput = scan.nextInt();
//			System.out.println("Thanks, you entered Vehicle ID " + userInput);
//
//			try {
//				System.out.println(g.findById(userInput));
//			} catch (VehicleNotFoundException e) {
//				System.out.println(e);
//			}
//		}

		// Loop the scanner until user quits
		try (Scanner scan = new Scanner(System.in)) {
			int userInput = 99;

			while (userInput != 0) {
				System.out.println("Search by Vehicle ID - please enter ID (enter 0 to quit):");
				userInput = scan.nextInt();

				System.out.println("Thanks, you entered Vehicle ID " + userInput);

				try {
					System.out.println(g.findById(userInput));
				} catch (VehicleNotFoundException e) {
					System.out.println(e);
				}
			}

		}
	}

}
