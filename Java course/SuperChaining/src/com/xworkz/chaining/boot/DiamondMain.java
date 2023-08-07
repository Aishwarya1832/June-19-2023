package com.xworkz.chaining.boot;

import com.xworkz.chaining.app7.OvalDiamond;

public class DiamondMain {
	public static void main(String[] args) {
		
	   System.out.println("Invoking main in diamond");	
	
		OvalDiamond oval = new OvalDiamond();
		System.out.println(oval.color);
		System.out.println(oval.difficultToCut);
		System.out.println(oval.hardestObject);
		System.out.println(oval.madeOff);
		
		System.out.println("__________________________");
		
		OvalDiamond oval2 = new OvalDiamond("bluish", "Particles", false, true);
		System.out.println(oval2.color);
		System.out.println(oval2.difficultToCut);
		System.out.println(oval2.hardestObject);
		System.out.println(oval2.madeOff);
	}
}
