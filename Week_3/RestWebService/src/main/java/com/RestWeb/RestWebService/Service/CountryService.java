package com.RestWeb.RestWebService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestWeb.RestWebService.Model.Country;

@Service
public class CountryService {
	
	@Autowired
	Country country;
	
	@Autowired
	List<Country> countryList;
	
	
	public Country getCountry(String code) {
		for(Country c:countryList) {
			if(c.getCode().equalsIgnoreCase(code)) return c;
		}
		return null;
	}
}
