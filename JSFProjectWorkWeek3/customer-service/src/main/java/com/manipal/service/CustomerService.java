package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.demo.model.Customer;
import com.manipal.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService {

	
	@Autowired
	private ICustomerRepository repository;
	
	@Override
	public void addOrUpdateCustomer(Customer customer) {
		repository.save(customer);

	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return repository.findAll();
	}

	@Override
	public Customer getCustomer(int customerId) {
		return repository.findById(customerId).orElse(null);
		
	}

	@Override
	public void deleteCustomerById(int customerId) {
		repository.deleteById(customerId);
		
	}

}
