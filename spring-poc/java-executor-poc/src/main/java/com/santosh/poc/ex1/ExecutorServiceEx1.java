package com.santosh.poc.ex1;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceEx1 {
	
	public static void main(String args[]) {
		
		Random random = new Random();

		// Create an executor of thread pool size 3
//		ExecutorService executor = Executors.newFixedThreadPool(3);
//		ExecutorService executor = Executors.newCachedThreadPool();
		ExecutorService executor = Executors.newScheduledThreadPool(3);

		// Sum up wait times to know when to shutdown
		int waitTime = 600;
		
		for (int i = 0; i < 10; i++) {
			String name = "PrintTask-" + i;
			int time = random.nextInt(500);
			waitTime += time;
			Runnable runner = new TaskPrint(name, time);
			System.out.println("Adding : " + name + " / " + time);
			executor.execute(runner);
		}
		
		try {
			Thread.sleep(waitTime);
			executor.shutdown();
			executor.awaitTermination(waitTime, TimeUnit.MILLISECONDS);
		} catch (InterruptedException ignored) {
			System.err.println(ignored.getMessage());
		}
		
		System.exit(0);
	}
}
