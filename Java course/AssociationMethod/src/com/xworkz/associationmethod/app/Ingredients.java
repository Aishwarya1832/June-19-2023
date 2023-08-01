package com.xworkz.associationmethod.app;

public class Ingredients {

	public String name;
	public double quantity;
	public int cost;

	public Ingredients(String name, double quantity, int cost) {
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
	}

	public void printInfo() {
		System.out.println("Invoking Info in Ingredents");
		System.out.println("Name is:" + this.name);
		System.out.println("Quantity:" + this.quantity);
		System.out.println("Cost:" + this.cost);
	}

}
