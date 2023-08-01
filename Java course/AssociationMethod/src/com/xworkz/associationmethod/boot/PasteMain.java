package com.xworkz.associationmethod.boot;

import com.xworkz.associationmethod.app.*;

public class PasteMain {

	public static void main(String[] args) {
		System.out.println("Invoking main in Toothpaste");

		String name = "neem";
		String brand = "Himalaya";
		Company company = new Company("Unilever", "Hein Suhumacher", "India");
		Ingredients ing = new Ingredients("salt", 8.7, 60);
		Ingredients ing1 = new Ingredients("clove", 7.2, 30);
		Ingredients ing2 = new Ingredients("neem", 9.2, 10);
		Ingredients ing3 = new Ingredients("elachi", 6.6, 10);
		Ingredients ing4 = new Ingredients(" Zinc Phosphate", 2.3, 20);
		Ingredients[] ingredients = { ing, ing1, ing2, ing3, ing4 };

		ToothPaste paste = new ToothPaste(name, brand, company, ingredients);
		paste.printInfo();

	}

}
