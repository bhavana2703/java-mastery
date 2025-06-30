package exples;

import java.util.Scanner;

public class ReverseEachWorldInAString02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();

		String[] words = str.split("\\s");
		String revreseWords= "";
		
		for (String w : words) {
			
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			revreseWords= revreseWords+sb.toString() +" ";
		}
		System.out.println(revreseWords);

	}

}
