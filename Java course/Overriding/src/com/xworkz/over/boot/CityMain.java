package com.xworkz.over.boot;

import com.xworkz.over.app.City;
import com.xworkz.over.app.Town;

public class CityMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in city");
		
		City city=new City();
		city.lives();
		city.lives("Davangere");
		city.lives(true);
		city.lives(2580);
		city.lives("Mysore",true);
		city.lives("Mysore",true,8900);
		System.out.println("-------------------------------");
		
		City city1=new Town();
		city1.lives();
		city1.lives("changeri");
		city1.lives(true);
		city1.lives(2570);
		city1.lives("Santebennur",true);
		city1.lives("Mysore",true,8990);
		System.out.println("-------------------------------");
		
		Town city2=new Town();
		city2.lives();
		city2.lives("changeri");
		city2.lives(true);
		city2.lives(2570);
		city2.lives("Santebennur",true);
		city2.lives("MG Road",true,8990);
		
	}

}
