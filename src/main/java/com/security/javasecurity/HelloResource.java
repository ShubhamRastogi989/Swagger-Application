package com.security.javasecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloResource {

	
	@GetMapping("/hello")
	public String helloWorld() {
		return "hello World!";
	}
}
