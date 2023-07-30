package com.xworkz.association.boot;

import com.xworkz.association.app.Hotel;

public class HotelMain {
	public static void main(String[] args)
	{
		System.out.println("Invoking hotel in main");
		Hotel hotel = new Hotel();
		hotel.serves();
	}

}
