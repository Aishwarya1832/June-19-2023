package com.xworkz.over.app;

public class KrMarket extends Market{
	@Override
	public void sells() {
		System.out.println("Calling sub class with no args");
	}
	@Override
	public void sells(String location) {
		System.out.println("Calling sub class with location args");
		System.out.println("Location:"+location);
	}
	@Override
	public void sells(int distance) {
		System.out.println("Calling sub class with distance args");
		System.out.println("distance:"+distance);
	}
	@Override
	public void sells(double opensAt) {
		System.out.println("Calling sub class with opensAt args");
		System.out.println("opensAt:"+opensAt);
	}
	@Override
	public void sells(String location,int distance) {
		System.out.println("Calling sub class with location,distance args");
		System.out.println("Location:"+location);
		System.out.println("distance:"+distance);
	}
	@Override
	public void sells(String location,int distance,double opensAt) {
		System.out.println("Calling sub class with location,distance,opensat args");
		System.out.println("Location:"+location);
		System.out.println("distance:"+distance);
		System.out.println("opensAt:"+opensAt);
	}

}
