package com.RestWeb.RestWebService;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestWebServiceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(RestWebServiceApplication.class);
	
	public static void main(String[] args) {
		LOGGER.info("Application Started");
		SpringApplication.run(RestWebServiceApplication.class, args);
		LOGGER.info("End");
	}

}
