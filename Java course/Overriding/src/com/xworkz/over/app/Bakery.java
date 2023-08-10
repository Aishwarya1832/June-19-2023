package com.xworkz.over.app;

public class Bakery {
	
	public void bake() {
		System.out.println("Calling parent class bake method with no args");
		}
	public void bake(String name) {
		System.out.println("Calling parent class bake method with name args");
		System.out.println("name of the item" + name);
	}
	public void bake(int quantity) {
		System.out.println("Calling parent class bake method with quantity args");
		System.out.println("quantity of the item" +quantity);
	}
	public void bake(double cost) {
		System.out.println("Calling parent class bake method with cost args");
		System.out.println("cost of the item" +cost);
	}
	public void bake(String name,int  quantity) {
		System.out.println("Calling parent class bake method with two args");
		System.out.println("name of the item" +name);
		System.out.println("quantity of the item" +quantity);
	}
	public void bake(String name,int  quantity,double cost) {
		System.out.println("Calling parent class bake method with two args");
		System.out.println("name of the item" +name);
		System.out.println("quantity of the item" +quantity);
		System.out.println("cost of the item " +cost);
	}
	

}
