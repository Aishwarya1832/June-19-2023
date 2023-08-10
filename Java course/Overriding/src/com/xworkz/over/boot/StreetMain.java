package com.xworkz.over.boot;

import com.xworkz.over.app.ChurchStreet;
import com.xworkz.over.app.Street;

public class StreetMain {
	public static void main(String[] args) {
		
		System.out.println("Invoking main in street");
		
		Street street=new Street();
		street.drives();
		street.drives("Garike");
		street.drives(2035);
		street.drives(17);
		street.drives(null,780);
		street.drives(null,780,6);
		System.out.println("-----------------------------------");
		
		
		Street street1=new ChurchStreet();
		street1.drives();
		street1.drives("Mourya");
		street1.drives(2036);
		street1.drives(17);
		street1.drives(null,781);
		street1.drives("hetthodolu",781,6);
		System.out.println("-----------------------------------");
		
		ChurchStreet street2=new ChurchStreet();
		street2.drives();
		street2.drives("Mouna");
		street2.drives(2037);
		street2.drives(17);
		street2.drives(null,781);
		street2.drives("hetthodolu",781,6);
	}

}
