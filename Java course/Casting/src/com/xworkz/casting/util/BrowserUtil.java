package com.xworkz.casting.util;

import com.xworkz.casting.app4.*;

public class BrowserUtil extends Browser{
	public void run(Browser browser)
	{
		Browser browser1 = new Browser();
		browser1.info();
		
		if(browser instanceof Chrome)
		{
			Browser chrome = new Chrome();
			chrome.info();
			
			Chrome chrome1=(Chrome)chrome;
			chrome1.search();
		}
		
		if(browser instanceof Firefox)
		{
			Browser firefox=new Firefox();
			firefox.info();
			
			Firefox firefox1=(Firefox)firefox;
			firefox1.clear();
		}
		
		if(browser instanceof Opera)
		{
			Browser opera=new Browser();
			opera.info();
			
			Opera opera1=new Opera();
			opera1.getBookmarks();
		}
		
		if(browser instanceof MicrosoftEdge)
		{
			Browser micro=new Browser();
			micro.info();
			
			MicrosoftEdge micro1=new MicrosoftEdge();
			micro1.getInfo();
		}
	}

}
