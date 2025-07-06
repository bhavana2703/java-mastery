package com.java.functionalIF;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer>{

	@Override
	public Integer apply(String s) {
		// TODO Auto-generated method stub
		return s.length();
	}
	
}
public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	//	Function<String,Integer> function = new FunctionImpl();
	//	System.out.println(function.apply("Bhavana"));
		
		
		Function<String, Integer> fun =(String s) ->{return s.length();};
		System.out.println( fun.apply("Pooja"));
	}
	

}
