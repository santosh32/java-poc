package com.santosh.concurrency.chapter1.recipe11.core;

import com.santosh.concurrency.chapter1.recipe11.group.MyThreadGroup;
import com.santosh.concurrency.chapter1.recipe11.task.Task;

public class Main {

	public static void main(String[] args) {

		// Create a MyThreadGroup object
		MyThreadGroup threadGroup = new MyThreadGroup("MyThreadGroup");
		// Create a Taks object
		Task task = new Task();
		// Create and start two Thread objects for this Task
		for (int i = 0; i < 2; i++) {
			Thread t = new Thread(threadGroup, task);
			t.start();
		}
	}

}
