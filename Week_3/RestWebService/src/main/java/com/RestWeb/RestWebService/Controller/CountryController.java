package com.RestWeb.RestWebService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.RestWeb.RestWebService.Model.Country;
import com.RestWeb.RestWebService.Service.CountryService;

@RestController
public class CountryController {
	
	@Autowired
	CountryService cs;
	
	@GetMapping("/country/{code}")
	public Country getCountry(@PathVariable String code) {
		return cs.getCountry(code);
	}
	
	
}
