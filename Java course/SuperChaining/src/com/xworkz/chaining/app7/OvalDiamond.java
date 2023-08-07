package com.xworkz.chaining.app7;

public class OvalDiamond extends Diamond{
	public OvalDiamond() {
		super("white", "stones", true, true);
		System.out.println("Calling default constructor");
	}
	
	public OvalDiamond(String color,String madeOff,boolean hardestObject,boolean difficultToCut) {
		super(color, madeOff, hardestObject, difficultToCut);
		System.out.println("Calling default constructor");
	}

}
