package com.xworkz.inheritance.app6;

public class AeroPlane extends FlyingMachine {
	public String material="Iron";
	public AeroPlane() {
		System.out.println("no args const  in aeroplane");
	}
	public void Fly() {
		System.out.println("Calling fly in aeroplane ");
	}

}
