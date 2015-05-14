/*package com.santosh.poc.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.santosh.poc.wsdl.GetWeatherInformation;
import com.santosh.poc.wsdl.GetWeatherInformationResponse;

@Component
public class WebServiceAdapter {

	@Qualifier("webServiceTemplate")
	@Autowired
	public WebServiceTemplate webServiceTemplate;

	public void getWeatherInformation() {
		
		GetWeatherInformation weatherInformation = new GetWeatherInformation();
		GetWeatherInformationResponse weatherInformationResponse = (GetWeatherInformationResponse) webServiceTemplate
				.marshalSendAndReceive(weatherInformation);

		System.out.println(weatherInformationResponse);
	}
}*/