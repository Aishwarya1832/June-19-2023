package com.xworkz.inheritance.app3;

public class JointAccount extends Bank {
	public String bank="SBI";
	public JointAccount() {
		System.out.println("no args const in Joint Account");
	}
	public void account() {
		System.out.println("calling account in Joint Account");
	}


}
