package com.xworkz.over.boot;

import com.xworkz.over.app.FireStation;
import com.xworkz.over.app.PoliceStation;

public class PoliceStationMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in police station");
		
		PoliceStation ps=new PoliceStation();
		ps.maintains();
		ps.maintains("Old Police station");
		ps.maintains(577890);
		ps.maintains(true);
		ps.maintains("District Police station",577908);
		ps.maintains("District Police station",577908,true);
		System.out.println("--------------------------------");
		
		
		FireStation ps1=new FireStation();
		ps1.maintains();
		ps1.maintains("Old Police station");
		ps1.maintains(577890);
		ps1.maintains(true);
		ps1.maintains("taluk Police station",577001);
		ps1.maintains("takuk Police station",577901,true);
		System.out.println("--------------------------------");
		
		FireStation ps2=new FireStation();
		ps2.maintains();
		ps2.maintains("Old Police station");
		ps2.maintains(577890);
		ps2.maintains(true);
		ps2.maintains("taluk Police station",577001);
		ps2.maintains("takuk Police station",577901,true);
	}

}
