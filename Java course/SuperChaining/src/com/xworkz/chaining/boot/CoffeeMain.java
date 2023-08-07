package com.xworkz.chaining.boot;

import com.xworkz.chaining.app1.FilterCoffee;

public class CoffeeMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in coffee.");
		FilterCoffee coffee=new FilterCoffee();
		System.out.println(coffee.name);
		System.out.println(coffee.color);
		System.out.println(coffee.sweet);
		System.out.println(coffee.amount);
		
		System.out.println("______________________________");
		
		FilterCoffee coffee1=new FilterCoffee("BlackCoffee","Balck",true,500);
		System.out.println(coffee1.name);
		System.out.println(coffee1.color);
		System.out.println(coffee1.sweet);
		System.out.println(coffee1.amount);
	}
}
