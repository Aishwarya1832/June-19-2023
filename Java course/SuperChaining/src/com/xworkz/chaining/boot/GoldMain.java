package com.xworkz.chaining.boot;

import com.xworkz.chaining.app6.PureGold;

public class GoldMain {
	public static void main(String[] args) {
		
	System.out.println("Invoking main in gold");
	
	PureGold pure=new PureGold();
	System.out.println(pure.goldItem);
	System.out.println(pure.cost);
	System.out.println(pure.pureGold);
	System.out.println(pure.extractFrom);
	
	System.out.println("__________________________");
	
	PureGold pure2=new PureGold("gejje",3000,24,"mine");
	System.out.println(pure2.goldItem);
	System.out.println(pure2.cost);
	System.out.println(pure2.pureGold);
	System.out.println(pure2.extractFrom);
	}
}
