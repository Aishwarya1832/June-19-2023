package com.xworkz.association.app;

public class Browser {
	Internet internet = new Internet();
	public void search()
	{
		System.out.println("Search the given problem");
		if(this.internet!=null)
		{
			System.out.println("Internet is working");
			this.internet.speed();
			this.internet.type();
		}
		else
		{
			System.err.println("Internet has null value");
		}
	}

}
