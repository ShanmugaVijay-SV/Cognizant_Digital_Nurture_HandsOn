package com.RestWeb.RestWebService.Model;

import org.springframework.stereotype.Component;

@Component
public class Country {

	private String name; 
	private String code;
	
	public Country() {
		
	}
	
	public String getName(){
		return name;
	}
	public String getCode(){
		return code;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setCode(String code) {
		this.code=code;
	}
	
	public String toString() {
		return "Country Name = "+name+" ,Code = "+code;
	}
}
