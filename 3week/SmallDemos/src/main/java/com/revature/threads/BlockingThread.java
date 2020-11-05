package com.revature.threads;

public class BlockingThread implements Runnable{
	
	
	@Override
	public void run() {
		FakeDatabaseUtil util = FakeDatabaseUtil.getUtil();
		
		System.out.println(Thread.currentThread().getName() + " is trying to get the database connection");
		String connection = util.getConnection();
		System.out.println(Thread.currentThread().getName() + " : " + connection);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " released connection");
		util.releaseConnection();
		
	}

}
