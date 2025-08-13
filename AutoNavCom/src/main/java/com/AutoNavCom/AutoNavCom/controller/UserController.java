package com.AutoNavCom.AutoNavCom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;

@RestController
@RequestMapping("/home")
public class UserController {
	
	
	@GetMapping("/homepage")
	public String Homepage(Model model) {
		
		
		return "I love Myself";
	}

}
