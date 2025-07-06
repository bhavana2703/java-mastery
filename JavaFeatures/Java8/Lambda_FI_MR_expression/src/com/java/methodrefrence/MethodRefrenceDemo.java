package com.java.methodrefrence;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodRefrenceDemo {

	public static int addtion(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Method refrence to static method
		Function<Integer, Double> fun =(input)->Math.sqrt(input);
		System.out.println(fun.apply(9));
		
		//lambda-->method refrence

		Function<Integer, Double> fun_mtd = Math::sqrt;
		System.out.println(fun_mtd.apply(16));
		
		/////////////////////
		// Class::Static method Name
		BiFunction<Integer, Integer, Integer> biFunction = MethodRefrenceDemo::addtion;
		System.out.println(biFunction.apply(7, 8));
	}

}
