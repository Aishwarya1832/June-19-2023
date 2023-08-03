package com.xworkz.casting.boot;

import com.xworkz.casting.app4.*;
import com.xworkz.casting.util.BrowserUtil;

public class BrowserMain {

	public static void main(String[] args) {
        System.out.println("invoing main in browser.");
		
		Browser browser=new Browser();
		
		Chrome chrome=new Chrome();
		
		MicrosoftEdge micro=new MicrosoftEdge();
		
		Firefox fire=new Firefox();
		
		Opera opera=new Opera();
		
		BrowserUtil util=new BrowserUtil();
		System.out.println("Calling run with Browser ref");
		util.run(browser);
		System.out.println("--------------------------------------");
		
		BrowserUtil util1=new BrowserUtil();
		System.out.println("Calling run with Chrome ref");
		System.out.println(chrome.year);
		System.out.println(chrome.company);
		util1.run(chrome);
		System.out.println("--------------------------------------");
		
		BrowserUtil util2=new BrowserUtil();
		System.out.println("Calling run  with Microsoft ref");
		System.out.println(micro.year);
		System.out.println(micro.company);
		util2.run(micro);
		System.out.println("--------------------------------------");
		
		BrowserUtil util3=new BrowserUtil();
		System.out.println("Calling run with FireFox ref");
		System.out.println(fire.year);
		System.out.println(fire.company);
		util3.run(fire);
		System.out.println("--------------------------------------");
		
		BrowserUtil util4=new BrowserUtil();
		System.out.println("Calling run method with opera ref");
		System.out.println(opera.year);
		System.out.println(opera.company);
		util4.run(opera);
		
		
		

	}

}
