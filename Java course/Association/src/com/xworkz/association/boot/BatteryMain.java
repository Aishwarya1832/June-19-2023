package com.xworkz.association.boot;

import com.xworkz.association.app.PowerBank;

public class BatteryMain {

	public static void main(String[] args) {
		System.out.println("Invoking powerbank in main");
		PowerBank pb=new PowerBank();
		pb.ports();
		
	}

}
