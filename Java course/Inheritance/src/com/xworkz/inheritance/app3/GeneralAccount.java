package com.xworkz.inheritance.app3;

public class GeneralAccount extends Bank {
	public String bank="SBI";
	public GeneralAccount() {
		System.out.println("no args const in general Account");
	}
	public void account() {
		System.out.println("calling account in general Account");
	}


}
