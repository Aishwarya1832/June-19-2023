package com.xworkz.over.boot;

import com.xworkz.over.app.KrMarket;
import com.xworkz.over.app.Market;

public class MarketMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in market");
		Market market = new Market();
		market.sells();
		market.sells("Banglore");
		market.sells(50);
		market.sells(7.00);
		market.sells("MG Road",90);
		market.sells("MG Road",90,8.00);
		
		System.out.println("--------------------------------------");
		
		Market market1 = new KrMarket();
		market1.sells();
		market1.sells("Davangere");
		market1.sells(100);
		market1.sells(7.30);
		market1.sells("Ring road",70);
		market1.sells("Ring  Road",90,8.30);
		
		System.out.println("--------------------------------------");
		Market market2 = new KrMarket();
		market2.sells();
		market2.sells("chitraduga");
		market2.sells(90);
		market2.sells(7.30);
		market2.sells("market road",70);
		market2.sells("market  Road",90,8.30);
		
	}

}
