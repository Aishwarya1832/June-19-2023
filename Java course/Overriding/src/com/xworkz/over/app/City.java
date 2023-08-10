package com.xworkz.over.app;

public class City {
	public void lives() {
		System.out.println("Calling parent class with no args");
	}
	public void lives(String cityName) {
		System.out.println("Calling parent class with cityname args");
		System.out.println("CityName:"+cityName);
	}
	public void lives(boolean population) {
		System.out.println("Calling parent class with population args");
		System.out.println("Population:"+population);
	}
	
	public void lives(int sqFeet) {
		System.out.println("Calling parent class with sqfeet args");
		System.out.println("Square feet:"+sqFeet);
	}
	public void lives(String cityName,boolean population) {
		System.out.println("Calling parent class with cityname,population args");
		System.out.println("CityName:"+cityName);
		System.out.println("Population:"+population);
	}
	public void lives(String cityName,boolean population,int sqFeet) {
		System.out.println("Calling parent class with cityname,population,sqfeet args");
		System.out.println("CityName:"+cityName);
		System.out.println("Population:"+population);
		System.out.println("Square feet:"+sqFeet);
	}
}

