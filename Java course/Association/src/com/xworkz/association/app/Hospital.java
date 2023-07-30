package com.xworkz.association.app;

public class Hospital {
	Doctors doctors=new Doctors();
	Nurse nurse=new Nurse();
	Patient patient=new Patient();
	
	public void recovers()
	{
		System.out.println("Hospitals helps to recover the patients");
		if(this.doctors!=null && this.nurse!=null && this.patient!=null)
		{
			this.doctors.treat();
			this.doctors.operates();
			
			this.nurse.givesInjection();
			this.nurse.assistDoctors();
			
			this.patient.takesTreatement();
			this.patient.takesTablets();
		}
		else
		{
			System.err.println("Hospital has null values");
		}
	}

}
