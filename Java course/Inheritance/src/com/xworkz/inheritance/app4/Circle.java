package com.xworkz.inheritance.app4;

public class Circle extends Shape{
	public int sides=0;
	public Circle() {
		System.out.println("no args const in circle");
	}
	public void draw() {
		System.out.println("calling draw in circle");
	}

}
