package com.xworkz.over.app;

public class VishwasHospital extends Hospital{
	@Override
	public void treat() {
		System.out.println("Calling sub hospital class with no args");
	}
	@Override
	public void treat(String patientName) {
		System.out.println("Calling sub hospital class with pattientname args");
		System.out.println("patientname:" + patientName);
	}
	@Override
	public void treat(int noOfDays) {
		System.out.println("Calling sub hospital class with noOfDays args");
		System.out.println("no of days there are in hospital:" + noOfDays);
	}
	@Override
	public void treat(double amount) {
		System.out.println("Calling sub hospital class with amount args");
		System.out.println("cost of traetment:" + amount);
	}
	@Override
	public void treat(String patientName,int noOfDays) {
		System.out.println("Calling sub  hospital class with pattientname and noOfDays args");
		System.out.println("patientname:" + patientName);
		System.out.println("no of days there are in hospital:" + noOfDays);
	}
	@Override
	public void treat(String patientName,int noOfDays,double amount) {
		System.out.println("Calling sub hospital class with pattientname and noOfDays and amount args");
		System.out.println("patientname:" + patientName);
		System.out.println("no of days there are in hospital:" + noOfDays);
		System.out.println("cost of traetment:" + amount);
	}


	

}
