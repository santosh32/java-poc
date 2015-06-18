package com.santosh.concurrency.chapter1.recipe7.core;

import java.util.concurrent.TimeUnit;

import com.santosh.concurrency.chapter1.recipe7.task.UnsafeTask;

public class Main {

	public static void main(String[] args) {
		// Creates the unsafe task
		UnsafeTask task = new UnsafeTask();

		// Throw three Thread objects
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread(task);
			thread.start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
