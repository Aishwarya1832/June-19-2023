package com.xworkz.inheritance.app3;

public class SavingAccount extends Bank {
	
		public String bank="SBI";
		public SavingAccount() {
			System.out.println("no args const in saving account");
		}
		public void account() {
			System.out.println("calling account in saving");
		}

}
