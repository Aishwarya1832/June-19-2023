package com.xworkz.chaining.boot;

import com.xworkz.chaining.app5.PlayGround;

public class GroundMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in Ground");
		PlayGround play = new PlayGround();
		System.out.println(play.name);
		System.out.println(play.location);
		System.out.println(play.sqrFeet);
		System.out.println(play.noOfChairs);
		
		
		System.out.println("_____________________________________");

		PlayGround play2 = new PlayGround("wankede", "mumbai", 400, 25);
		System.out.println("parameterised");
		System.out.println(play2.name);
		System.out.println(play2.location);
		System.out.println(play2.sqrFeet);
		System.out.println(play2.noOfChairs);

	}
}
