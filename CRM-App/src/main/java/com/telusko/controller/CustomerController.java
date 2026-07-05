package com.telusko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.telusko.entity.Customer;
import com.telusko.service.ICustomerService;


@Controller
public class CustomerController {
	
	private ICustomerService service;

	@Autowired
	public void setService(ICustomerService service) {
		this.service = service;
	}
	
	
	@GetMapping("/customerlist")
	public String getAllCustomer(Model model) {
			List<Customer> customers=service.getAllCustomer();
			model.addAttribute("customers", customers);
		return "customerlist";
	}
	
	@GetMapping("/showform")
	public String showForm(@ModelAttribute("customer") Customer customer) {	
			return "customerform";
	}
	
	
	@PostMapping("/saveCustomer")
	public String registerCustomer(@ModelAttribute("customer") Customer customer) {
			service.registerCustomer(customer);
			return "redirect:/customerlist";
	}
	
//	@GetMapping("/deleteCustomer/{id}")
//	public String deleteCustomer(@PathVariable("id") Integer id) {
//		service.deleteCustomerById(id);
//		return "redirect:/customerlist";
//	}
	
	@PostMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId") Integer id) {
		service.deleteCustomerById(id);
		return "redirect:/customerlist";
	}
	
	@GetMapping("/updateCustomer")
	public String updateCustomer(@ModelAttribute("customer") Customer customer) {
		return "updateform";
	}
	
	@GetMapping("/searchCustomer")
	public String searchCustomer(@RequestParam(required = false) String name, @RequestParam(required = false) String designation, Model model ) {
		List<Customer> customers=service.searchCustomer(name, designation);
		model.addAttribute("customers",customers);
		return "customerlist";
	}

}
