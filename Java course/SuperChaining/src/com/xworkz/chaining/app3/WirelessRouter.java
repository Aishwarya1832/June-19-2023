package com.xworkz.chaining.app3;

public class WirelessRouter extends Router {
	public WirelessRouter()
	{
		super("Default Routing","Access Servers ","Data Transfer","Wired router");
		System.out.println("Calling Default Constructor");
	}
	
	public WirelessRouter(String feature,String otherName,String function,String type)
	{
		super( feature, otherName, function, type);
		System.out.println("Calling parameterized constructor");
	}

}
