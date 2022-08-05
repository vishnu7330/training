package com.training.micro.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

	@GetMapping("/employeeServiceFallback")
	public String employeeServiceFallback() {
		return "Employee service is taking longer than expected. Please try again later.";
	}
	
	@GetMapping("/departmentServiceFallback")
	public String departmentServiceFallback() {
		return "Department service is taking longer than expected. Please try again later.";
	}
}
