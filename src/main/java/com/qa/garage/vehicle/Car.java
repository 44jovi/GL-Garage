package com.qa.garage.vehicle;

public class Car extends Vehicle {

	public Car(int numWheels, String colour) {
		super(numWheels, colour);
	}

	@Override
	public int calcBill() {
		return 10;
	}

//	@Override
//	public String toString() {
//		System.out.println(this.id);
//		return "Car [numWheels=" + this.getNumWheels() + ", colour=" + this.getColour() + "]";
//	}
}
