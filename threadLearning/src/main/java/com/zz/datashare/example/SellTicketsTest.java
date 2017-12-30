package com.zz.datashare.example;

public class SellTicketsTest {
	public static void main(String[] args) {
		SellTickets s = new SellTickets();
		new Thread(s).start();
		new Thread(s).start();
		new Thread(s).start();
	}
}
