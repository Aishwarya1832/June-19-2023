package com.xworkz.over.app;

public class Town extends City{
	@Override
	public void lives() {
		System.out.println("Calling sub class with no args");
	}
	@Override
	public void lives(String cityName) {
		System.out.println("Calling sub class with cityname args");
		System.out.println("CityName:"+cityName);
	}
	@Override
	public void lives(boolean population) {
		System.out.println("Calling sub class with population args");
		System.out.println("Population:"+population);
	}
	@Override
	public void lives(int sqFeet) {
		System.out.println("Calling sub class with sqfeet args");
		System.out.println("Square feet:"+sqFeet);
	}
	@Override
	public void lives(String cityName,boolean population) {
		System.out.println("Calling sub class with cityname,population args");
		System.out.println("CityName:"+cityName);
		System.out.println("Population:"+population);
	}
	@Override
	public void lives(String cityName,boolean population,int sqFeet) {
		System.out.println("Calling sub class with cityname,population,sqfeet args");
		System.out.println("CityName:"+cityName);
		System.out.println("Population:"+population);
		System.out.println("Square feet:"+sqFeet);
	}

}
