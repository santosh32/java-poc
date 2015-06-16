package com.santosh.concurrency.chapter1.recipe8.task;

public class Task implements Runnable {

	@Override
	public void run() {
		// The next instruction always throws and exception
		int numero = Integer.parseInt("TTT");
	}

}
