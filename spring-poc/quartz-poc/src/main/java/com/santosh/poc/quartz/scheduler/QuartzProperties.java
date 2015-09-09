package com.santosh.poc.quartz.scheduler;

import java.util.Properties;

public class QuartzProperties {

	public static Properties load() throws Exception {
		Properties properties = new Properties();
		properties.load(QuartzProperties.class.getClassLoader()
				.getResourceAsStream("quartz.properties"));
		return properties;
	}
}
