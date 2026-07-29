package com.cognizant.spring_learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import com.cognizant.spring_learn.service.HelloService;

@RestController
public class HelloController {
	
	@Autowired
	HelloService hs;
	
	@GetMapping("/hello")
	public String hello() {
		return hs.sayHello();
	}
	
}
