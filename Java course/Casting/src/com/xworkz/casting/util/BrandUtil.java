package com.xworkz.casting.util;

import com.xworkz.casting.app2.*;

public class BrandUtil extends Brand{
public void run(Brand brand) {
		
		Brand brand1 = new Brand();
		brand1.popular();
		
		if(brand instanceof LocalBrand)
		{
			Brand local=new LocalBrand();
			local.popular();
			
			LocalBrand local1=(LocalBrand)local;
			local1.sells();
		
		}
		if(brand instanceof NationalBrand)
		{
			Brand national=new NationalBrand();
			national.popular();
			
			NationalBrand national2=(NationalBrand)national;
			national2.getYear();
		}
		
		if(brand instanceof InternationalBrand)
		{
			Brand inter=new InternationalBrand();
			inter.popular();
			
			InternationalBrand inter2=(InternationalBrand)inter;
			inter2.getCloth();
		}
		
		if(brand instanceof DuplicateBrand)
		{
			Brand duplicate=new DuplicateBrand();
			duplicate.popular();//Brand
			
			DuplicateBrand duplicate2=(DuplicateBrand)duplicate;
			duplicate2.available();
		}
	}
	

}
