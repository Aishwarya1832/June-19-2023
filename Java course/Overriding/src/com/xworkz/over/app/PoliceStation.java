package com.xworkz.over.app;

public class PoliceStation {
	public void maintains() {
		System.out.println("calling parent class with no args");
	}
	
	public void maintains(String name) {
		System.out.println("calling parent class with name args");
		System.out.println(" Name:"+name);
	}
	public void maintains(int pincode) {
		System.out.println("calling parent class with pincode args");
		System.out.println(" pincode:"+pincode);
	}
	public void maintains(boolean open) {
		System.out.println("calling parent class with open args");
		System.out.println(" open:"+open);
	}
	public void maintains(String name,int pincode) {
		System.out.println("calling parent class with name,pincode args");
		System.out.println(" Name:"+name);
		System.out.println(" pincode:"+pincode);
	}
	public void maintains(String name,int pincode,boolean open) {
		System.out.println("calling parent class with name,pincode,open args");
		System.out.println(" Name:"+name);
		System.out.println(" pincode:"+pincode);
		System.out.println(" open:"+open);
	}
	
}
