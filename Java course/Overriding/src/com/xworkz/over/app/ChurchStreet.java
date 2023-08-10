package com.xworkz.over.app;

public class ChurchStreet extends Street {
	@Override
	public void drives() {
		System.out.println("calling sub class with no args");
	}
	@Override
	public void drives(String homeName) {
		System.out.println("calling sub class with homename args");
		System.out.println("Home name:" + homeName);
	}
	@Override
	public void drives(int homeNumber) {
		System.out.println("calling sub class with homenumber args");
		System.out.println("Home number:" + homeNumber);
	}
	@Override
	public void drive(double cross) {
		System.out.println("calling sub class with cross args");
		System.out.println("cross:" + cross);
	}
	@Override
	public void drives(String homeName, int homeNumber) {
		System.out.println("calling sub class with homename,homeNumber args");
		System.out.println("Home name:" + homeName);
		System.out.println("Home number:" + homeNumber);
	}
	@Override
	public void drives(String homeName, int homeNumber, double cross) {
		System.out.println("calling sub class with homename,homeNumber,cross args");
		System.out.println("Home name:" + homeName);
		System.out.println("Home number:" + homeNumber);
		System.out.println("cross:" + cross);

	}

}
