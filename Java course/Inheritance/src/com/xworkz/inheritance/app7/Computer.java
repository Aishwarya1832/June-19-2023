package com.xworkz.inheritance.app7;

public class Computer extends Machine {
	public double price=20000;
	public Computer() {
		System.out.println("no args const in computer");
	}
	public void works() {
		System.out.println("Calling works in computer");
	}

}
