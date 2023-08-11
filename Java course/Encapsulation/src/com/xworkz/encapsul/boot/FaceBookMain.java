package com.xworkz.encapsul.boot;

import com.xworkz.encapsul.app.FaceBook;

public class FaceBookMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in Facebook");
		
		FaceBook book=new FaceBook();
		
		book.setUsername("Aishukodler");
		System.out.println(book.getUsername());
		
		book.setFullName("Aishwarya");
		System.out.println(book.getFullName());
		
		book.setAge(23);
		System.out.println(book.getAge());
		
		book.setGender("Female");
		System.out.println(book.getGender());
		
		book.setStatus("Travelling");
		System.out.println(book.getStatus());
		
		book.setFriendCount(500);
		System.out.println(book.getFriendCount());
		
		book.setOnlineStatus(true);
		System.out.println(book.isOnlineStatus());
		
		book.setProfilePictureUrl("https://example.com/aishu_profile.jpg");
		System.out.println(book.getProfilePictureUrl());
		
		book.setCurrentCity("Banglore");
		System.out.println(book.getCurrentCity());
		
		book.setHometown("Los Angeles");
		System.out.println(book.getHometown());
		
		book.setRelationshipStatus("Single");
		System.out.println(book.getRelationshipStatus());
		
		book.setPhotosCount(150);
		System.out.println(book.getPhotosCount());
		
		book.setPostCount(300);
		System.out.println(book.getPostCount());
		
		book.setLikesCount(1200);
		System.out.println(book.getLikesCount());
		
	}

}
