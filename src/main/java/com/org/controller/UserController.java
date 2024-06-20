package com.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.org.exception.UserNotFoundException;

@RestController
public class UserController {

	@GetMapping("/user/{id}")
	public String getUserName(@PathVariable Integer id)
	{
		if(id == 100)
		{
			return "John";
		}
		else if(id == 200)
		{
			return "Smith";
		}
		else
		{
			throw new UserNotFoundException("User Not Found!!!");
		}
	}
	
}
