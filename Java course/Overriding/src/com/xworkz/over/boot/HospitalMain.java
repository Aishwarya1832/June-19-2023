package com.xworkz.over.boot;

import com.xworkz.over.app.Hospital;
import com.xworkz.over.app.VishwasHospital;

public class HospitalMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in hospital");
		
		Hospital hospital=new Hospital();
		hospital.treat();
		hospital.treat("Arun");
		hospital.treat(10);
		hospital.treat(50000);
		hospital.treat("Aditya",5);
		hospital.treat("Aditya",5,80000);
		
		System.out.println("-------------------------");
		Hospital hospital1=new VishwasHospital();
		hospital1.treat();
		hospital1.treat("Abhi");
		hospital1.treat(10);
		hospital1.treat(50000);
		hospital1.treat("keertana",5);
		hospital1.treat("keertana",5,80000);
		
		System.out.println("-------------------------");
		Hospital hospital2=new VishwasHospital();
		hospital2.treat();
		hospital2.treat("Abhi");
		hospital2.treat(30);
		hospital2.treat(500000);
		hospital2.treat("manu",5);
		hospital2.treat("manu",5,80000);
	}

}
