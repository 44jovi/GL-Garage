package com.qa.garage.vehicle;

public class Plane extends Vehicle {

	public Plane(int numWheels, String colour) {
		super(numWheels, colour);
	}

	@Override
	public int calcBill() {
		return 23;
	}

//	@Override
//	public String toString() {
//		return "Plane [numWheels=" + this.getNumWheels() + ", colour=" + this.getColour() + "]";
//	}
}
