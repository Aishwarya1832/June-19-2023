package com.xworkz.inheritance.app1;

public class Dog extends Animal {
	public String gender="Male";
	public Dog() {
		System.out.println("No-arg constructor in Dog");
	}
	public void barks() {
		System.out.println("Calling barks in Dog");
	}
}
