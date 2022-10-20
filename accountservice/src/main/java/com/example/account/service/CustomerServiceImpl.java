package com.example.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.account.entity.Customer;
import com.example.account.repo.CustomerRepository;

@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Customer createCustomer(Customer ac) {
		// TODO Auto-generated method stub
		return customerRepository.save(ac) ;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Customer updateCustomer(Customer ac) {
		// TODO Auto-generated method stub
		return customerRepository.save(ac);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Customer getCustomer(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id).get();
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}
	
}
