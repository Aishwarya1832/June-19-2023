package com.xworkz.abstractclass.boot;

import com.xworkz.abstractclass.app.Instagram;
import com.xworkz.abstractclass.app.InstagramReels;

public class InstagramMain {

	public static void main(String[] args) {
		System.out.println("Invoking main in Instagram");
		
		Instagram insta =new InstagramReels();
		System.out.println("calling abstract methods");
		//invoking abstract method
		insta.acceptRequest();
		insta.viewFeed();
		insta.followUser();
		insta.viewProfile();
		insta.sendMessage();
		
		//invoking normal methods
		System.out.println("calling normal methods");
		insta.login();
		insta.logout();
		insta.post();
		insta.commentOnPost();
		insta.likePost();
	}

}
