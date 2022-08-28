package com.example.external.ldap.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/hello")
	public String hello() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println("Authorities: " + authentication.getAuthorities());
		System.out.println("Details: " + authentication.getDetails());
		return "Hello " + currentPrincipalName;
	}

	@GetMapping("/admin")
	public String admin() {
		return "Admin";
	}
}
