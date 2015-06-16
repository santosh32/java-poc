package com.santosh.concurrency.chapter1.recipe5.core;

import java.util.concurrent.TimeUnit;

import com.santosh.concurrency.chapter1.recipe5.task.FileClock;

public class Main {

	public static void main(String[] args) {
		// Creates a FileClock runnable object and a Thread
		// to run it
		FileClock clock = new FileClock();
		Thread thread = new Thread(clock);

		// Starts the Thread
		thread.start();
		try {
			// Waits five seconds
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Interrupts the Thread
		thread.interrupt();
	}
}
