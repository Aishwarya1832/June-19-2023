package com.xworkz.association.app;

public class PowerBank {
	Battery battery=new  Battery();
	
	public void ports()
	{
		System.out.println("2 ports");
		
		if(this.battery!=null)
		{
			this.battery.batteryType();
			this.battery.volts();
		}
		else
		{
			System.err.println("Battery has null values");
		}
	}
	

}
