package com.airlines;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringLearnApplication {
	private static final Logger LOGGER =
			LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		ApplicationContext context =
		        new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country",Country.class);
		LOGGER.debug("My Country : {}", country);
		
		CountryRepo repo = context.getBean("countryRepo", CountryRepo.class);
		List<Country> lst=repo.getCountrylist();
		for(Country c:lst) {
			LOGGER.info(c.toString());
		}
    }
}
