package com.santosh.concurrency.chapter1.recipe3.core;

import java.util.concurrent.TimeUnit;

import com.santosh.concurrency.chapter1.recipe3.task.PrimeGenerator;

public class Main {

	public static void main(String[] args) {

		// Launch the prime numbers generator
		Thread task = new PrimeGenerator();
		task.start();

		// Wait 5 seconds
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Interrupt the prime number generator
		task.interrupt();
	}

}
