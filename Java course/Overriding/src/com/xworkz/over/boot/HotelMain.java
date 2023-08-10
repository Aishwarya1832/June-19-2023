package com.xworkz.over.boot;

import com.xworkz.over.app.BenneDoseHotel;
import com.xworkz.over.app.Hotel;

public class HotelMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in hotel");
		Hotel hotel = new Hotel();

		hotel.cook();
		hotel.cook("Dose");
		hotel.cook(70);
		hotel.cook(500);
		hotel.cook("Palav", 45);
		hotel.cook("Poori", 50, 100);

		System.out.println("--------------------");
		Hotel hotel1 = new BenneDoseHotel();

		hotel1.cook();
		hotel1.cook(" Benne Dose");
		hotel1.cook(90);
		hotel1.cook(1000);
		hotel1.cook("Palav", 45);
		hotel1.cook("BisibeleBhat", 50, 100);

		System.out.println("--------------------");
		
		BenneDoseHotel hotel2 = new BenneDoseHotel();

		hotel2.cook();
		hotel2.cook(" Masal Dose");
		hotel2.cook(90);
		hotel2.cook(1000);
		hotel2.cook("ShavigeBath", 45);
		hotel2.cook("BisibeleBhat", 50, 100);
	}

}
