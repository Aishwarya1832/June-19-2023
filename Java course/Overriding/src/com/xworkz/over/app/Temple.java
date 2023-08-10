package com.xworkz.over.app;

public class Temple {
	public void devotes() {
		System.out.println("calling parent class with no args");
	}
	public void devotes(String location) {
		System.out.println("calling parent class with location args");
		System.out.println("Location:"+location);
	}
	public void devotes(int distance) {
		System.out.println("calling parent class with distance args");
		System.out.println("distance:"+distance);
	}
	public void devotes(double opensAt) {
		System.out.println("calling parent class with opensat args");
		System.out.println("opensat:"+opensAt);
	}
	public void devotes(String location,int distance) {
		System.out.println("calling parent class with location,distance args");
		System.out.println("Location:"+location);
		System.out.println("distance:"+distance);
	}
	public void devotes(String location,int distance,double opensAt) {
		System.out.println("calling parent class with location,distance,opensat args");
		System.out.println("Location:"+location);
		System.out.println("distance:"+distance);
		System.out.println("opensat:"+opensAt);
	}


}
