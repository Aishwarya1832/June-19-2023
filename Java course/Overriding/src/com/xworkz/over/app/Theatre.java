package com.xworkz.over.app;

public class Theatre {
	public void shows() {
		System.out.println("calling parent theatre class with noargs");
	}
	public void shows(String movieName) {
		System.out.println("calling parent theatre class with moviename args");
		System.out.println("Movie name:"+movieName);
	}
	public void shows(int noOfPlays) {
		System.out.println("calling parent theatre class with noOfplays args");
		System.out.println("no of shows:"+noOfPlays);
	}
	public void shows(double price) {
		System.out.println("calling parent theatre class with price args");
		System.out.println("price per ticket:"+price);
	}
	public void shows(String movieName,int noOfPlays) {
		System.out.println("calling parent theatre class with moviename,noofplays args");
		System.out.println("Movie name:"+movieName);
		System.out.println("no of shows:"+noOfPlays);
	}

	public void shows(String movieName,int noOfPlays,double price) {
		System.out.println("calling parent theatre class with moviename,noofplays,price args");
		System.out.println("Movie name:"+movieName);
		System.out.println("no of shows:"+noOfPlays);
		System.out.println("price per ticket:"+price);
	}

}
