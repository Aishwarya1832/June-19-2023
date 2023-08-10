package com.xworkz.over.app;

public class Library {
	public void stores() {
		System.out.println("Calling parent stores method with no args");
	}
	public void stores(String name) {
		System.out.println("Calling parent stores method with name args");
		System.out.println("name:"+name);
	}
	public void stores(int noOfVarities) {
		System.out.println("Calling parent stores method with varities args");
		System.out.println("no of varities of book:"+noOfVarities);
	}
	public void stores(double entryPrice) {
		System.out.println("Calling parent stores method with enytryprice args");
		System.out.println("entryprice :"+entryPrice);
	}
	public void stores(String name,int noOfVarities) {
		System.out.println("Calling parent stores method with name,varities args");
		System.out.println("name:"+name);
		System.out.println("no of varities of book:"+noOfVarities);
	}
	public void stores(String name,int noOfVarities,double entryPrice) {
		System.out.println("Calling parent stores method with name,varities,entryprice args");
		System.out.println("name:"+name);
		System.out.println("no of varities of book:"+noOfVarities);
	}
}
