package com.xworkz.inheritance.app5;

public class Orange extends Fruit {
	public double amount=40;
	public Orange() {
		System.out.println("no args const in orange");
	}
	public void tasty() {
		System.out.println("Calling tasty in orange");
	}

}
