package com.xworkz.variable.app;

public class Watchman {
	public Gun gun;
	
	 public void secure()
	{
		System.out.println("invoking secure in watchman");
		if(this.gun!=null)
		{
		this.gun.shoot();
		}
		else {
			System.err.println("gun has value null");
		}
	}

}
