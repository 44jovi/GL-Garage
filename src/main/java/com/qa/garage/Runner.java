package com.qa.garage;

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

		try {
			g.findById(100);
		} catch (VehicleNotFoundException e) {
			System.out.println(e);
		} finally {
			System.out.println("TESTING THE FINALLY");
		}
	}

}
