package com.zz.datashare;

public class TestThread implements Runnable
{	
	private int sleepTime;
	public TestThread() {
		this.sleepTime = (int) (Math.random()*6000);
	}
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" going to sleep for "+sleepTime);
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" finished");
	}

}
