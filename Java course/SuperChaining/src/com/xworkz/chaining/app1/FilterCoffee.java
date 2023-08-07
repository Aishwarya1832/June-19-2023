package com.xworkz.chaining.app1;

public class FilterCoffee extends Coffee{
	public FilterCoffee()
	{
		super("Cappuccinno","Light Brown", true,1500);
		System.out.println("Calling Default Constructer");
	}
	
	public FilterCoffee(String name,String color,boolean sweet,int amount)
	{
		super(name,color,sweet,amount);
		System.out.println("Calling Parametreized Constructer");
	}

}
