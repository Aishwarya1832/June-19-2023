package com.xworkz.over.boot;
import com.xworkz.over.app.AshokaTheatre;
import com.xworkz.over.app.Theatre;

public class TheatreMain {

	public static void main(String[] args) {
		System.out.println("Invoking main theatre");
		
		Theatre theatre=new Theatre();
		theatre.shows();
		theatre.shows("KGF");
		theatre.shows(4);
		theatre.shows(240);
		theatre.shows("Vikram",3);
		theatre.shows("Vikram",3,150);
		System.out.println("-------------------------------");
		
		Theatre theatre1=new AshokaTheatre();
		theatre1.shows();
		theatre1.shows("KGF-2");
		theatre1.shows(4);
		theatre1.shows(240);
		theatre1.shows("Banaras",3);
		theatre1.shows("Banaras",3,150);
		System.out.println("-------------------------------");
		
		AshokaTheatre theatre2=new AshokaTheatre();
		theatre2.shows();
		theatre2.shows("Googly");
		theatre2.shows(4);
		theatre2.shows(160);
		theatre2.shows("RajaHuli",3);
		theatre2.shows("RajaHuli",3,150);
	}

}
