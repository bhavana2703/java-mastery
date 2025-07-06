package com.java.methodrefrence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethdRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4. refrence to a constructor
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("apple");
		fruits.add("Mango");
		fruits.add("watermelon");
		fruits.add("grapes");
		fruits.add("apple");
		System.out.println(fruits);
		
		//lambda exp
		Function<List<String>, Set<String>> setfunction= (fruitlist) ->new HashSet<>(fruitlist);
		System.out.println(setfunction.apply(fruits));
		
		//method ref
		Function<List<String>, Set<String>> setnMethod =HashSet::new;
		System.out.println(setnMethod.apply(fruits));
		
		
	}

}
