package com.AutoNavCom.AutoNavCom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.AutoNavCom.AutoNavCom.model.Vendor;
import com.AutoNavCom.AutoNavCom.service.VendorService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/vendor")
@RequiredArgsConstructor
@ControllerAdvice
public class VendorController{
	
	
	
	private final VendorService vendorService;
	
	
	@GetMapping("/vendorhome")
	public String getVendorName(Model model) {
		model.addAttribute(new Vendor());
		return "vendor";
	}
	
	
	@PostMapping("/addvendor")
	public String addVendorDetails(@ModelAttribute Model model, Vendor vendor, RedirectAttributes redirectAttributes) {
		
		log.info("Vendor Object :{}",vendor);
		Boolean result = vendorService.addVendorDetails(vendor);
		log.info("Result of Add Query :{}",result);
		
		if(result) {
			redirectAttributes.addFlashAttribute("responseSuccess","Vendor Details Added Successfully!");
			return "redirect:/vendor/vendorhome";
		}
		redirectAttributes.addFlashAttribute("responseFailed","Vendor Details Registration fail!");
		return "redirect:/vendor/vendorhome";
	}
	

}
