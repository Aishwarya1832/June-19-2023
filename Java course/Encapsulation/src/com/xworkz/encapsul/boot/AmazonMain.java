package com.xworkz.encapsul.boot;

import com.xworkz.encapsul.app.Amazon;

public class AmazonMain {

	public static void main(String[] args) {
		System.out.println("Invoking main in amazon");
		Amazon amazon=new Amazon();
		
		amazon.setProductName("Hair Straightner");
		System.out.println(amazon.getProductName());
		
		amazon.setProductId("hcdle123");
		System.out.println(amazon.getProductId());
		
		amazon.setPrice(999.99);
		System.out.println(amazon.getPrice());
		
		amazon.setRatings(4);
		System.out.println(amazon.getRatings());
		
		amazon.setCategory("Electronics");
		System.out.println(amazon.getCategory());
		
		amazon.setSeller("Amazon Store");
		System.out.println(amazon.getSeller());
		
		amazon.setAvailable(true);
		System.out.println(amazon.isAvailable());
		
		amazon.setNumberOfReviews(500);
		System.out.println(amazon.getNumberOfReviews());
		
		amazon.setDescription("This is an example product description.");
		System.out.println(amazon.getDescription());
		
		amazon.setImageUrl("https://example.com/product-image.jpg");
		System.out.println(amazon.getImageUrl());
		
		amazon.setShippingInfo("Ships within 2 business days.");
		System.out.println(amazon.getShippingInfo());
		
		amazon.setPrimeEligible(true);
		System.out.println(amazon.isPrimeEligible());
		
		amazon.setBrand("Example Brand");
		System.out.println(amazon.getBrand());
		
		amazon.setColor("Black");
		System.out.println(amazon.getColor());
		
	}
}
