package com.xworkz.association.boot;

import com.xworkz.association.app.Hospital;

public class HospitalMain {

	public static void main(String[] args) {
		
		System.out.println("Invoking hospital in main");
		Hospital hospital=new Hospital();
		hospital.recovers();
	}

}
