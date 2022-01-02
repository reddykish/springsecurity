package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class web {
	@GetMapping("/home")
	public String home()
	{
		return "home page";
	}
	@GetMapping("/admin")
	public String admin()
	{
		return "admin page ";
	}
	@GetMapping("/emp")
	public String employee()
	{
		return "employee page";
	}
}
