package com.xworkz.chaining.app5;

public class PlayGround extends Ground{
	public PlayGround() {
		super("chinnaswamy","banglore",250,40);
		System.out.println("Calling Default Constructer");
	}
	public PlayGround(String name,String location,double sqrFeet,int noOfChairs) {
		super(name,location,sqrFeet,noOfChairs);
		System.out.println("Calling Parametreized Constructer");
	}

}
