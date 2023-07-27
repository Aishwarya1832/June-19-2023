package com.xworkz.information.boot;

import com.xworkz.information.app.Store;

public class Runner {
 
		public static void main(String[] args) {
			System.out.println("------------Printing Emails---------------");
			String[] emails= {"aishu@gmail.com","kee@gmail.com","chandu@gmail.com","manu@gmail.com","anu@gmail.com"};
			Store email = new Store();
			email.email(emails);
			
			System.out.println("---------Printing Grocery Items----------------");
			String[] groceries = {"flour","Moongdal","Sugar","Juice","IceCream","Cupcakes"};
			Store item = new Store();
			item.groceryItems(groceries);
			
			System.out.println("----------Printing IPLTeamNames----------------");
			String[] teams = {"Chennai Super Kings - CSK","Royal Challengers Bangalore - RCB","Gujarat Titans - GT","Rajasthan Royals - RR","Mumbai Indians - MI","Sunrisers Hyderabad - SRH","Kings XI Punjab - KXIP","Kolkata Knight Riders - KKR","Delhi Capitals - DC","Lucknow SuperGaonts -LSG"};
			Store ipl = new Store();
			ipl.iplTeams(teams);
		}
	

}
