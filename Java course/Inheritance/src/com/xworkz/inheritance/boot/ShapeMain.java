package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.app4.*;

public class ShapeMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in Shape");
		
		Shape shape = new Shape();
		System.out.println(shape.sides);
		shape.draw();
		System.out.println("_____________________");
		
		Shape shape1 = new Circle();
		Circle circle = new Circle();
		System.out.println(shape1.sides);
		shape1.draw();
		System.out.println(circle.sides);
		circle.draw();
		System.out.println("_____________________");
		
		Shape shape2 = new Square();
		Square square = new Square();
		System.out.println(shape2.sides);
		shape2.draw();
		System.out.println(square.sides);
		square.draw();
		System.out.println("_____________________");
		
		Shape shape3 = new Rectangle();
		Rectangle rectangle = new Rectangle();
		System.out.println(shape3.sides);
		shape3.draw();
		System.out.println(rectangle.sides);
		rectangle.draw();
		System.out.println("_____________________");
		
		Shape shape4 = new Triangle();
		Triangle triangle = new Triangle();
		System.out.println(shape4.sides);
		shape4.draw();
		System.out.println(triangle.sides);
		triangle.draw();
		System.out.println("_____________________");
		
		Shape shape5 = new Quadrilateral();
		Quadrilateral quadri = new Quadrilateral();
		System.out.println(shape5.sides);
		shape5.draw();
		System.out.println(quadri.sides);
		quadri.draw();
		System.out.println("_____________________");
	}

}
