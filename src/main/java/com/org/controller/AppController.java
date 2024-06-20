package com.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		String s = "Welcome to RESTful Services...";
		int i = 10/0;
		return s;
	}
	
}
