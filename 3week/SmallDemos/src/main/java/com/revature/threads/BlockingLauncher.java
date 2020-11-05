package com.revature.threads;

public class BlockingLauncher {
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new BlockingThread());
		t1.setName("User-Alec");
		Thread t2 = new Thread(new BlockingThread());
		t2.setName("User-Sushma");
		t1.start();
		t2.start();
		
		
		Thread.sleep(20000);
		
		
		
	}

}
