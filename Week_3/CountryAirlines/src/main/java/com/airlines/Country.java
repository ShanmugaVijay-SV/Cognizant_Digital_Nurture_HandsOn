package com.airlines;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	
	private String code;
	private String name;
	
	private static final Logger LOGGER =
	        LoggerFactory.getLogger(Country.class); 
	
	public Country(){
		LOGGER.debug("Inside Country Constructor.");
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCode(){
		return code;
	}
	
	@Override
	public String toString() {
		return "Country ["+code+" = "+name+"]";
	}
	
}
