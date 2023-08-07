package com.xworkz.chaining.app4;

public class JuteRope extends Rope{
	public JuteRope() {
		super(500,50,'M',"tying");
		System.out.println("Calling Default Constructer");
	}

	public JuteRope(int meters, double cost, char thickness, String usedFor) {
		super(meters, cost, thickness, usedFor);
		System.out.println("Calling Parametreized Constructer");
		
	}

}
