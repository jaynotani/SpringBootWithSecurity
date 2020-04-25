package com.jay.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	
	@GetMapping("/")
	public String home() {
		//return "<h1> JAi Gajanan </h1>";
		return "<h1> Welcome Vedika </h1>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		//return "<h1> JAi Gajanan </h1>";
		return "<h1> Welcome Admin </h1>";
	}
	
	@GetMapping("/user")
	public String user() {
		//return "<h1> JAi Gajanan </h1>";
		return "<h1> Welcome User </h1>";
	}
}
