package com.training.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.springmvc.model.Employee;

@Controller
public class HelloController {

   @GetMapping("/")
   public String index() {
      return "index";
   }

   @PostMapping("/hello")
   public String sayHello(@RequestParam("name") String name, Model model) {
	   
	  Employee emp = new Employee();
	  emp.setName("Mike Sherrard");
	  emp.setRole("DEVELOPER");
	  
      model.addAttribute("name", name);
      
      model.addAttribute("employee" , emp);
      
      return "hello";
   }
}
