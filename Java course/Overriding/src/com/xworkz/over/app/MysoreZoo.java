package com.xworkz.over.app;

public class MysoreZoo extends Zoo {
	@Override
	public void plays() {
		System.out.println("Calling sub class with no args");
	}
	@Override
	public void plays(String name) {
		System.out.println("calling sub class with name args");
		System.out.println("name:" + name);
	}
	@Override
	public void plays(int distance) {
		System.out.println("calling sub class with distance args");
		System.out.println("distance:" + distance);
	}
	@Override
	public void plays(double entryPrice) {
		System.out.println("calling sub class with entryprice args");
		System.out.println("Entryprice:" + entryPrice);
	}
	@Override
	public void plays(String name, int distance) {
		System.out.println("calling sub class with name,distance args");
		System.out.println("name:" + name);
		System.out.println("distance:" + distance);
	}
	@Override
	public void plays(String name, int distance, double entryPrice) {
		System.out.println("calling sub class with name,distance,entryprice args");
		System.out.println("name:" + name);
		System.out.println("distance:" + distance);
		System.out.println("Entryprice:" + entryPrice);
	}

}
