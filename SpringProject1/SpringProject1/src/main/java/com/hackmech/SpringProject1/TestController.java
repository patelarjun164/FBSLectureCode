package com.hackmech.SpringProject1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello")
	public String showMessage() {
		return "Hello world";
	}
	
	@GetMapping("/apna")
	public Account apnaMessage() {
		return new Account(1, "Arjun", 25000);
	}
	
}
