package com.santosh.poc.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.santosh.poc.jaxb.SingularResponse;

public class RestConsumer {

	public static String requestURL = "https://api.singular.net/api/fetch_reporting_data?"
			+ "dimensions=app,site_public_id,source,os,platform,country_field,adn_campaign,adn_subadnetwork,"
			+ "adn_original_currency,adn_timezone,adn_utc_offset,adn_account_id,adn_campaign_url,adn_sub_campaign,"
			+ "adn_status,adn_click_type,tracker_name"
			+ "&metrics=adn_impressions,custom_clicks,custom_installs,adn_cost,adn_estimated_total_conversions,"
			+ "adn_original_cost,ctr,cvr,ecpi,ocvr,ecpm,ecpc"
			+ "&discrepancy_metrics=adn_clicks,tracker_clicks,adn_installs,tracker_installs"
			+ "&time_breakdown=all"
			+ "&end_date=2015-02-01"
			+ "&start_date=2015-02-01";

	public static void main(String[] arg) throws Exception {

		RestTemplate restTemplate = new RestTemplate();
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setPropertyNamingStrategy(
			    PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
		
		List<HttpMessageConverter<?>> listMessageConverters = new ArrayList<HttpMessageConverter<?>>();
		listMessageConverters.add(new MappingJackson2HttpMessageConverter(objectMapper));
		restTemplate.setMessageConverters(listMessageConverters);
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization",
				"04a093086d8397d511e2d9d4a7022d904b70f202bf2bb51a5855e3173964c243");

		HttpEntity<String> entity = new HttpEntity<String>(headers);

		HttpEntity<SingularResponse> httpEntity = restTemplate.exchange(
				requestURL, HttpMethod.GET, entity, SingularResponse.class);

		SingularResponse singularResponse = httpEntity.getBody();

		System.out.println("SingularResponse : \n"
				+ objectMapper.writeValueAsString(singularResponse));
	}

}