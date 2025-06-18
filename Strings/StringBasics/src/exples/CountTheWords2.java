package exples;

import java.util.Scanner;

public class CountTheWords2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String str = sc.nextLine();
		
		int count =1;
		
		for(int i=0;i<str.length()-1;i++) 
		{
			if(str.charAt(i)==' ' && (str.charAt(i+1)!=' '))
			{
			count++;	
			}
			
		}
		
		System.out.println("Number of words : "+count);
		///Enter the String: 
		//hello world
		//Number of words : 2


	}

}
