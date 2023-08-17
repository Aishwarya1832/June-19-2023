package comm.xworkz.object.boot;

import comm.xworkz.object.app.Karcheif;

public class KarcheifMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in Karcheif");
		
		Karcheif cheif= new Karcheif();
		System.out.println(cheif);
		
		System.out.println("_____________________________________");
		
		Karcheif cheif1=new Karcheif("Square", "Skyblue", "checks", "Cotton", 12, 20,true);
		System.out.println(cheif1);
		
		System.out.println("_____________________________________");
		

		Karcheif cheif2=new Karcheif("rectangle", "brown", "Panda", "Nylon", 10, 10,false);
		System.out.println(cheif2);
		
		
				
	}

}
