package com.xworkz.over.boot;

import com.xworkz.over.app.MysoreZoo;
import com.xworkz.over.app.Zoo;

public class ZooMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in Zoo");
		Zoo zoo=new Zoo();
		zoo.plays();
		zoo.plays("Bandipur");
		zoo.plays(40);
		zoo.plays(200);
		zoo.plays(null, 0);
		zoo.plays("National zoo",80,200);
		System.out.println("--------------------------");
		Zoo zoo1=new MysoreZoo();
		zoo1.plays();
		zoo1.plays("Chandavalli");
		zoo1.plays(40);
		zoo1.plays(200);
		zoo1.plays(null, 0);
		zoo1.plays("mysore zoo",80,200);
		System.out.println("--------------------------");
		
		MysoreZoo zoo2=new MysoreZoo();
		zoo2.plays();
		zoo2.plays("Chandavalli");
		zoo2.plays(40);
		zoo2.plays(200);
		zoo2.plays("Angod", 25);
		zoo2.plays("mysore zoo",80,200);
		
	}
}
