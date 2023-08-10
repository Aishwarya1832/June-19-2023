package com.xworkz.over.app;

public class Pub {
	public void dance() {
		System.out.println("Calling parent class with no args");
	}
	public void dance(String name) {
		System.out.println("Calling parent class with name args");
		System.out.println("Name:"+name);
	}
	public void dance(int entryPrice) {
		System.out.println("Calling parent class with entryPrice args");
		System.out.println("Entry price:"+entryPrice);
	}
	public void dance(boolean coupleEntry) {
		System.out.println("Calling parent class with couple entry args");
		System.out.println("couple entry:"+coupleEntry);
	}
	public void dance(String name,int entryPrice) {
		System.out.println("Calling parent class with name,entryprice args");
		System.out.println("Name:"+name);
		System.out.println("Entry price:"+entryPrice);
	}
	public void dance(String name,int entryPrice,boolean coupleEntry) {
		System.out.println("Calling parent class with name,entryprice,couple entry args");
		System.out.println("Name:"+name);
		System.out.println("Entry price:"+entryPrice);
		System.out.println("couple entry:"+coupleEntry);
	}
	

}
