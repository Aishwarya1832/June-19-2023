package com.xworkz.casting.boot;

import com.xworkz.casting.app5.*;
import com.xworkz.casting.util.ChocolateUtil;

public class ChocolateMain {
  public static void main(String[] args) {
	  System.out.println("Invoking main in chocolate");
	  Chocolate choco=new Chocolate();
		
		DarkChocolate dark=new DarkChocolate();
		
		CarmelChocolate carmel=new CarmelChocolate();
		
		ChocolateUtil util=new ChocolateUtil();
		System.out.println("Calling run with chocolate reference");
		System.out.println(choco.brand);
		util.run(choco);	
		System.out.println("___________________________________");
		
		ChocolateUtil util1=new ChocolateUtil();
		System.out.println("Calling run with DARK chocolate reference");
		System.out.println(dark.brand);
		System.out.println(dark.price);
		util1.run(dark);	
		System.out.println("___________________________________");
		
		ChocolateUtil chocolateUtil3=new ChocolateUtil();
		System.out.println("Calling run with CARAMEL chocolate refernce");
		System.out.println(carmel.brand);
		System.out.println(carmel.price);
		chocolateUtil3.run(carmel);	
		
		
		
}
}
