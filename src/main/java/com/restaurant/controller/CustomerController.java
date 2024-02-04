package com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.restaurant.service.ICustomerService;

@Controller
public class CustomerController {
	@Autowired
	private ICustomerService service;

	@PostMapping("/Register")
	public String insertCustomerDetails() {

		return "customerlist";

	}

}
