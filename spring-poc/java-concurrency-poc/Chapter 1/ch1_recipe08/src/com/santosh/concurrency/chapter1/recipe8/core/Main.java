package com.santosh.concurrency.chapter1.recipe8.core;

import com.santosh.concurrency.chapter1.recipe8.handler.ExceptionHandler;
import com.santosh.concurrency.chapter1.recipe8.task.Task;

public class Main {

	public static void main(String[] args) {
		// Creates the Task
		Task task = new Task();
		// Creates the Thread
		Thread thread = new Thread(task);
		// Sets de uncaught exception handler
		thread.setUncaughtExceptionHandler(new ExceptionHandler());
		// Starts the Thread
		thread.start();

		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.printf("Thread has finished\n");

	}

}
