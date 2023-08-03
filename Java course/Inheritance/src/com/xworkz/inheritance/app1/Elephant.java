package com.xworkz.inheritance.app1;

public class Elephant extends Animal{
public int noOfLegs=4;
	
	public Elephant() {
		System.out.println("no args const in Elephant");
	}
	public void walks()
	{
		System.out.println("calling walks in  Elephant");
	}

}
