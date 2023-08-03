package com.xworkz.inheritance.app5;

public class Apple extends Fruit{
	public double amount=50;
	public Apple() {
		System.out.println("no args const in apple");
	}
	public void tasty() {
		System.out.println("Calling tasty in apple");
	}

}
