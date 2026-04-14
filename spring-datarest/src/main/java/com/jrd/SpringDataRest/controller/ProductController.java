package com.jrd.SpringDataRest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@GetMapping("/custom")
	public String custom() {
		return "custom router";
	}
	

}
