package com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.restaurant.model.CustomerInfo;
import com.restaurant.service.ICustomerService;

@Controller

public class CustomerController {
	@Autowired
	private ICustomerService service;

	@GetMapping("/list")
	public String showCustomerList(Model model) {
		return "";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {

		CustomerInfo customer = new CustomerInfo();
		model.addAttribute("customer", customer);
		return "customer-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") CustomerInfo customer) {

		service.saveCustomer(customer);
		return "customer-form";
}

@RequestMapping(value = "/deleteCustomer", method = { RequestMethod.GET, RequestMethod.POST })
public String deleteCustomer(@RequestParam("id") int id) {
	service.deleteCustomer(id);
	return "delete";
}
}
