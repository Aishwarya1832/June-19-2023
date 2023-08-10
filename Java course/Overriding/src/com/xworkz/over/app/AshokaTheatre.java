package com.xworkz.over.app;

public class AshokaTheatre extends Theatre {
	@Override
	public void shows() {
		System.out.println("calling sub theatre class with noargs");
	}
	@Override 
	
	public void shows(String movieName) {
		System.out.println("calling sub theatre class with moviename args");
		System.out.println("Movie name:" + movieName);
	}
	@Override 
	
	public void shows(int noOfPlays) {
		System.out.println("calling sub theatre class with noOfplays args");
		System.out.println("no of shows:" + noOfPlays);
	}
	@Override 
	
	public void shows(double price) {
		System.out.println("calling sub theatre class with price args");
		System.out.println("price per ticket:" + price);
	}
	@Override 
	
	public void shows(String movieName, int noOfPlays) {
		System.out.println("calling sub theatre class with moviename,noofplays args");
		System.out.println("Movie name:" + movieName);
		System.out.println("no of shows:" + noOfPlays);
	}
	@Override 
	
	public void shows(String movieName, int noOfPlays, double price) {
		System.out.println("calling sub theatre class with moviename,noofplays,price args");
		System.out.println("Movie name:" + movieName);
		System.out.println("no of shows:" + noOfPlays);
		System.out.println("price per ticket:" + price);
	}

}
