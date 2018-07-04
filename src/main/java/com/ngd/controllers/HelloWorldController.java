package com.ngd.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(value = "/api/hello")
	public String getHello(){
		return "Hello world";
	}
	
}
