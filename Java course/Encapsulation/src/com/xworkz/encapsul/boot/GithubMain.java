package com.xworkz.encapsul.boot;

import com.xworkz.encapsul.app.Github;

public class GithubMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in Github");
		
		Github hub=new Github();
		
		hub.setCompanyName("Github");
		System.out.println(hub.getCompanyName());
		
		hub.setHeadquarters("California");
		System.out.println(hub.getHeadquarters());
		
		hub.setNumberofProjects(10000);
		System.out.println(hub.getNumberofProjects());
		
		hub.setProgrammingLanguages(90);
		System.out.println(hub.getProgrammingLanguages());
		
		hub.setRegisteredUsers(10000);
		System.out.println(hub.getRegisteredUsers());
		
		hub.setEnablesCollaboration(true);
        System.out.println(hub.isEnablesCollaboration());
        
        hub.setHasInterface(true);
        System.out.println(hub.isHasInterface());
        
        hub.setOffersGitHubPages(true);
        System.out.println(hub.isOffersGitHubPages());
        
        hub.setOffersPullRequests(true);
        System.out.println(hub.isOffersPullRequests());
        
        hub.setProvidesAPI(true);
		System.out.println(hub.isProvidesAPI());
		
		hub.setProvidesGitHubActions(false);
		System.out.println(hub.isProvidesGitHubActions());
		
		hub.setProvidesIssueTracking(false);
		System.out.println(hub.isProvidesIssueTracking());
		
		hub.setSupportsCodeReviewss(true);
        System.out.println(hub.isSupportsCodeReviews());
        
        hub.setSupportsVersionControl(false);
        System.out.println(hub.isSupportsVersionControl());
	}

}
