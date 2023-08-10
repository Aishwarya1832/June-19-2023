package com.xworkz.over.app;

public class Market {
	public void sells() {
		System.out.println("Calling parent class with no args");
	}
	public void sells(String location) {
		System.out.println("Calling parent class with location args");
		System.out.println("Location:"+location);
	}
	public void sells(int distance) {
		System.out.println("Calling parent class with distance args");
		System.out.println("distance:"+distance);
	}
	public void sells(double opensAt) {
		System.out.println("Calling parent class with opensAt args");
		System.out.println("opensAt:"+opensAt);
	}
	public void sells(String location,int distance) {
		System.out.println("Calling parent class with location,distance args");
		System.out.println("Location:"+location);
		System.out.println("distance:"+distance);
	}
	public void sells(String location,int distance,double opensAt) {
		System.out.println("Calling parent class with location,distance,opensat args");
		System.out.println("Location:"+location);
		System.out.println("distance:"+distance);
		System.out.println("opensAt:"+opensAt);
	}

}
