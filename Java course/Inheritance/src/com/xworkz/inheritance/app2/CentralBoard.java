package com.xworkz.inheritance.app2;

public class CentralBoard extends Board{
	public String name="CBSE";
	public CentralBoard(){
		System.out.println("no-arg const in central board");
	}
	
	public void educates(){
		System.out.println("calling educates in cental board");
	}
	

}
