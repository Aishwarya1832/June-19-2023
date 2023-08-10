package com.xworkz.over.app;

public class Hostel {
	public void establish() {
		System.out.println("Calling parent hostel class with no args");
	}

	public void establish(int year) {
		System.out.println("Calling parent hostel class with year args");
		System.out.println("Year:" + year);
	}

	public void establish(String name) {
		System.out.println("Calling parent hostel class with name args");
		System.out.println("name:" + name);
	}

	public void establish(float howManyYear) {
		System.out.println("Calling parent hostel class with howmany year args");
		System.out.println("howManyYear:" + howManyYear);
	}

	public void establish(String name, int year) {
		System.out.println("Calling parent hostel class with name,year args");
		System.out.println("name:" + name);
		System.out.println("Year:" + year);
	}
	public void establish(String name, int year,float howManyYear) {
		System.out.println("Calling parent hostel class with name,year,howmanyyear args");
		System.out.println("name:" + name);
		System.out.println("Year:" + year);
		System.out.println("howManyYear:" + howManyYear);
	}


}
