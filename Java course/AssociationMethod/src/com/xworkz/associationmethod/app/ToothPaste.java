package com.xworkz.associationmethod.app;

public class ToothPaste {
	public String name;
	public String brand;
	public Company company;
	public Ingredients[] ingredients;

	public ToothPaste(String name, String brand, Company company, Ingredients[] ingredients) {
		this.name = name;
		this.brand = brand;
		this.company = company;
		this.ingredients = ingredients;
	}

	public void printInfo() {
		System.out.println("Invoking Info in Toothpaste");

		System.out.println("Toothpaste Name is:" + this.name);
		System.out.println("Brand is:" + this.brand);

		company.printInfo();
		for (int paste = 0; paste < this.ingredients.length; paste++) {
			System.out.println("Ingredients of the paste:");
			Ingredients ing = ingredients[paste];
			ing.printInfo();

		}

	}

}
