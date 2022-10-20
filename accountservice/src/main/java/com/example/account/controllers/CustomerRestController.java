package com.example.account.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.account.entity.Customer;
import com.example.account.service.CustomerService;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/api/customer")
	
	public Customer createCustomer(@RequestBody Customer cus){
		return customerService.createCustomer(cus);
	}
	@PutMapping("/api/customer")
	public Customer updateCustomer(@RequestBody Customer cus){
		return customerService.updateCustomer(cus);
	}
	@GetMapping("/api/customer/{id}")
	public Customer getCustomerById(Long id){
		return customerService.getCustomer(id);
	}
	@GetMapping("/api/customer")
	public List<Customer> getCustomers(){
		return customerService.getAllCustomers();
	}
}
