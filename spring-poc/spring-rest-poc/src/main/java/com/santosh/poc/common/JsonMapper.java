package com.santosh.poc.common;

import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.santosh.poc.jaxb.SingularResponse;

public class JsonMapper {

	public static void main(String[] args) throws Exception {

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setPropertyNamingStrategy(
			    PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);

		InputStream inputStream = JsonMapper.class.getClassLoader().getResourceAsStream("response.json");
		SingularResponse singularResponse = objectMapper.readValue(inputStream, SingularResponse.class);

		System.out.println("SingularResponse : \n"
				+ objectMapper.writeValueAsString(singularResponse));
	}

}
