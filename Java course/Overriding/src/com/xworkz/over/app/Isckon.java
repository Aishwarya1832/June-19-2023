package com.xworkz.over.app;

public class Isckon extends Temple {
	@Override
	public void devotes() {
		System.out.println("calling sub class with no args");
	}

	@Override
	public void devotes(String location) {
		System.out.println("calling sub class with location args");
		System.out.println("Location:" + location);
	}
	@Override
	public void devotes(int distance) {
		System.out.println("calling subclass with distance args");
		System.out.println("distance:" + distance);
	}
	@Override
	public void devotes(double opensAt) {
		System.out.println("calling sub class with opensat args");
		System.out.println("opensat:" + opensAt);
	}
	@Override
	public void devotes(String location, int distance) {
		System.out.println("calling sub class with location,distance args");
		System.out.println("Location:" + location);
		System.out.println("distance:" + distance);
	}
	@Override
	public void devotes(String location, int distance, double opensAt) {
		System.out.println("calling sub class with location,distance,opensat args");
		System.out.println("Location:" + location);
		System.out.println("distance:" + distance);
		System.out.println("opensat:" + opensAt);
	}

}
