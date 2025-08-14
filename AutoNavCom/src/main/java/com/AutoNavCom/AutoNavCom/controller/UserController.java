package com.AutoNavCom.AutoNavCom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.AutoNavCom.AutoNavCom.model.User;
import com.AutoNavCom.AutoNavCom.service.UserService;

import lombok.extern.slf4j.Slf4j;

import java.lang.System.Logger;
import java.net.http.HttpClient.Redirect;

import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@Slf4j
@RequestMapping("/home")
public class UserController {
	

	private final UserService userservice;
	

    @Autowired
    public UserController(UserService userservice) {
        this.userservice = userservice;
    }
	
	@GetMapping("/homepage")
	public String Homepage(Model model) {
		
		model.addAttribute("user", new User());
		
		return "user";
	}
	
	
	@PostMapping("/user_registration")
	public String CreateUser(@ModelAttribute User user, Model model , RedirectAttributes redirectAttribute) {
		
		log.info("User Information {}", user);
		userservice.createUser(user);   
	   
	   //model.addAttribute("SuccessMessage", "User registered successfully!");
	   redirectAttribute.addFlashAttribute("responseSuccess", "User registered successfully!");
       model.addAttribute("user", new User()); // Clear the form
          
       
       return "redirect:/home/homepage"; // Reload the form page
		
		
	}
	
	
	
	

}
