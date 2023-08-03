package com.xworkz.inheritance.app2;

public class School extends Board {
	public String name="Siddganga";
	public School(){
		System.out.println("no-arg const in School");
	}
	
	public void educates(){
		System.out.println("calling educates in school");
	}
	

}
