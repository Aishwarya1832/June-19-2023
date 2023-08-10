package com.xworkz.over.app;

public class PublicLibrary extends Library{
	@Override
	public void stores() {
		System.out.println("Calling sub stores method with no args");
	}
	@Override
	public void stores(String name) {
		System.out.println("Calling sub stores method with name args");
		System.out.println("name:"+name);
	}
	@Override
	public void stores(int noOfVarities) {
		System.out.println("Calling sub stores method with varities args");
		System.out.println("no of varities of book:"+noOfVarities);
	}
	@Override
	public void stores(double entryPrice) {
		System.out.println("Calling sub stores method with enytryprice args");
		System.out.println("entryprice :"+entryPrice);
	}
	@Override
	public void stores(String name,int noOfVarities) {
		System.out.println("Calling sub  stores method with name,varities args");
		System.out.println("name:"+name);
		System.out.println("no of varities of book:"+noOfVarities);
	}
	@Override
	public void stores(String name,int noOfVarities,double entryPrice) {
		System.out.println("Calling sub stores method with name,varities,entryprice args");
		System.out.println("name:"+name);
		System.out.println("no of varities of book:"+noOfVarities);
	}
	

}
