package exples;

import java.util.Scanner;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");

		String str = sc.nextLine();

		// Spliting the string
		String[] words = str.split(" ");

		String revreseString = "";
		
		

		for (String w : words) {
			String reverseword = "";

			for (int i = w.length() - 1; i >= 0; i--) {

				reverseword = reverseword + w.charAt(i);
			}

			revreseString=revreseString+reverseword+" ";
		}
		
		System.out.println(revreseString);
		
		///Enter the String: 
		///pooja bhavana keshava
		///ajoop anavahb avahsek 
	
	

	}

}
