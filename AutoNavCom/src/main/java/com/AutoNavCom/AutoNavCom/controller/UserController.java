package com.AutoNavCom.AutoNavCom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AutoNavCom.AutoNavCom.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/home")
public class UserController {
	
	
	@GetMapping("/homepage")
	public String Homepage(Model model) {
		
		model.addAttribute("user", new User());
		
		return "user";
	}

}
