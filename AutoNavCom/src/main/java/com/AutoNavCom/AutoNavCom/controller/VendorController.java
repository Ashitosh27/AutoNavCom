package com.AutoNavCom.AutoNavCom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;

@RestController
@RequestMapping("/vendor")
public class VendorController {
	
	@GetMapping("/vendorname")
	public String getVendorName(Model model) {
		return "AC Vedor";
	}
	

}
