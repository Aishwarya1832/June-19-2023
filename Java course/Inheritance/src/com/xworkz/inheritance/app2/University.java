package com.xworkz.inheritance.app2;

public class University extends Board{
	public String name="UBDT";
	public University(){
		System.out.println("no-arg const in university");
	}
	
	public void educates(){
		System.out.println("calling educates in university");
	}
	

}
