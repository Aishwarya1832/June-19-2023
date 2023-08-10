package com.xworkz.over.app;

public class NandiBakery extends Bakery{
	@Override
	public void bake() {
		System.out.println("Calling sub class bake method with no args");
		}
	@Override
	public void bake(String name) {
		System.out.println("Calling sub class bake method with name args");
		System.out.println("name of the item" + name);
	}
	@Override
	public void bake(int quantity) {
		System.out.println("Calling sub class bake method with quantity args");
		System.out.println("quantity of the item" +quantity);
	}
	@Override
	public void bake(double cost) {
		System.out.println("Calling sub class bake method with cost args");
		System.out.println("cost of the item" +cost);
	}
	@Override
	public void bake(String name,int  quantity) {
		System.out.println("Calling sub class bake method with two args");
		System.out.println("name of the item" +name);
		System.out.println("quantity of the item" +quantity);
	}
	@Override
	public void bake(String name,int  quantity,double cost) {
		System.out.println("Calling sub class bake method with three args");
		System.out.println("name of the item" +name);
		System.out.println("quantity of the item" +quantity);
		System.out.println("cost of the item " +cost);
	}
	


}
