package com.qa.garage;

public class Employee implements Billable {

	private String name;
	private int age;
	private String specialism;

	public Employee(String name, int age, String specialism) {
		super();
		this.name = name;
		this.age = age;
		this.specialism = specialism;
	}

	public Employee() {
		super();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecialism() {
		return this.specialism;
	}

	public void setSpecialism(String specialism) {
		this.specialism = specialism;
	}

	@Override
	public int calcBill() {
		return 0;
	}

}
