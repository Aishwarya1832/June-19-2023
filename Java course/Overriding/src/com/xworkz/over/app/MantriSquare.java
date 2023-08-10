package com.xworkz.over.app;

public class MantriSquare extends Mall {
	@Override
	public void stores() {
		System.out.println("Calling sub mall class with  no args");
	}
	@Override
	public void stores(String name) {
		System.out.println("Calling sub mall class with name args");
		System.out.println("name:" + name);
	}
	@Override
	public void stores(int noOfBrands) {
		System.out.println("Calling sub mall class with noOfBrands args");
		System.out.println("no of brands:" + noOfBrands);
	}
	@Override
	public void stores(boolean foodCourt) {
		System.out.println("Calling sub mall class with food court args");
		System.out.println("foodcourt:" + foodCourt);
	}
	@Override
	public void stores(String name, int noOfBrands) {
		System.out.println("Calling sub mall class with name,noOfBrands args");
		System.out.println("name:" + name);
		System.out.println("no of brands:" + noOfBrands);
	}
	@Override
	public void stores(String name, int noOfBrands, boolean foodCourt) {
		System.out.println("Calling sub mall class with name,noOfBrands,foodCourt args");
		System.out.println("name:" + name);
		System.out.println("no of brands:" + noOfBrands);
		System.out.println("foodcourt:" + foodCourt);
	}

}
