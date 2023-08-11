package com.xworkz.encapsul.boot;

import com.xworkz.encapsul.app.PhonePe;

public class PhonePeMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in phonepe");
		
		PhonePe pe=new PhonePe();
		
		pe.setCompanyName("Phone pe");
		System.out.println(pe.getCompanyName());
		
		pe.setHeadquarters("California");
		System.out.println(pe.getHeadquarters());
		
		pe.setNumberofPartnerMerchantss(100);
		System.out.println(pe.getNumberofPartnerMerchants());
		
		pe.setRegisteredUsers(450000);
		System.out.println(pe.getRegisteredUsers());
		
		pe.setSupportedLanguages(10);
		System.out.println(pe.getSupportedLanguages());
		
		pe.setHasMobileApp(true);
		System.out.println(pe.isHasMobileApp());
		
		pe.setCustomerSupport(true);
		System.out.println(pe.isCustomerSupport());
		
		pe.setOffersCashback(true);
		System.out.println(pe.isOffersCashback());
		
		pe.setOffersDigitalWallet(false);
		System.out.println(pe.isOffersDigitalWallet());
		
		pe.setOffersUPI(true);
		System.out.println(pe.isOffersUPI());
		
		pe.setProvidesInvestment(false);
		System.out.println(pe.isProvidesInvestments());
		
		pe.setProvidesMobileRecharge(true);
		System.out.println(pe.isProvidesMobileRecharge());
		
		pe.setSupportsBillPayments(true);
		System.out.println(pe.isSupportsBillPayments());
		
		pe.setSupportsQRCode(true);
		System.out.println(pe.isSupportsQRCode());
	}

}
