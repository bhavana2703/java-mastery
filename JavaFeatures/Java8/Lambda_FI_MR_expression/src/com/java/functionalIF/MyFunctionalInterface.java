package com.java.functionalIF;

@FunctionalInterface
public interface MyFunctionalInterface {

	//define
	void print(String msg);

	default void m1() {
		System.out.println("deafult  method..");

	}
	
	static void m2() {
		System.out.println("Static method...");
	}

}
