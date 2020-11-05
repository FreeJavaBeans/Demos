package com.revature.threads;

public class FakeDatabaseUtil {
	
	private String databaseConnection = "I'm the database YippEE!";
	
	private boolean connectionInUse = false;
	
	private static FakeDatabaseUtil util = new FakeDatabaseUtil();
	
	
	private FakeDatabaseUtil() {
		// TODO Auto-generated constructor stub
	}
	

	public static FakeDatabaseUtil getUtil() {
		return util;
	}
	
	//java gives us a special keyword for methods called synchronized
	//a synchronized method has all sorts of internal concurrency setup done on it
	//a synchronized method allows us to call the .wait and .notify methods on the object belongs to
	//any thread that executes the .wait function will sit waiting until a different executes the .notify function
	synchronized public String getConnection() {
		//as long as the connection is being used
		while(connectionInUse) {
			try {
				System.out.println(Thread.currentThread().getName() + " is stuck waiting");
				this.wait();//wait
				//we leave the wait function once someone calls the notify function on the object
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		connectionInUse = true;
		return databaseConnection;
		
	}
	
	//this will call the notify function once we are done with the resource
	synchronized public void releaseConnection() {
		connectionInUse = false;
		this.notify();//tell other threads that are waiting, the connection is available again
	}
	
}
