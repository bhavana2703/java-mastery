package com.java.lambda;

class ThreadDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("run method is called.....");
		
	}
	
}

public class RunnableLambdaExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		
		Runnable runnable =   ()->
			System.out.println("run method is called using lambda expresion.....");
		
		
		Thread th = new Thread( runnable);
		th.start();
	}

}
