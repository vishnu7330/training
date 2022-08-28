package com.example.external.ldap.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.external.ldap.authdetails.AuthenticationFacade;

@RestController
public class HomeController {

	@Autowired
	private AuthenticationFacade authenticationFacade;

	@Autowired
	BCryptPasswordEncoder passwordEncoder;

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
		Authentication authentication = authenticationFacade.getAuthentication();
		System.out.println(passwordEncoder.encode("portal"));
		return "Admin, Name: " + authentication.getName();
	}

	@GetMapping("/principal")
	public String currentUserName(Principal principal) {
		return principal.getName();
	}

	@GetMapping("/authentication")
	public String currentUserName(Authentication authentication) {
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		System.out.println("User has authorities: " + userDetails.getAuthorities());
		return authentication.getName();
	}

	@GetMapping("/servletRequest")
	public String currentUserNameSimple(HttpServletRequest request) {
		Principal principal = request.getUserPrincipal();
		return principal.getName();
	}
}
