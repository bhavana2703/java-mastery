package exples;

import java.util.Scanner;

public class CountWordsAndChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// inputs
		//check wherether the string is empty
		//words count
		//words -->char count

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");

		String input = sc.nextLine().trim();

		if (input.isEmpty()) {
			System.out.println("Word count: 0");
			return;
		}
		String[] words = input.split("\\s+");
		System.out.println("Word count: " + words.length);
		
		for( String word:words) {
			System.out.println(word+ " : " +word.length());
		}

//		Enter the String 
//		love live life laugh
//		Word count: 4
//		love : 4
//		live : 4
//		life : 4
//		laugh : 5

		
	}

}
