package com.xworkz.encapsul.app;

public class Github {
	private String companyName;
	private  int registeredUsers;
	private  boolean supportsVersionControl;
	private boolean enablesCollaboration;
	private  boolean providesIssueTracking;
	private  boolean hasInterface;
	private boolean offersPullRequests;
	private boolean supportsCodeReviews;
	private  int programmingLanguages;
	private String headquarters;
	private  boolean providesGitHubActions;
	private boolean offersGitHubPages;
	private  int numberofProjects;
    private  boolean providesAPI;
    
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

	public int getProgrammingLanguages() {
		return this.programmingLanguages;
	}

	public void setProgrammingLanguages(int programmingLanguages) {
		this.programmingLanguages= programmingLanguages;
	}

	public int getNumberofProjects() {
		return this.numberofProjects;
	}

	public void setNumberofProjects(int numberofProjects) {
		this.numberofProjects= numberofProjects;
	}

	public boolean isSupportsVersionControl() {
		return this.supportsVersionControl;
	}

	public void setSupportsVersionControl(boolean supportsVersionControl) {
		this.supportsVersionControl =supportsVersionControl;
	}

	public boolean isSupportsCodeReviews() {
		return this.supportsCodeReviews;
	}

	public void setSupportsCodeReviewss(boolean supportsCodeReviews) {
		this.supportsCodeReviews=supportsCodeReviews;
	}
	public boolean isProvidesGitHubActions() {
		return this.providesGitHubActions;
	}

	public void setProvidesGitHubActions(boolean providesGitHubActions) {
		this.providesGitHubActions=providesGitHubActions;
	}
	public boolean isHasInterface() {
		return this.hasInterface;
	}

	public void setHasInterface(boolean hasInterface) {
		this.hasInterface=hasInterface;
	}
	public boolean isOffersPullRequests() {
		return this.offersPullRequests;
	}

	public void setOffersPullRequests(boolean offersPullRequests) {
		this.offersPullRequests=offersPullRequests;
	}
	
	public boolean isOffersGitHubPages() {
		return this.offersGitHubPages;
	}

	public void setOffersGitHubPages(boolean offersGitHubPages) {
		this.offersGitHubPages=offersGitHubPages;
	}
	public boolean isProvidesIssueTracking() {
		return this.providesIssueTracking;
	}

	public void setProvidesIssueTracking(boolean providesIssueTracking) {
		this.providesIssueTracking=providesIssueTracking;
	}
	public boolean isProvidesAPI() {
		return this.providesAPI;
	}

	public void setProvidesAPI(boolean providesAPI) {
		this.providesAPI=providesAPI;
	}
	public boolean isEnablesCollaboration() {
		return this.enablesCollaboration;
	}

	public void setEnablesCollaboration(boolean enablesCollaboration) {
		this.enablesCollaboration=enablesCollaboration;
	}  

}
