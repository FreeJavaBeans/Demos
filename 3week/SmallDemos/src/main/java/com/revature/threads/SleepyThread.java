package com.revature.threads;

public class SleepyThread implements Runnable {
	@Override
	public void run() {
		
		
		try {
			System.out.println("Sleepy Thread started and is going to sleep, Yawn!");
			Thread.sleep(5000);//TIMED_WAITING state
			System.out.println("Sleepy Thread has woken up and will now die a tragic death");
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
}
