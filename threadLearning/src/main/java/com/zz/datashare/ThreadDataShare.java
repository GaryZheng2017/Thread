package com.zz.datashare;

public class ThreadDataShare
{
	/**
	 * 三个线程的时间是一样的，因为是用一个Runable类型对象创建的3个新线程，
	 * 				这三个线程就共享了这个对象的私有成员sleepTime，在本次
	 * 				运行中，三个线程都休眠了5753ms
	 * @param args
	 */
	public static void main(String[] args)
	{
		TestThread threadobj = new TestThread();
		System.out.println("Starting threads");
		
		new Thread(threadobj,"Thread1").start();
		new Thread(threadobj,"Thread2").start();
		new Thread(threadobj,"Thread3").start();
		
		System.out.println("Threads started,main ends\n");
		


		//结果
	  /*Starting threads
		Threads started,main ends
		Thread1 going to sleep for 5753
		Thread2 going to sleep for 5753
		Thread3 going to sleep for 5753
		Thread3 finished
		Thread1 finished
		Thread2 finished*/
	}
}
