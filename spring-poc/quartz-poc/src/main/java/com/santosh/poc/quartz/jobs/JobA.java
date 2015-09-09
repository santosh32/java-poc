package com.santosh.poc.quartz.jobs;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JobA implements Job {
	
	Logger log = LoggerFactory.getLogger(JobA.class);
	
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		log.info(" =============================================================================================");
		log.info(" =============================================================================================");
		
		log.info("               Quartz JobA ! - " + new Date());
		
		log.info(" ============================================================================================= ");
		log.info(" ============================================================================================= ");
	}
}
