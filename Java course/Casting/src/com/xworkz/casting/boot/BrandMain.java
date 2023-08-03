package com.xworkz.casting.boot;

import com.xworkz.casting.app2.*;
import com.xworkz.casting.util.BrandUtil;

public class BrandMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in brand");
		
		Brand brand = new Brand();
		
		LocalBrand local=new LocalBrand();
		
		NationalBrand national = new NationalBrand();
		
		InternationalBrand inter=new InternationalBrand();
		
		DuplicateBrand duplicate= new DuplicateBrand();
		
		
		BrandUtil util=new BrandUtil();
		System.out.println("Invoking run with brand reference");
		System.out.println(brand.since);
		util.run(brand);
		System.out.println("_______________________________");
		
		BrandUtil util1=new BrandUtil();
		System.out.println("Invoking run with local brand reference");
		System.out.println(local.since);
		System.out.println(local.name);
		util1.run(local);
		System.out.println("_______________________________");
		
		BrandUtil util2=new BrandUtil();
		System.out.println("Invoking run with national brand reference");
		System.out.println(national.since);
		System.out.println(national.name);
		util2.run(national);
		System.out.println("_______________________________");
		
		BrandUtil util3=new BrandUtil();
		System.out.println("Invoking run with international brand reference");
		System.out.println(inter.since);
		System.out.println(inter.name);
		util3.run(inter);
		System.out.println("_______________________________");
		
		BrandUtil util4=new BrandUtil();
		System.out.println("Invoking run with duplicate brand reference");
		System.out.println(duplicate.since);
		System.out.println(duplicate.name);
		util4.run(duplicate);
		
		
	}
}
	
