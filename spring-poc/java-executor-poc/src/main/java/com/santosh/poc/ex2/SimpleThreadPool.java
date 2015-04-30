package com.santosh.poc.ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread("Worker-" + i);
			executor.execute(worker);
		}
		
		executor.shutdown();
		
		while (!executor.isTerminated()) {
//			System.out.println("Tasks are not completed");
		}
		
		System.out.println("Finished all threads");
	}

}
