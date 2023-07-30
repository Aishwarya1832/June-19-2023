package com.xworkz.variable.boot;

import com.xworkz.variable.app.Auditor;
import com.xworkz.variable.app.Company;
import com.xworkz.variable.app.Movie;
import com.xworkz.variable.app.Producer;

public class MovieRunner {
	public static void main(String[] args) {
		System.out.println("Invoking movie runner in main");
		
		Movie movie=new Movie();
		System.out.println("name:" +movie.name);
		System.out.println("movie:" + movie.language);
		
		System.out.println("+++++++++++++++++++++");
		
		
		Producer prod=movie.prod;
		System.out.println("budget:"+prod.budget);
		System.out.println("mobileNo:"+prod.mobileNo);
		
		System.out.println("+++++++++++++++++++++");
		
		
		Auditor audit=prod.audit;
		System.out.println("adharno:"+audit.adharNo);
		
		System.out.println("+++++++++++++++++++++");
		
		
		Company comp=audit.comp;
		System.out.println("name:"+comp.name);
		System.out.println("location:"+comp.location);
		
		
	}

}
