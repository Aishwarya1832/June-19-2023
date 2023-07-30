package com.xworkz.association.boot;

import com.xworkz.association.app.Browser;

public class BrowserMain {

		public static void main(String[] args) {
			System.out.println("Invoking Browser in main");
			
			Browser browser = new Browser();
			browser.search();
		}

	}


