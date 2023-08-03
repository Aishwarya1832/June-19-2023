package com.xworkz.inheritance.app6;

public class Jet extends FlyingMachine{
	public String material="Copper";
	public Jet() {
		System.out.println("no args const  in Jet");
	}
	public void Fly() {
		System.out.println("Calling fly in Jet ");
	}

}
