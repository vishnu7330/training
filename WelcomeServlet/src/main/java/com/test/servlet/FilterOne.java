package com.test.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "filterOne", urlPatterns = "/msg/*", servletNames = "WelcomeServlet")
public class FilterOne implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Inside filter one.");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	}
}
/*
Examples that have been identified for this design are: 
1.Authentication Filters 
2.Logging and Auditing Filters 
3.Image conversion Filters 
4.Data compression Filters 
5.Encryption Filters 
6.Tokenizing Filters 
7.Filters that trigger resource access events 
8.XSL/T filters 
9.Mime-type chain Filter 
*/