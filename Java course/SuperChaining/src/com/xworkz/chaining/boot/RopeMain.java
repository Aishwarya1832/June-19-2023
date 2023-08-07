package com.xworkz.chaining.boot;

import com.xworkz.chaining.app4.JuteRope;

public class RopeMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in rope");
		JuteRope jute=new JuteRope();
		System.out.println(jute.meters);
		System.out.println(jute.cost);
		System.out.println(jute.thickness);
		System.out.println(jute.usedFor);
		
		System.out.println("________________________________");
		
		JuteRope jute2=new JuteRope(50,350,'M',"hanging");
		System.out.println(jute2.meters);
		System.out.println(jute2.cost);
		System.out.println(jute2.thickness);
		System.out.println(jute2.usedFor);
	}

}
