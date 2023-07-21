class Main
{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in wood");
		Wood wood=new Wood("sandal",300);
		System.out.println("++++++++++++++++++++++");
		Wood wood1=new Wood("Teek",100,9,"Cot");
		System.out.println("++++++++++++++++++++++");
		Wood wood2=new Wood("Raktha Chand",500,10,"Chanda",100000);
		System.out.println("++++++++++++++++++++++");
		
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		System.out.println("Invoking main in Mall");
		Mall mall=new Mall("Lulu","Rajajijnagar");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
		Mall mall1= new Mall("Orion","Soap factory",4,true);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
		Mall mall2= new Mall("Mantri Square","Sampige Road",4,true,10);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		System.out.println("Invoking main in Park");
		Park park=new Park("WaterTank","MCC B Block",false,20);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Park park1=new Park("Ganapati","Rajajijnagar",true,10,2,8);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Park park2=new Park("City Park","Davangere",true,25,4,10,200,true,true);
		
		
	
	}
}