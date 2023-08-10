package com.xworkz.over.app;

public class Street {
	public void drives() {
		System.out.println("calling parent class with no args");
	}
	public void drives(String homeName) {
		System.out.println("calling parent class with homename args");
		System.out.println("Home name:"+homeName);
	}
	public void drives(int homeNumber) {
		System.out.println("calling parent class with homenumber args");
		System.out.println("Home number:"+homeNumber);
	}
	public void drive(double cross) {
		System.out.println("calling parent class with cross args");
		System.out.println("cross:"+cross);
	}
	public void drives(String homeName,int homeNumber) {
		System.out.println("calling parent class with homename,homeNumber args");
		System.out.println("Home name:"+homeName);
		System.out.println("Home number:"+homeNumber);
	}
	public void drives(String homeName,int homeNumber,double cross) {
		System.out.println("calling parent class with homename,homeNumber,cross args");
		System.out.println("Home name:"+homeName);
		System.out.println("Home number:"+homeNumber);
		System.out.println("cross:"+cross);
		
	}


}
