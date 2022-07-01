package com.training.authentication.authorization.ldap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

	@GetMapping("/admin")
	public String adminView() {
		return "adminView";
	}
}
