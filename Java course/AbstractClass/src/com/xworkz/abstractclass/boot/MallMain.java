package com.xworkz.abstractclass.boot;

import com.xworkz.abstractclass.app.Mall;
import com.xworkz.abstractclass.app.OrionMall;

public class MallMain {
	public static void main(String[] args) {
		System.out.println("Invoking mall in main");
		
		Mall mall=new OrionMall();
		System.out.println("calling abstract method");
		mall.openStore();
		mall.closeStore();
		mall.giveAssistance();
		mall.viewAllStores();
		mall.organizeEvent();
		
		System.out.println("calling normal methods");
		mall.enter();
		mall.exit();
		mall.shop();
		mall.payment();
		mall.viewAllStores();
	}

}
