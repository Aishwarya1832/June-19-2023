package com.xworkz.encapsul.app;

public class PhonePe {
	private String companyName;
	private int registeredUsers;
	private boolean offersUPI;
	private boolean providesMobileRecharge;
	private boolean supportsBillPayments;
	private boolean hasMobileApp;
	private boolean offersDigitalWallet;
	private boolean providesInvestment;
	private int supportedLanguages;
	private String headquarters;
	private boolean supportsQRCode;
	private boolean offersCashback;
	private int numberofPartnerMerchants;
	private boolean customerSupport;
	
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getHeadquarters() {
		return this.headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public int getRegisteredUsers() {
		return this.registeredUsers;
	}

	public void setRegisteredUsers(int registeredUsers) {
		this.registeredUsers =registeredUsers;
	}

	public int getNumberofPartnerMerchants() {
		return this.numberofPartnerMerchants;
	}

	public void setNumberofPartnerMerchantss(int numberofPartnerMerchants) {
		this.numberofPartnerMerchants = numberofPartnerMerchants;
	}

	public int getSupportedLanguages() {
		return this.supportedLanguages;
	}

	public void setSupportedLanguages(int supportedLanguages) {
		this.supportedLanguages= supportedLanguages;
	}

	public boolean isOffersDigitalWallet() {
		return this.offersDigitalWallet;
	}

	public void setOffersDigitalWallet(boolean offersDigitalWallet) {
		this.offersDigitalWallet =offersDigitalWallet;
	}

	public boolean isSupportsQRCode() {
		return this.supportsQRCode;
	}

	public void setSupportsQRCode(boolean supportsQRCode) {
		this.supportsQRCode=supportsQRCode;
	}
	public boolean isProvidesInvestments() {
		return this.providesInvestment;
	}

	public void setProvidesInvestment(boolean providesInvestment) {
		this.providesInvestment=providesInvestment;
	}
	public boolean isHasMobileApp() {
		return this.hasMobileApp;
	}

	public void setHasMobileApp(boolean hasMobileApp) {
		this.hasMobileApp=hasMobileApp;
	}
	public boolean isOffersCashback() {
		return this.offersCashback;
	}

	public void setOffersCashback(boolean offersCashback) {
		this.offersCashback=offersCashback;
	}
	
	public boolean isOffersUPI() {
		return this.offersUPI;
	}

	public void setOffersUPI(boolean offersUPI) {
		this.offersUPI=offersUPI;
	}
	public boolean isSupportsBillPayments() {
		return this.supportsBillPayments;
	}

	public void setSupportsBillPayments(boolean supportsBillPayments) {
		this.supportsBillPayments=supportsBillPayments;
	}
	public boolean isProvidesMobileRecharge() {
		return this.providesMobileRecharge;
	}

	public void setProvidesMobileRecharge(boolean providesMobileRecharge) {
		this.providesMobileRecharge=providesMobileRecharge;
	}
	public boolean isCustomerSupport() {
		return this.customerSupport;
	}

	public void setCustomerSupport(boolean customerSupport) {
		this.customerSupport=customerSupport;
	}

}



