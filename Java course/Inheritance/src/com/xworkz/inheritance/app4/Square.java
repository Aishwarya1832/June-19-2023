package com.xworkz.inheritance.app4;

public class Square extends Shape {
	public int sides=4;
	public Square() {
		System.out.println("no args const in square");
	}
	public void draw() {
		System.out.println("calling draw in square");
	}

}
