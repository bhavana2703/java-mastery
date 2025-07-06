package com.java.methodrefrence;

import java.util.Arrays;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
	void print(String msg);
}

public class MethodRef2 {

	public void display (String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2. method reference to an instane method of an object
		MethodRef2 ref =new MethodRef2();
		
		//lambda exp
		Printable printable = msg -> ref.display(msg);
		printable.print("Hello Java 8");
		
		//using method refrence
		//object::instancemethodName
		Printable printMethod=ref::display;
		printMethod.print("Java method ref ");
		
		
		//3 class::instanceMethodName
		
		//lambda expression
		Function<String, String> fun = (String input)->input.toLowerCase();
	    System.out.println(fun.apply("Java Guides"));
	    
	    // method ref
	    Function<String, String> funString=String::toLowerCase;
	    System.out.println(funString.apply("Method Ref"));
	    
	    
	    String [] strArr = {"A","E","I","O","U","a","e","i","o","u"};
	    
	    //using Lambda
	    Arrays.sort(strArr, (s1,s2)->s1.compareToIgnoreCase(s2));
	    
	    //method refrence
	    
	    Arrays.sort(strArr, String::compareToIgnoreCase);
	    
	    
	    
		
		
	}

}
