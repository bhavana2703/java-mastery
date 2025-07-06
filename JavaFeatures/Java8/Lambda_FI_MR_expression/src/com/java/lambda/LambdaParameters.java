package com.java.lambda;

import java.io.IOException;

interface Addable{
	int addtion(int a,int b);
}


class AddableImpl implements Addable{


	@Override
	public int addtion(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}
	
}
public class LambdaParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addable addition =(int a, int b)-> (a+b);
		int result = addition.addtion(7,8);
		System.out.println(result);
		
		Addable abb=(int a, int b)->{
			int c = (a+b);
			return c;
		};
	
	}
	

}
