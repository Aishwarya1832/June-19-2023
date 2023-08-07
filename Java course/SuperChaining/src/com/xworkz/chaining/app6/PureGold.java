package com.xworkz.chaining.app6;

public class PureGold extends Gold{
	public PureGold() {
		super("necklace",40000,24,"mineral");
		System.out.println("Calling default constructor");
	}
	
	public PureGold(String goldItem,double cost,int pureGold,String extractFrom) {
		super(goldItem,cost,pureGold,extractFrom);
		System.out.println("Calling parametrized constructor");
	}
		

}
