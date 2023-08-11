package com.xworkz.encapsul.boot;

import com.xworkz.encapsul.app.Whatsapp;

public class WhatsappMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in whatsapp");
		
		Whatsapp app=new Whatsapp();
		app.setCompanyName("Whatsapp");
		System.out.println(app.getCompanyName());
		
		app.setHeadquarters("France");
		System.out.println(app.getHeadquarters());
		
		app.setMonthlyActiveUsers(10000);
		System.out.println(app.getMonthlyActiveUsers());
		
		app.setNumberOfEmojis(3400);
		System.out.println(app.getNumberOfEmojis());
		
		app.setSupportedLanguages(30);
		System.out.println(app.getSupportedLanguages());
		
		app.setAllowsVoiceCalls(true);
		System.out.println(app.isAllowsVoiceCalls());
		
		app.setHasEncryption(true);
		System.out.println(app.isHasEncryption());
      
		app.setOffersGroupChats(false);
        System.out.println(app.isOffersGroupChats());
        
        app.setOffersWebVersion(true);
        System.out.println(app.isOffersWebVersion());
        
        app.setProvidesStatusUpdates(true);
        System.out.println(app.isProvidesStatusUpdates());
        
        app.setProvidesVerification(true);
        System.out.println(app.isProvidesVerification());
        
        app.setSupportsFileSharing(false);
        System.out.println(app.isSupportsFileSharing());
        
        app.setSupportsTextMessaging(true);
        System.out.println(app.isSupportsTextMessaging());
        
        app.setSupportsVideoCalls(true);
        System.out.println(app.isSupportsVideoCalls());
	}
	

}
