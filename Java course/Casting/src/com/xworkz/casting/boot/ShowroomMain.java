package com.xworkz.casting.boot;

import com.xworkz.casting.app1.*;
import com.xworkz.casting.util.ShowroomUtil;

public class ShowroomMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in showroom");
		
		Showroom showroom=new Showroom();
		
		WatchShowroom watch=new WatchShowroom();
		
		MobileShowroom mobile=new MobileShowroom();
		
		ShowroomUtil util=new ShowroomUtil();
		System.out.println("Invoking run with showroom reference");
		System.out.println(showroom.location);
		util.runs(showroom);
		System.out.println("_______________________________");
		
		ShowroomUtil util1=new ShowroomUtil();
		System.out.println("Invoking run with watchshowroom reference");
		System.out.println(watch.location);
		System.out.println(watch.since);
		util1.runs(watch);
		System.out.println("_______________________________");
		
		ShowroomUtil util2=new ShowroomUtil();
		System.out.println("Invoking run with mobileshowroom reference");
		System.out.println(mobile.location);
		System.out.println(mobile.pincode);
		util2.runs(mobile);
		
		
	}

}
