package com.xworkz.inheritance.app3;

public class DemandDeposit extends Bank{
	public String bank="SBI";
	public DemandDeposit() {
		System.out.println("no args const in demand deposit");
	}
	public void account() {
		System.out.println("calling account in demand deposit");
	}


}
