package com.xworkz.over.boot;

import com.xworkz.over.app.ClassicPub;
import com.xworkz.over.app.Pub;

public class PubMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in pub");
		
		Pub pub=new Pub();
		pub.dance();
		pub.dance("StreetDance");
		pub.dance(1000);
		pub.dance(true);
		pub.dance("StreetDance",500);
		pub.dance("StreetDance",500,false);
		System.out.println("--------------------------------");
		
		Pub pub1=new ClassicPub();
		pub1.dance();
		pub1.dance("MGRoad");
		pub1.dance(1000);
		pub1.dance(true);
		pub1.dance("MGRoad",500);
		pub1.dance("MGRoad",500,true);
		System.out.println("--------------------------------");
		
		ClassicPub pub2=new ClassicPub();
		pub2.dance();
		pub2.dance("OrionPub");
		pub2.dance(1000);
		pub2.dance(true);
		pub2.dance("forum",500);
		pub2.dance("forum",500,true);
		
	}

}
