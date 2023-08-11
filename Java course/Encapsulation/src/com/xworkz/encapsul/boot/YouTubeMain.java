package com.xworkz.encapsul.boot;

import com.xworkz.encapsul.app.YouTube;

public class YouTubeMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in youtube");
		
		YouTube tube=new YouTube();
		
		tube.setName("Mahesh");
		System.out.println(tube.getName());
		
		tube.setChannelName("Find your soul");
		System.out.println(tube.getChannelName());
		
		tube.setApiKey(5454464644.04f);
		System.out.println(tube.getApiKey());
		
		tube.setAppSize(500);
		System.out.println(tube.getAppSize());
		
		tube.setComments(7900);
		System.out.println(tube.getComments());
		
		tube.setDislike(80);
		System.out.println(tube.getDislike());
		
		tube.setDownloads(899000l);
		System.out.println(tube.getDownloads());
		
		tube.setGood(true);
		System.out.println(tube.getGood());
		
		tube.setLikes(5000);
		System.out.println(tube.getLikes());
		
		tube.setOwner("Chetan");
		System.out.println(tube.getOwner());
		
		tube.setSubscriber(600);
		System.out.println(tube.getSubscriber());
		
		tube.setViews(800);
		System.out.println(tube.getViews());
		
		tube.setWatchHour(14);
		System.out.println(tube.getWatchHour());
		
		tube.setSubscription(true);
		System.out.println(tube.isSubscription());
		
	}

}
