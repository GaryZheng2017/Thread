package com.zz.datashare.example;

public class SellTickets implements Runnable
{
	private int tickets = 200;
	@Override
	public void run() {
		while(tickets>0)
		{
			System.out.println(Thread.currentThread().getName()+" is selling ticket" +tickets--);
		}
	}

}
