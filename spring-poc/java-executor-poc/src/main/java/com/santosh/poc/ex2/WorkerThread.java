package com.santosh.poc.ex2;

public class WorkerThread implements Runnable {

	private String worker;

	public WorkerThread(String worker) {
		this.worker = worker;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " Started " + worker);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " Ended "+ worker);
	}

	@Override
	public String toString() {
		return this.worker;
	}
}
