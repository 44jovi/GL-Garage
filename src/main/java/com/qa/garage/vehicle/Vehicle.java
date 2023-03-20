package com.qa.garage.vehicle;

import com.qa.garage.Billable;

public abstract class Vehicle implements Billable {

	private static int count = 1;

	private int numWheels;

	private String colour;

	private final int id;

	public Vehicle(int numWheels, String colour) {
		super();
		this.id = count;
		count++;
		this.numWheels = numWheels;
		this.colour = colour;
	}

	public abstract int calcBill();

	public int getId() {
		return this.id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public int getNumWheels() {
		return this.numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		// TODO: consider how to have each sub class override this
		// while still including ID
		return "Vehicle [id=" + this.id + ", numWheels=" + this.numWheels + ", colour=" + this.colour + "]";
	}
}
