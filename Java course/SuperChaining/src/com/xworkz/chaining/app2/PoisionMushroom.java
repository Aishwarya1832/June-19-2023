package com.xworkz.chaining.app2;

public class PoisionMushroom extends Mushroom{
	
	public PoisionMushroom() {
		super("Amanita phalloides",'E',"Karnataka",500);
		System.out.println("Calling No-arg Constuctor");
	}

	public PoisionMushroom(String type, char vitamin, String state,double amount) {
		super(type,vitamin,state,amount);
		System.out.println("Calling Parameterised Constructor");
	}
}
