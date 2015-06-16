package com.santosh.concurrency.chapter1.recipe7.core;

import java.util.ArrayDeque;
import java.util.Deque;

import com.santosh.concurrency.chapter1.recipe7.event.Event;
import com.santosh.concurrency.chapter1.recipe7.task.CleanerTask;
import com.santosh.concurrency.chapter1.recipe7.task.WriterTask;

public class Main {

	public static void main(String[] args) {

		// Creates the Event data structure
		Deque<Event> deque = new ArrayDeque<Event>();

		// Creates the three WriterTask and starts them
		WriterTask writer = new WriterTask(deque);
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread(writer);
			thread.start();
		}

		// Creates a cleaner task and starts them
		CleanerTask cleaner = new CleanerTask(deque);
		cleaner.start();

	}

}
