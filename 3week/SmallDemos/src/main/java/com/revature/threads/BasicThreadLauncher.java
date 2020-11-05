package com.revature.threads;

public class BasicThreadLauncher {

	// start a new thread from extending

	// start a new thread from a runnable

	public static void main(String[] args) {
		
		Thread ext = new BasicThread();
		
		Thread runnable = new Thread(new BasicRunnable());
		
		
		ext.start();
		runnable.start();
		while (true) {
			System.out.println("Hello From the Main Thread");
		}
	}

}
