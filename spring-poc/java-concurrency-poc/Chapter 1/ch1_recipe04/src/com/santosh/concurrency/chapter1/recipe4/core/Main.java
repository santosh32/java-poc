package com.santosh.concurrency.chapter1.recipe4.core;

import java.util.concurrent.TimeUnit;

import com.santosh.concurrency.chapter1.recipe4.task.FileSearch;

public class Main {

	public static void main(String[] args) {
		// Creates the Runnable object and the Thread to run it
		FileSearch searcher = new FileSearch("C:\\", "autoexec.bat");
		Thread thread = new Thread(searcher);

		// Starts the Thread
		thread.start();

		// Wait for ten seconds
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Interrupts the thread
		thread.interrupt();
	}

}
