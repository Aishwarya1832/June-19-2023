package com.xworkz.inheritance.app2;

public class Degree extends Board {
	public String name="UBDT";
	public Degree(){
		System.out.println("no-arg const in Degree");
	}
	
	public void educates(){
		System.out.println("calling educates in Degree");
	}
	

}
