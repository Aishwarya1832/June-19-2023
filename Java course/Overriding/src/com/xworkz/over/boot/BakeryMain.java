package com.xworkz.over.boot;

import com.xworkz.over.app.Bakery;
import com.xworkz.over.app.NandiBakery;

public class BakeryMain {
	
	public static void main(String[] args) {
		System.out.println("Invoking main in Bakery");

		Bakery bakery = new Bakery();

		bakery.bake();
		bakery.bake("MysorePak");
		bakery.bake(1000);
		bakery.bake(500);
		bakery.bake("Donut",60);
		bakery.bake("Sandwich", 70, 400);

		System.out.println("------------------------------");

		Bakery bakery2 = new NandiBakery(); // 

		bakery2.bake();
		bakery2.bake(" Milk Peda");
		bakery2.bake(80);
		bakery2.bake(500);
		bakery2.bake("Kaju", 90);
		bakery2.bake("MilkShake", 50, 90);

		System.out.println("------------------------------");

		NandiBakery bakery3 = new NandiBakery();

		bakery3.bake();
		bakery3.bake("Rusks");
		bakery3.bake(900);
		bakery3.bake(70);
		bakery3.bake("Cake", 70);
		bakery3.bake("Jelabi", 100, 70);

	}

}


