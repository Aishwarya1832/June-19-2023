package com.xworkz.inheritance.app3;

public class SalaryAccount extends Bank{
	
		public String bank="SBI";
		public SalaryAccount() {
			System.out.println("no args const in Salary Account");
		}
		public void account() {
			System.out.println("calling account in Salary Account");
		}

}
