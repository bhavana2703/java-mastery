package com.java.functionalIF;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SuplierImpl implements Supplier<LocalDateTime>{

	@Override
	public LocalDateTime get() {
		// TODO Auto-generated method stub
		return LocalDateTime.now();
	}
	
}

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Supplier<LocalDateTime>supplier = new SuplierImpl();
	//	System.out.println(supplier.get());
		
		//lambda
	
		Supplier<LocalDateTime>sup =()->  LocalDateTime.now();
		System.out.println(sup.get());
			
	}

}
