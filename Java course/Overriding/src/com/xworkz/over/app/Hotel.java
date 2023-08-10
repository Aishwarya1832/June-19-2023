package com.xworkz.over.app;

public class Hotel {
	public void cook() {
		System.out.println("calling parent class cook method with no args");
	}
	public void cook(String item) {
		System.out.println("calling parent class cook method with item args");
		System.out.println("Item name:"+item);
	}
	public void cook(double price) {
		System.out.println("calling parent class cook method with price args");
		System.out.println("Item price:"+price);
	}
	public void cook(int plateSold) {
		System.out.println("calling parent class cook method with platesold args");
		System.out.println("Item plate sold:"+plateSold);
	}
	public void cook(String item,double price) {
		System.out.println("calling parent class cook method with item args");
		System.out.println("Item name:"+item);
		System.out.println("Item price:"+price);
	}
	public void cook(String item,double price,int plateSold) {
		System.out.println("calling parent class cook method with item args");
		System.out.println("Item name:"+item);
		System.out.println("Item price:"+price);
		System.out.println("Item plate sold:"+plateSold);
	}
}


