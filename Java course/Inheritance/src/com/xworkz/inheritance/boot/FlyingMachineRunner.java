package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.app6.*;

public class FlyingMachineRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in flying machine");
		
		FlyingMachine fm=new FlyingMachine();
		System.out.println(fm.material);
		fm.Fly();
		System.out.println("_____________________________");
		
		FlyingMachine fm1=new AeroPlane();
		AeroPlane ap=new AeroPlane();
		System.out.println(fm1.material);
		fm1.Fly();
		System.out.println(ap.material);
		ap.Fly();
		System.out.println("_____________________________");
		
		FlyingMachine fm2=new HeliCopter();
		HeliCopter hc=new HeliCopter();
		System.out.println(fm2.material);
		fm2.Fly();
		System.out.println(hc.material);
		hc.Fly();
		System.out.println("_____________________________");
		
		FlyingMachine fm3=new Jet();
		Jet jet=new Jet();
		System.out.println(fm3.material);
		fm3.Fly();
		System.out.println(jet.material);
		jet.Fly();
		System.out.println("_____________________________");




	}

}
