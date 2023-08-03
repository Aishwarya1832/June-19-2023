package com.xworkz.inheritance.app3;

public class FixedDeposit extends Bank {
	public String bank="SBI";
	public FixedDeposit() {
		System.out.println("no args const in fixed deposit");
	}
	public void account() {
		System.out.println("calling account in fixed deposit");
	}


}
