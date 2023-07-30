package com.xworkz.association.app;

public class Hotel {
	Cook cook=new Cook();
	public void serves()
	{
		System.out.println("The Hotel serves the food prepared by cook");
		
		if(this.cook!=null)
		{
			this.cook.cooks();
			this.cook.bakes();
		}
		else
		{
			System.err.println("Cook has null value");
		}
	}

}
