package comm.xworkz.object.boot;

import comm.xworkz.object.app.Flag;

public class FlagMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in Flag");
		
		Flag flag=new Flag();
		System.out.println(flag);
		
		System.out.println("_____________________________");
		
		Flag flag1=new Flag("India", "Tri-Color", 20);
		System.out.println(flag1);

		System.out.println("_____________________________");
		
		Flag flag2=new Flag("USA", "double-Color", 10);
		System.out.println(flag2);
		
	}

}
