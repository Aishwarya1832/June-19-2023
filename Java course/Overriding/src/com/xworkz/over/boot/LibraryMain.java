package com.xworkz.over.boot;
import com.xworkz.over.app.Library;
import com.xworkz.over.app.PublicLibrary;

public class LibraryMain {
	public static void main(String[] args) {
		Library lib=new Library();
		lib.stores();
		lib.stores("District");
		lib.stores(50);
		lib.stores(100);
		lib.stores("Taluk",25);
		lib.stores("Taluk",25,50);
		
		System.out.println("-------------------------");
		Library lib1=new PublicLibrary();
		lib1.stores();
		lib1.stores("District");
		lib1.stores(50);
		lib1.stores(0);
		lib1.stores("Taluk",25);
		lib1.stores("Taluk",25,0);
		
		System.out.println("-------------------------");
		
		Library lib2=new PublicLibrary();
		lib2.stores();
		lib2.stores("District");
		lib2.stores(50);
		lib2.stores(0);
		lib2.stores("Taluk",25);
		lib2.stores("Taluk",25,0);
	}

}
