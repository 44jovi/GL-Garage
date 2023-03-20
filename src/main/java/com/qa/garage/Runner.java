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
		g.addVehicle(new Car(3, "red"));
		g.addVehicle(new Car(3, "green"));
		g.addVehicle(new Car(3, "green"));
		g.addVehicle(new Car(3, "green"));
		g.addVehicle(new Car(3, "green"));

		System.out.println(g);

//		g.removeByType("car");
		g.remove(Car.class);
		System.out.println(g);

	}

}
