package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.app8.*;

public class VechileMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in vechile");
		
		Vechile vechile=new Vechile();
		System.out.println(vechile.wheels);
		vechile.runs();
		System.out.println("___________________________");
		
		Vechile vechile1=new Car();
		Car car=new Car();
		System.out.println(vechile1.wheels);
		vechile1.runs();
		System.out.println(car.wheels);
		car.runs();
		System.out.println("___________________________");
		
		
	}

}
