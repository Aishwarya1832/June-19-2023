package com.xworkz.inheritance.app4;

public class Triangle extends Shape{
	public int sides=3;
	public Triangle() {
		System.out.println("no args const in traingle");
	}
	public void draw() {
		System.out.println("calling draw in triangle");
	}
	

}
