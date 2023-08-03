package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.app5.*;

public class FruitMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in fruit");
		
		Fruit fruit = new Fruit();
		System.out.println(fruit.amount);
		fruit.tasty();
		System.out.println("________________________");
		
		Fruit fruit1 = new Apple();
		Apple apple = new Apple();
		System.out.println(fruit1.amount);
		fruit1.tasty();
		System.out.println(apple.amount);
		apple.tasty();
		System.out.println("________________________");
		
		Fruit fruit2 = new Mango();
		Mango mango = new Mango();
		System.out.println(fruit2.amount);
		fruit2.tasty();
		System.out.println(mango.amount);
		mango.tasty();
		System.out.println("________________________");
		
		Fruit fruit3 = new Orange();
		Orange orange = new Orange();
		System.out.println(fruit3.amount);
		fruit3.tasty();
		System.out.println(orange.amount);
		orange.tasty();
		System.out.println("________________________");
		
		Fruit fruit4 = new Pineapple();
		Pineapple pa = new Pineapple();
		System.out.println(fruit4.amount);
		fruit4.tasty();
		System.out.println(pa.amount);
		pa.tasty();
		System.out.println("________________________");
		
		
	}

}
