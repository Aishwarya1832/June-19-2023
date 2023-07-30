package com.xworkz.association.app;

public class Shop {
	Salesman sales=new Salesman();
	public void stores()
	{
		System.out.println("Shop stores the daily needable items");
		if(this.sales!=null)
		{
			this.sales.salesDress();
			this.sales.salesGrocery();
		}
		else
		{
			System.out.println("Shop has null items");
		}
	}

}
