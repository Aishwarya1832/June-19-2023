package com.xworkz.association.boot;

import com.xworkz.association.app.Shop;

public class ShopMain {
	public static void main(String[] args)
	{
		System.out.println("Invoking shop in main");
		Shop shop=new Shop();
		shop.stores();
	}

}
