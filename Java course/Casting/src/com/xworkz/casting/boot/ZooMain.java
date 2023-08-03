package com.xworkz.casting.boot;

import com.xworkz.casting.app3.*;
import com.xworkz.casting.util.ZooUtil;

public class ZooMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in zoo");
		
		Zoo zoo=new Zoo();
		StateZoo state= new StateZoo();
		NationalZoo national=new NationalZoo();
		
		ZooUtil util=new ZooUtil();
		System.out.println("invoking run with zoo reference");
		System.out.println(zoo.location);
		util.run(zoo);
		System.out.println("________________");
		
		ZooUtil util1=new ZooUtil();
		System.out.println("invoking run with state zoo reference");
		System.out.println(state.location);
		System.out.println(state.name);
		util1.run(state);
		System.out.println("________________");
		
		ZooUtil util2=new ZooUtil();
		System.out.println("invoking run with national zoo reference");
		System.out.println(national.location);
		System.out.println(national.name);
		util2.run(national);
		System.out.println("________________");
	}

}
