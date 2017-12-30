package com.zz.create;


/**
 *创建线程
 *	1.继承一个thread,实际上thread类是实现了runnable接口
 *	2.实现一个runnable接口
 *		只有一个run（）方法；
 *		便于多个线程共享资源；
 *		java不支持多继承，如果已经继承了某个基类，便需要实现runnable接口来生成多线程；
 *		以实现runnable的对象为参数建立新的线程。
 *
 *	两种线程构造方式的比较
 *	1.使用Runnable接口：可以将CPU，代码和数据分开，形成清晰的模型；还可以从其他类继承；
 *	2.直接继承Thread类：编写简单，直接继承，重写run方法，不能再从其他类继承。
 *
 *	
 *	注意：启动一个线程是调用其start方法
 */
public class CreateThread
{
	/**
	 * main主线程和新线程是两个线程
	 * @param args
	 */
/*	public static void main(String[] args) {
		System.out.println("main thread starts");
		FactorialThread thread = new FactorialThread(10);
		thread.start();
		System.out.println("main thread ends");		
	}*/
	
	public static void main(String[] args) {
		System.out.println("main thread starts");
		FactorialThread2 thread = new FactorialThread2(10);
		new Thread(thread).start();
		System.out.println("main thread ends");			
	}

	
}
