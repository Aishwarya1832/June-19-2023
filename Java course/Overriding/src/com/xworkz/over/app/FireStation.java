package com.xworkz.over.app;

public class FireStation extends PoliceStation{
	@Override
	public void maintains() {
		System.out.println("calling sub class with no args");
	}
	@Override
	public void maintains(String name) {
		System.out.println("calling sub class with name args");
		System.out.println(" Name:"+name);
	}
	@Override
	public void maintains(int pincode) {
		System.out.println("calling sub class with pincode args");
		System.out.println(" pincode:"+pincode);
	}
	@Override
	public void maintains(boolean open) {
		System.out.println("calling sub class with open args");
		System.out.println(" open:"+open);
	}
	@Override
	public void maintains(String name,int pincode) {
		System.out.println("calling sub class with name,pincode args");
		System.out.println(" Name:"+name);
		System.out.println(" pincode:"+pincode);
	}
	@Override
	public void maintains(String name,int pincode,boolean open) {
		System.out.println("calling sub class with name,pincode,open args");
		System.out.println(" Name:"+name);
		System.out.println(" pincode:"+pincode);
		System.out.println(" open:"+open);
	}
	

}
