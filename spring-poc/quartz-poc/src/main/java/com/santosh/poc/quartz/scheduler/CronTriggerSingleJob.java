package com.santosh.poc.quartz.scheduler;

import java.util.List;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import com.santosh.poc.quartz.jobs.JobA;

@SuppressWarnings("unchecked")
public class CronTriggerSingleJob {
	
	public static void main(String[] args) throws Exception {

		Scheduler scheduler = new StdSchedulerFactory(QuartzProperties.load())
				.getScheduler();

		List<Trigger> triggers = (List<Trigger>) scheduler
				.getTriggersOfJob(new JobKey(JobA.class.getCanonicalName()
						+ "_Job", "DEFAULT"));

		if (triggers != null && triggers.size() == 0) {
			// JobDetail job = new JobDetail();
			// job.setName(JobA.class.getCanonicalName() + "_Job");
			// job.setJobClass(JobA.class);
			JobDetail jobDetail = JobBuilder.newJob(JobA.class)
					.withIdentity(JobA.class.getCanonicalName() + "_Job")
					.build();

			// CronTrigger trigger = new CronTrigger();
			// trigger.setName(JobA.class.getCanonicalName() + "_Trigger");
			// trigger.setCronExpression("0/5 * * * * ?");

			Trigger trigger = TriggerBuilder
					.newTrigger()
					.withIdentity(JobA.class.getCanonicalName() + "_Trigger")
					.withSchedule(
							CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
					.build();

			scheduler.scheduleJob(jobDetail, trigger);
		}
		scheduler.start();
	}
}
