package com.santosh.poc.quartz.scheduler;

import java.util.List;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import com.santosh.poc.quartz.jobs.JobA;

@SuppressWarnings("unchecked")
public class SimpleTriggerSingleJob {

	public static void main(String[] args) throws Exception {

		// schedule it
		Scheduler scheduler = new StdSchedulerFactory(QuartzProperties.load())
				.getScheduler();

		List<Trigger> triggers = (List<Trigger>) scheduler
				.getTriggersOfJob(new JobKey(JobA.class.getCanonicalName() + "_Job",
						"DEFAULT"));
		
		if (triggers != null && triggers.size() == 0) {
			
			JobDetail jobDetail = JobBuilder.newJob(JobA.class)
					.withIdentity(JobA.class.getCanonicalName() + "_Job").build();

			// Trigger the job to run on the next round minute
			Trigger trigger = TriggerBuilder
					.newTrigger()
					.withIdentity(JobA.class.getCanonicalName() + "_Trigger")
					.withSchedule(
							SimpleScheduleBuilder.simpleSchedule()
									.withIntervalInMinutes(2).repeatForever())
					.build();

			scheduler.scheduleJob(jobDetail, trigger);
		}
		scheduler.start();
	}
}
