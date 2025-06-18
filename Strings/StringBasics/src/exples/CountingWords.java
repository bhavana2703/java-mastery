package exples;

import java.util.Scanner;

public class CountingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		
		
		String input = sc.nextLine();
		String [] words =input.trim().split("\\s");
		int count =words.length ;
		
		System.out.println(count);
		
		//Enter the String 
		//hey hi hello
		//3

	
		
	}

}
