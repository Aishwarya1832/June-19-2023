package com.xworkz.association.app;

public class Garage {
	Mechanic mech=new Mechanic();
	
	public void garage()
	{
		System.out.println("Gaarge has mechanics");
		if(this.mech!=null)
		{
			this.mech.repairs();
			this.mech.washes();
		}
		else
		{
			System.err.println("Garage has null values");
		}
	}

}
