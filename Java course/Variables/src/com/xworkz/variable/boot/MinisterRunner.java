package com.xworkz.variable.boot;

import com.xworkz.variable.app.Constituency;
import com.xworkz.variable.app.IndiraCanteen;
import com.xworkz.variable.app.Minister;

public class MinisterRunner {
	
	public static void main(String[] args) {
		System.out.println("Invoking main in ministerRunnner");
		
		
		Minister minister=new Minister();
		System.out.println("name:"+minister.name);
		System.out.println("exp:"+minister.exp);
		
	    
	    Constituency constit=minister.constit;
	    System.out.println("no:"+constit.no);
	    System.out.println("population:"+constit.population);
	    
	    
	    IndiraCanteen ic=constit.ic;
	    System.out.println("breakfast:"+ic.breakFast);
	    System.out.println("lunchprice:"+ic.lunchPrice);
	    
	}

}
