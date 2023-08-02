package com.xworkz.example.boot;

import com.xworkz.example.app2.PowerBank;

public class PowerBankMain {
	
		public static void main(String[] args) {
			PowerBank pb=new PowerBank();
			
			System.out.println("MAIN CLASS");
			pb.startCharging();
			pb.stopCharging();
			
		}
	}



