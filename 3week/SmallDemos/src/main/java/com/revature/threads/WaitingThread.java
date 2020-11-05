package com.revature.threads;

public class WaitingThread implements Runnable{
	private Thread other;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Waiting Thread is beginning to wait on " + other.getName());
		
		try {
			other.join();//I have to process 100 subtasks
						// a main thread create 100 sub threads and then join on all of them
						//once they all complete the main thread begins again
			System.out.println("Waiting Thread Finished Waiting on " + other.getName() + " and Will now also die");
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		
	}

	
	public WaitingThread(Thread o) {
		this.other = o;
	}
	
}
