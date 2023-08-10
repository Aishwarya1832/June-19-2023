package com.xworkz.over.app;

public class Mall {
	public void stores() {
		System.out.println("Calling parent mall class with  no args");
	}
	public void stores(String name) {
		System.out.println("Calling parent mall class with name args");
		System.out.println("name:"+name);
	}
	public void stores(int noOfBrands) {
		System.out.println("Calling parent mall class with noOfBrands args");
		System.out.println("no of brands:"+noOfBrands);
	}
	public void stores(boolean foodCourt) {
		System.out.println("Calling parent mall class with food court args");
		System.out.println("foodcourt:"+foodCourt);
	}
	public void stores(String name,int noOfBrands) {
		System.out.println("Calling parent mall class with name,noOfBrands args");
		System.out.println("name:"+name);
		System.out.println("no of brands:"+noOfBrands);
	}
	public void stores(String name,int noOfBrands,boolean foodCourt) {
		System.out.println("Calling parent mall class with name,noOfBrands,foodCourt args");
		System.out.println("name:"+name);
		System.out.println("no of brands:"+noOfBrands);
		System.out.println("foodcourt:"+foodCourt);
	}
}
