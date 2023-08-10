package com.xworkz.over.app;

public class Zoo {
	public void plays() {
		System.out.println("Calling parent class with no args");
	}
	public void plays(String name) {
		System.out.println("calling parent class with name args");
		System.out.println("name:"+name);
	}
	public void plays(int distance) {
		System.out.println("calling parent class with distance args");
		System.out.println("distance:"+distance);
	}
	public void plays(double entryPrice) {
		System.out.println("calling parent class with entryprice args");
		System.out.println("Entryprice:"+entryPrice);
	}
	public void plays(String name,int distance) {
		System.out.println("calling parent class with name,distance args");
		System.out.println("name:"+name);
		System.out.println("distance:"+distance);
	}
	public void plays(String name,int distance,double entryPrice) {
		System.out.println("calling parent class with name,distance,entryprice args");
		System.out.println("name:"+name);
		System.out.println("distance:"+distance);
		System.out.println("Entryprice:"+entryPrice);
	}
}
