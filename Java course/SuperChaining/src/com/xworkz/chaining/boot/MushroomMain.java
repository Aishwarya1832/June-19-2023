package com.xworkz.chaining.boot;

import com.xworkz.chaining.app2.PoisionMushroom;

public class MushroomMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in mushroom");
		PoisionMushroom poision=new PoisionMushroom();
		System.out.println(poision.type);
		System.out.println(poision.vitamin);
		System.out.println(poision.state);
		System.out.println(poision.amount);
		
		System.out.println("____________________________________");
		
		PoisionMushroom poision2=new PoisionMushroom("BeechMushroom", 'C', "Kerala",600);
		System.out.println(poision2.type);
		System.out.println(poision2.vitamin);
		System.out.println(poision2.state);
		System.out.println(poision2.amount);
		
		
	}
}
