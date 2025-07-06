package com.java.functionalIF;

import java.util.function.Consumer;

class ConsumerImp implements Consumer<String>{

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}


public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Consumer<String> consumer = new ConsumerImp();
	//	System.out.println("Hello World...");
		
		 Consumer<String> con = t-> System.out.println(t);
		 con.accept("Hello Peuple");
		 
				

	}

}
