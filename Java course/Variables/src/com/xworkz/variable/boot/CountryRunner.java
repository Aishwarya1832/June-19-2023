package com.xworkz.variable.boot;

import com.xworkz.variable.app.Country;
import com.xworkz.variable.app.HomeMinister;
import com.xworkz.variable.app.PersonalAssistance;
import com.xworkz.variable.app.President;
import com.xworkz.variable.app.PrimeMinister;
import com.xworkz.variable.app.SecurityHead;
import com.xworkz.variable.app.StateFrom;
public class CountryRunner {
       public static void main(String[] args) {
    	   System.out.println("Invoking Country Runner in main");
    	   
    	   Country country=new Country();
    	   System.out.println("name:"+country.name);
    	   System.out.println("code:"+country.code);
    	   
    	   System.out.println("******************************");
    	   
    	   President president = new President();
    	   System.out.println("name:"+president.name);
    	   System.out.println("salary:"+president.salary);
    	   
    	   System.out.println("*******************************");
    	   StateFrom state=president.state;
    	   System.out.println("name:"+state.stateName);
    	   System.out.println("country:"+state.country);
    	   
    	   System.out.println("*******************************");

	       PrimeMinister pm=country.pm;
	       System.out.println("name:"+pm.name);
	       System.out.println("state:"+pm.state);
	       
	       System.out.println("*******************************");
	       
	       SecurityHead head=pm.head;
	       System.out.println("name:"+head.name);
	       System.out.println("force name:"+head.forceName);
	       
	       System.out.println("*******************************");
	       
	       PersonalAssistance pa=pm.pa;
	       System.out.println("name:"+pa.name);
	       System.out.println("salary:"+pa.salary);
	       
	       System.out.println("*******************************");
	       
	       HomeMinister hm = pm.hm;
	       System.out.println("name:"+hm.name);
	       System.out.println("age:"+hm.age);
	       
	       
	       
	       
}
}
