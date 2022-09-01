package com.training.rest.basic.auth.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class AuthenticationController {
	
	@GetMapping(path = "/basicauth")
    public void basicauth() {
		System.out.println("Authentication called");
    }
}
