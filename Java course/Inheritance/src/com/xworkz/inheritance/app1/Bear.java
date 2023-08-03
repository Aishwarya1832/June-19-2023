package com.xworkz.inheritance.app1;

public class Bear extends Animal{
public int noOfLegs=4;
	
	public Bear() {
		System.out.println("no args const in Bear");
	}
	public void eat()
	{
		System.out.println("calling eat in Bear");
	}


}
