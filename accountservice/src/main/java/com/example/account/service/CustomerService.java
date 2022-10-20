package com.example.account.service;

import java.util.List;

import com.example.account.entity.Customer;

public interface CustomerService {
	Customer createCustomer(Customer ac);

	Customer updateCustomer(Customer ac);

	Customer getCustomer(Long id);

	List<Customer> getAllCustomers();

}