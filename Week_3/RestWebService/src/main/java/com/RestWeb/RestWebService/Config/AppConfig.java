package com.RestWeb.RestWebService.Config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.RestWeb.RestWebService.Model.Country;

@Configuration
public class AppConfig {

	@Bean
	List<Country> countryList(){
		
		List<Country> list = new ArrayList<>();
		
		Country c1=new Country();
		c1.setName("India");
		c1.setCode("IN");
		
		Country c2=new Country();
		c2.setName("United States");
		c2.setCode("US");
		
		Country c3=new Country();
		c3.setName("Germany");
		c3.setCode("DE");
		
		Country c4=new Country();
		c4.setName("Japan");
		c4.setCode("JP");
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		
		return list;
	}
}
