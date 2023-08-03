package com.xworkz.inheritance.app7;

public class Laptop extends Machine{
	public double price=45000;
	public Laptop() {
		System.out.println("no args const in laptop");
	}
	public void works() {
		System.out.println("Calling works in laptop");
	}

}
