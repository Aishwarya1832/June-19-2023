package com.xworkz.inheritance.app1;

public class Cat extends Animal {
	public int noOfLegs=4;
	
	public Cat() {
		System.out.println("no args const in cat");
	}
	public void drinks()
	{
		System.out.println("calling drinks in cat");
	}

}
