package com.xworkz.inheritance.app6;

public class HeliCopter extends FlyingMachine{
	public String material="Aluminum";
	public HeliCopter() {
		System.out.println("no args const  in HeliCopter");
	}
	public void Fly() {
		System.out.println("Calling fly in Helicopter ");
	}

}
