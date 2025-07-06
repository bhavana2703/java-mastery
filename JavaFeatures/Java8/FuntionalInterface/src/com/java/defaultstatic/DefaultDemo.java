package com.java.defaultstatic;




/*
 * default methods and static are not overriden
 * directly  default method will be inherted
 * 
 */
interface Vehicle {

	String getBrand();

	String speedUp();

	String slowDown();

	default String turnAlarmOn() {
		return "turning vehicle alaram on....";
	}

	default String turnAlarmOf() {
		return "turning vehicle alaram off..";
	}
	
	static String getCompany() {
		return "BMWW";
	}

}

class Car implements Vehicle{

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "BMW";
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "the car is speeding up";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "the car is speeding down";
	}
	
}

public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//interface as refrecence vars
		Vehicle vc = new Car();
		System.out.println(vc.getBrand());
		System.out.println(vc.speedUp());
		System.out.println(vc.slowDown());
		System.out.println(vc.turnAlarmOf());
		System.out.println(vc.turnAlarmOf());
		System.out.println(Vehicle.getCompany());
		
			

	}

}
