package com.xworkz.over.app;

public class GirlsHostel extends Hostel{
	@Override
	public void establish() {
		System.out.println("Calling sub hostel class with no args");
	}
	@Override
	public void establish(int year) {
		System.out.println("Calling sub hostel class with year args");
		System.out.println("Year:" + year);
	}
	@Override
	public void establish(String name) {
		System.out.println("Calling sub  hostel class with name args");
		System.out.println("name:" + name);
	}
	@Override
	public void establish(float howManyYear) {
		System.out.println("Calling sub hostel class with howmany year args");
		System.out.println("howManyYear:" + howManyYear);
	}
	@Override
	public void establish(String name, int year) {
		System.out.println("Calling sub hostel class with name,year args");
		System.out.println("name:" + name);
		System.out.println("Year:" + year);
	}
	@Override
	public void establish(String name, int year,float howManyYear) {
		System.out.println("Calling sub hostel class with name,year,howmanyyear args");
		System.out.println("name:" + name);
		System.out.println("Year:" + year);
		System.out.println("howManyYear:" + howManyYear);
	}

}
