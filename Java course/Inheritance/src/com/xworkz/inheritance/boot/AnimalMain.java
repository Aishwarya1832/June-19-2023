package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.app1.*;

public class AnimalMain {

	public static void main(String[] args) {
		System.out.println("Invoking main in a animal");
		
		Animal animal=new Animal();
		System.out.println(animal.noOfLegs);
		animal.walks();
		System.out.println("___________________");
		
		Animal animal2=new Dog();
		Dog dog=new Dog();
		System.out.println(animal2.noOfLegs);
		System.out.println(dog.gender);
		animal2.walks();
		dog.barks();
		System.out.println("___________________");
		
		Animal animal3=new Cat();
		Cat cat=new Cat();
		System.out.println(animal3.noOfLegs);
		System.out.println(cat.noOfLegs);
		animal3.walks();
		cat.drinks();
		System.out.println("___________________");
		
		Animal animal4=new Bear();
		Bear bear= new Bear();
		System.out.println(animal4.noOfLegs);
		System.out.println(bear.noOfLegs);
		animal4.walks();
		bear.eat();
		System.out.println("___________________");
		
		Animal animal5=new Elephant();
		Elephant elephant=new Elephant();
		System.out.println(animal5.noOfLegs);
		System.out.println(elephant.noOfLegs);
		animal5.walks();
		elephant.walks();
		System.out.println("___________________");
		
		Animal animal6=new Fox();
		Fox fox = new Fox();
		System.out.println(animal6.noOfLegs);
		System.out.println(fox.noOfLegs);
		animal6.walks();
		fox.walks();
		System.out.println("___________________");
		
		Animal animal7=new Deer();
		Deer deer = new Deer();
		System.out.println(animal7.noOfLegs);
		System.out.println(deer.noOfLegs);
		animal7.walks();
		deer.walks();
		System.out.println("___________________");
		
		Animal animal8=new Lion();
		Lion lion= new Lion();
		System.out.println(animal8.noOfLegs);
		System.out.println(lion.noOfLegs);
		animal8.walks();
		lion.walks();
		System.out.println("___________________");
		
		Animal animal9=new Wolf();
		Wolf wolf=new Wolf();
		System.out.println(animal9.noOfLegs);
		System.out.println(wolf.noOfLegs);
		animal9.walks();
		wolf.walks();
		System.out.println("___________________");
		
		
	}
}
