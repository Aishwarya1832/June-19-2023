package com.xworkz.over.boot;
import com.xworkz.over.app.Mall;
import com.xworkz.over.app.MantriSquare;


public class MallMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in mall");
		Mall mall=new Mall();
		mall.stores();
		mall.stores("Orion");
		mall.stores(15);
		mall.stores(true);
		mall.stores("Forum",20);
		mall.stores("Forum",20,true);
		System.out.println("------------------------");
		
		Mall mall1=new MantriSquare();
		mall1.stores();
		mall1.stores("goplan");
		mall1.stores(10);
		mall1.stores(false);
		mall1.stores("lullu",25);
		mall1.stores("lullu",25,true);
		System.out.println("------------------------");
		
		MantriSquare mall2=new MantriSquare();
		mall2.stores();
		mall2.stores("jaynagar shooping mall");
		mall2.stores(10);
		mall2.stores(true);
		mall2.stores("global",28);
		mall2.stores("global",28,true);
	}
	

}
