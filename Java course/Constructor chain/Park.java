class Park{
	
	String parkName;
	String area;
	boolean isChildrenPark;
	int noOfChairs;
	int noOfGates;
	int noOfGames;
	double areaSize;
	boolean isDogFriendly;
	boolean hasLake;
	
	Park()
	{
		System.out.println("Invoking default constructor");
	}
	Park(String parkName)
	{
		this.parkName=parkName;
		System.out.println("Invoking String constructor");
	}
	Park(String parkName,String area)
	{
		this.parkName=parkName;
		this.area=area;
		System.out.println("Invoking String,string constructor");
	}
	Park(String parkName,String area,boolean isChildrenPark)
	{
		this(parkName,area);
		this.isChildrenPark=isChildrenPark;
		System.out.println("Invoking String,string,boolean constructor");
	}
	Park(String parkName,String area,boolean isChildrenPark,int noOfChairs)
	{
		this(parkName,area,isChildrenPark);
		this.noOfChairs=noOfChairs;
		System.out.println("Invoking String,string,boolean,int constructor");
	}
	Park(String parkName,String area,boolean isChildrenPark,int noOfChairs,int noOfGates)
	{
		this(parkName,area,isChildrenPark,noOfChairs);
		this.noOfGates=noOfGates;
		System.out.println("Invoking String,string,boolean,int,int constructor");
	}
	Park(String parkName,String area,boolean isChildrenPark,int noOfChairs,int noOfGates,int noOfGames)
	{
		this(parkName,area,isChildrenPark,noOfChairs,noOfGates);
		this.noOfGames=noOfGames;
		System.out.println("Invoking String,string,boolean,int,int,int constructor");
	}
    Park(String parkName,String area,boolean isChildrenPark,int noOfChairs,int noOfGates,int noOfGames,double areaSize)
	{
		this(parkName,area,isChildrenPark,noOfChairs,noOfGates,noOfGames);
		this.areaSize=areaSize;
		System.out.println("Invoking String,string,boolean,int,int,int,boolean constructor");
	}
	Park(String parkName,String area,boolean isChildrenPark,int noOfChairs,int noOfGates,int noOfGames,double areaSize,boolean isDogFriendly)
	{
		this(parkName,area,isChildrenPark,noOfChairs,noOfGates,noOfGames,areaSize);
		this.isDogFriendly=isDogFriendly;
		System.out.println("Invoking String,string,boolean,int,int,int,double,boolean,boolean constructor");
	}
	Park(String parkName,String area,boolean isChildrenPark,int noOfChairs,int noOfGates,int noOfGames,double areaSize,boolean isDogFriendly,boolean hasLake)
	{
		this(parkName,area,isChildrenPark,noOfChairs,noOfGates,noOfGames,areaSize,isDogFriendly);
		this.hasLake=hasLake;
		System.out.println("Invoking String,string,boolean,int,int,int,double,boolean,boolean constructor");
	}
	
}