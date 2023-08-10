package com.xworkz.over.boot;

import com.xworkz.over.app.Isckon;
import com.xworkz.over.app.Temple;

public class TempleMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in temple");
		
		Temple temp=new Temple();
		temp.devotes();
		temp.devotes("Rajajinagar");
		temp.devotes(30);
		temp.devotes(8);
		temp.devotes("Majestic",18);
		temp.devotes("Majestic",18,8.30);
		System.out.println("------------------------------");
		
		Temple temp1=new Isckon();
		temp1.devotes();
		temp1.devotes("Nandini layout");
		temp1.devotes(35);
		temp1.devotes(8);
		temp1.devotes("SilkBoard",20);
		temp1.devotes("Silkboard",20,8.30);
		System.out.println("------------------------------");
		
		Isckon temp2=new Isckon();
		temp2.devotes();
		temp2.devotes("JPnagar");
		temp2.devotes(35);
		temp2.devotes(8);
		temp2.devotes("Jaynagar",40);
		temp2.devotes("jaynagar",40,8.30);
	}

}
