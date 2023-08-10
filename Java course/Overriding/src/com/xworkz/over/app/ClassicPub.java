package com.xworkz.over.app;

public class ClassicPub extends Pub{
	@Override
	public void dance() {
		System.out.println("Calling sub class with no args");
	}
	@Override
	public void dance(String name) {
		System.out.println("Calling sub class with name args");
		System.out.println("Name:"+name);
	}
	@Override
	public void dance(int entryPrice) {
		System.out.println("Calling sub class with entryPrice args");
		System.out.println("Entry price:"+entryPrice);
	}
	@Override
	public void dance(boolean coupleEntry) {
		System.out.println("Calling sub class with couple entry args");
		System.out.println("couple entry:"+coupleEntry);
	}
	@Override
	public void dance(String name,int entryPrice) {
		System.out.println("Calling sub class with name,entryprice args");
		System.out.println("Name:"+name);
		System.out.println("Entry price:"+entryPrice);
	}
	@Override
	public void dance(String name,int entryPrice,boolean coupleEntry) {
		System.out.println("Calling sub class with name,entryprice,couple entry args");
		System.out.println("Name:"+name);
		System.out.println("Entry price:"+entryPrice);
		System.out.println("couple entry:"+coupleEntry);
	}
	
	

}
