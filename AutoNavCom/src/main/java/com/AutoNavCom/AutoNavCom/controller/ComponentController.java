package com.AutoNavCom.AutoNavCom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.AutoNavCom.AutoNavCom.model.Component;
import com.AutoNavCom.AutoNavCom.model.User;
import com.AutoNavCom.AutoNavCom.service.ComponetService;
import com.AutoNavCom.AutoNavCom.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.lang.System.Logger;
import java.net.http.HttpClient.Redirect;

import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Controller
@Slf4j
@RequestMapping("/component")
public class ComponentController {
	

    private final ComponetService compservice;
	

    @Autowired
    public ComponentController(ComponetService compservice) {
        this.compservice = compservice;
    }
	
	@GetMapping("/add_Component")
	public String Componentpage(Model model) {
		
		model.addAttribute("component", new Component());
		return "component_page";
	}
	
	
	@PostMapping("/Component_registration")
	public String addComponent(@ModelAttribute Component component, Model model , RedirectAttributes redirectAttribute) {
		
		log.info("User Information {}", component);
     	boolean status = compservice.AddComponet(component);   
	    status = false;
	   if(status) {
		   redirectAttribute.addFlashAttribute("responseSuccess", "Component Added successfully!");
	       return "redirect:/component/add_Component";
	   }
	   
	   redirectAttribute.addFlashAttribute("responseFailed", "Component Fail to Add!");  
       return "redirect:/component/add_Component"; // Reload the form page
		
		
	}
	
	
	
	

}
