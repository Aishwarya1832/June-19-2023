package com.xworkz.inheritance.app2;

public class StateBoard extends Board {
	public String name="Karnataka";
	public StateBoard(){
		System.out.println("no-arg const in state board");
	}
	
	public void educates(){
		System.out.println("calling educates in state board");
	}
	

}
