package com.xworkz.casting.util;

import com.xworkz.casting.app1.*;

public class ShowroomUtil extends Showroom{
	
	public void runs(Showroom showroom) {
		Showroom showRoom=new Showroom();
		showRoom.sells();
		
		if(showroom instanceof WatchShowroom)
		{
			Showroom watch=new WatchShowroom();
			watch.sells();
			
			WatchShowroom watch2=(WatchShowroom)watch;
			watch2.discount();
			
		}
		
		if(showroom instanceof MobileShowroom)
		{
			Showroom mobile = new MobileShowroom();
			mobile.sells();
			
			MobileShowroom mobile2=(MobileShowroom)mobile;
			mobile2.freeGift();
		}
		
	}

}
