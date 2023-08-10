package com.xworkz.over.boot;

import com.xworkz.over.app.GirlsHostel;
import com.xworkz.over.app.Hostel;

public class HostelMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in hostel");
		
		Hostel hostel=new Hostel();
		hostel.establish();
		hostel.establish(1987);
		hostel.establish("UBDT Girls hostel");
		hostel.establish(4);
		hostel.establish("boyshostel",1985);
		hostel.establish("boyshostel",1985,5);
		System.out.println("---------------------------");
		
		Hostel hostel1=new GirlsHostel();
		hostel1.establish();
		hostel1.establish(1989);
		hostel1.establish("UBDT Girls hostel");
		hostel1.establish(6);
		hostel1.establish("boyshostel",1990);
		hostel1.establish("boyshostel",1995,5);
		System.out.println("---------------------------");
		
		GirlsHostel hostel2=new GirlsHostel();
		hostel2.establish();
		hostel2.establish(1998);
		hostel2.establish("UBDT Girls hostel");
		hostel2.establish(4);
		hostel2.establish("boyshostel",2000);
		hostel2.establish("booyshostel",2000,5);
		
	}
}
