package exples;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter the String");
		str = sc.nextLine();

		String rev = reverseString(str);
		System.out.println("\n Reverse entire string "+rev);
		
		System.out.println("\n Reverse each  words ");
		reverseEachWord(str);
		
		System.out.println("\n Reverse word order ");
		reverseWordOrder(str);

	}

	private static void reverseWordOrder(String str) {
		// TODO Auto-generated method stub
		String[] words = str.trim().split("\\s");
		for (int i = words.length - 1; i >= 0; i--) {

			System.out.println(words[i] + "");
		}

	}

	static void reverseEachWord(String str) {
		// TODO Auto-generated method stub
		String[] words = str.trim().split("\\s");
		for (String word : words) {
			System.out.println(new StringBuffer(word).reverse().append(" ").toString());
		}

	}

	// reverse String
	static String reverseString(String str) {

		return new StringBuffer(str).reverse().toString();
	}

	//

}
