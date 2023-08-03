package com.xworkz.inheritance.app4;

public class Quadrilateral extends Shape {
	public int sides=4;
	public Quadrilateral() {
		System.out.println("no args const in quadrilateral");
	}
	public void draw() {
		System.out.println("calling draw in quadrilateral");
	}

}
