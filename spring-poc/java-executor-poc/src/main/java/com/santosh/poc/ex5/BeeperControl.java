package com.santosh.poc.ex5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BeeperControl {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
			"HH:mm:ss");
	
	private final static ScheduledExecutorService scheduler = Executors
			.newScheduledThreadPool(3);

	public static void main(String[] args) {
		System.out.println("started at " + dateFormat.format(new Date()));
		beepForAnHour();
	}

	public static void beepForAnHour() {
		final Runnable beeper = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName()+" beeped at " + dateFormat.format(new Date()));
			}
		};
		final ScheduledFuture beeperHandle = scheduler.scheduleAtFixedRate(
				beeper, 10, 10, SECONDS);

		scheduler.schedule(new Runnable() {
			public void run() {
				beeperHandle.cancel(true);
			}
		}, 60 * 60, SECONDS);
	}
}
