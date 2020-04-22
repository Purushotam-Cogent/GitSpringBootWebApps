package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {
	
	@RequestMapping("/")
	public String getMessage()
	{
		return "<h1>Welcome to Spring</h1>";
	}

}
