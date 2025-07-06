package com.java.lambda;

interface Shape{
	void draw();
}



class Square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Square Class: Draw() method");
	}
	
}
class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Circle Class: Draw() method");
	}
	
}

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="Hello";
		
		//oops ->lambda expersion
		Shape rectangle = () ->System.out.println("Rectangle Class : draw () method");
		
		rectangle.draw();
		
	}

}
