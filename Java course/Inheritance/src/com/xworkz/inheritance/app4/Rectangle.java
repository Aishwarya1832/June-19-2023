package com.xworkz.inheritance.app4;

public class Rectangle extends Shape{
	public int sides=4;
	public Rectangle() {
		System.out.println("no args const in rectangle");
	}
	public void draw() {
		System.out.println("calling draw in rectangle");
	}

}
