package com.santosh.poc.ex1;

public class TaskPrint implements Runnable {

	private final String name;
	private final int delay;

	public TaskPrint(String name, int delay) {
		this.name = name;
		this.delay = delay;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName()+" Starting : " + name);
		try {
			Thread.sleep(delay);
		} catch (InterruptedException ignored) {
			System.err.println(ignored.getMessage());
		}
		System.out.println("Done with: " + name);
	}
}