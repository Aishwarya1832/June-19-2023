package com.xworkz.over.app;

public class BenneDoseHotel extends Hotel{
	@Override
	public void cook() {
		System.out.println("calling sub class cook method with no args");
	}
	@Override
	public void cook(String item) {
		System.out.println("calling subclass cook method with item args");
		System.out.println("Item name:"+item);
	}
	@Override
	public void cook(double price) {
		System.out.println("calling sub class cook method with price args");
		System.out.println("Item price:"+price);
	}
	@Override
	public void cook(int plateSold) {
		System.out.println("calling sub class cook method with platesold args");
		System.out.println("Item plate sold:"+plateSold);
	}
	@Override
	public void cook(String item,double price) {
		System.out.println("calling sub class cook method with item args");
		System.out.println("Item name:"+item);
		System.out.println("Item price:"+price);
	}
	@Override
	public void cook(String item,double price,int plateSold) {
		System.out.println("calling sub class cook method with item args");
		System.out.println("Item name:"+item);
		System.out.println("Item price:"+price);
		System.out.println("Item plate sold:"+plateSold);
	}

}
