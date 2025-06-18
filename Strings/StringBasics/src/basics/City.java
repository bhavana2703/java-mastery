package basics;

import java.util.Scanner;

public class City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th city");
		String c_name =sc.nextLine();
		if(c_name.trim().equalsIgnoreCase("hydrabad")) {
			System.out.println("hello");
		}
		if(c_name.trim().equalsIgnoreCase("Bangalore")) {
			System.out.println("Bangalore");
		}
		if(c_name.trim().equalsIgnoreCase("Chenai")) {
			System.out.println("Chenai");
		}
		
		/// we must check/know that user may give input with some space or with (upper+ lower case)
		sc.close();
		
		
	}

}
