package com.santosh.concurrency.chapter1.recipe4.task;

import java.io.File;

public class FileSearch implements Runnable {

	private String initPath;

	private String fileName;

	public FileSearch(String initPath, String fileName) {
		this.initPath = initPath;
		this.fileName = fileName;
	}

	@Override
	public void run() {
		File file = new File(initPath);
		if (file.isDirectory()) {
			try {
				directoryProcess(file);
			} catch (InterruptedException e) {
				System.out.printf("%s: The search has been interrupted", Thread
						.currentThread().getName());
				cleanResources();
			}
		}
	}

	private void cleanResources() {

	}

	private void directoryProcess(File file) throws InterruptedException {

		// Get the content of the directory
		File list[] = file.listFiles();
		if (list != null) {
			for (int i = 0; i < list.length; i++) {
				if (list[i].isDirectory()) {
					// If is a directory, process it
					directoryProcess(list[i]);
				} else {
					// If is a file, process it
					fileProcess(list[i]);
				}
			}
		}
		// Check the interruption
		if (Thread.interrupted()) {
			throw new InterruptedException();
		}
	}

	private void fileProcess(File file) throws InterruptedException {
		// Check the name
		if (file.getName().equals(fileName)) {
			System.out.printf("%s : %s\n", Thread.currentThread().getName(),
					file.getAbsolutePath());
		}

		// Check the interruption
		if (Thread.interrupted()) {
			throw new InterruptedException();
		}
	}

}
