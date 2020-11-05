package com.revature.threads;

public class ThreadStateLauncher {

	
	
	public static void main(String[] args) throws InterruptedException {
		//one thread that goes to sleep for a while
		Thread sleepy = new Thread(new SleepyThread());
		sleepy.setName("Sleepy");
		//one thread that waits for that thread to wake up
		Thread waiting = new Thread(new WaitingThread(sleepy));
		waiting.setName("Waiting");
		//main thread keeps track of both
		threadInfo(sleepy);//NEW
		sleepy.start();
		threadInfo(sleepy);//RUNNABLE
		
		//by default the main thread gets to execute for a while
		//if I want to let another thread execute
		//I can just sleep for a bit
		Thread.sleep(1000);//to let other threads run

		threadInfo(sleepy);//?
		waiting.start();
		threadInfo(waiting);//?
		
		Thread.sleep(1000);//to let other threads run
		
		threadInfo(waiting);//?
		
		
		Thread.sleep(5000);//let other threads run
		
		threadInfo(sleepy);//?
		threadInfo(waiting);//?
		
		
	}
	
	
	public static void threadInfo(Thread t) {
		System.out.println("[NAME: " + t.getName() + ", STATE: " + t.getState() + "]");
	}
	
	
}
