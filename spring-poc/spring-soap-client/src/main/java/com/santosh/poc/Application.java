package com.santosh.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ws.config.annotation.EnableWs;

import com.santosh.poc.ws.WeatherClient;
import com.santosh.poc.wsdl.GetCityForecastByZIPResponse;

@SpringBootApplication
@EnableWs
@EnableAutoConfiguration
public class Application implements CommandLineRunner {

//	@Autowired
//	private WebServiceAdapter webServiceAdapter;

	@Autowired
	private WeatherClient weatherClient;

	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		GetCityForecastByZIPResponse response = weatherClient.getCityForecastByZip("94304");
		weatherClient.printResponse(response);
	}

}
