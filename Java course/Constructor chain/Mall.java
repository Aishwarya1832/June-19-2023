class Mall{
	String name;
	String area;
	int floor;
	boolean isEscaulatorPresent;
	int noOfBrand;
	float entryPrice;
	boolean gameZone;
	
	Mall()
	{
		System.out.println("Invoking default constructor");
	}
	Mall(String name)
	{
		this.name=name;
		System.out.println("Invoking String in constructor");
	
	}
	Mall(String name,String area)
	{
		this.name=name;
		this.area=area;
		System.out.println("Invoking String,string in constructor");
	}
	Mall(String name,String area,int floor)
	{
		this(name,area);
		this.floor=floor;
		System.out.println("Invoking String,string,int in constructor");
	}
	Mall(String name,String area,int floor,boolean isEscaulatorPresent)
	{
		this(name,area,floor);
		this.isEscaulatorPresent=isEscaulatorPresent;
		System.out.println("Invoking String,string,int,boolean,in constructor");
	}
	Mall(String name,String area,int floor,boolean isEscaulatorPresent,int noOfBrand)
	{
		this(name,area,floor,isEscaulatorPresent);
		this.noOfBrand=noOfBrand;
		System.out.println("Invoking String,string,int,boolean,int in constructor");
	}
	Mall(String name,String area,int floor,boolean isEscaulatorPresent,int noOfBrand,float entryPrice)
	{
		this(name,area,floor,isEscaulatorPresent,noOfBrand);
		this.entryPrice=entryPrice;
		System.out.println("Invoking String,string,int,boolean,int,float in constructor");
	}
	Mall(String name,String area,int floor,boolean isEscaulatorPresent,int noOfBrand,float entryPrice,boolean gameZone)
	{
		this(name,area,floor,isEscaulatorPresent,noOfBrand,entryPrice);
		this.gameZone=gameZone;
		System.out.println("Invoking String,string,int,boolean,int,float,boolean in constructor");
	}
}