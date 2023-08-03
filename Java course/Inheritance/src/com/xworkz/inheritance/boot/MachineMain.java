package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.app7.*;

public class MachineMain {

	public static void main(String[] args) {
		System.out.println("Invoking main in machine");
		
		Machine machine = new Machine();
		System.out.println(machine.price);
		machine.works();
		System.out.println("________________________");
		
		Machine machine1 = new Computer();
		Computer computer=new Computer();
		System.out.println(machine1.price);
		machine1.works();
		System.out.println(computer.price);
		computer.works();
		System.out.println("________________________");
		
		Machine machine2 = new Laptop();
		Laptop laptop=new Laptop();
		System.out.println(machine2.price);
		machine2.works();
		System.out.println(laptop.price);
		laptop.works();
		System.out.println("________________________");
		

	}

}
