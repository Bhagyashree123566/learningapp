 package com.learnSphere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class NavController {
	@GetMapping("/index")
	public String index() {
		return "index";
		
	}

	@GetMapping("/register")
	public String register() {
		return "register";
		
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
		
	}
	
	@GetMapping("/addC")
	public String addC() {
		return "addCourse";
		
	}
	
	@GetMapping("/newLesson")
	public String newLesson() {
		return "newLesson";
		
	}
	
	
	@GetMapping("/purchase")
	public String perchase() {
		return "purchaseCourse";
		
	}
	
	@GetMapping("/aboutUs")
	public String about() {
		return "aboutUs";
		
	}
	
}
