package com.valuelabs.poc;

import javax.annotation.PostConstruct;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.valuelabs.poc.dao.Singular;
import com.valuelabs.poc.dao.SingularDao;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	@Autowired
	private SingularDao singularDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void performDbOps() {
		Singular singular = new Singular();
		singular.setSid(RandomUtils.nextInt(2));
		singular.setTracker_clicks(String.valueOf(RandomUtils.nextInt(3)));
		singular.setCustom_installs(String.valueOf(RandomUtils.nextDouble()));
		singularDao.save(singular);
	}
}
