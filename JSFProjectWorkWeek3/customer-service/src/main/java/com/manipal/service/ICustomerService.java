package com.manipal.service;

import java.util.List;

import com.manipal.demo.model.Customer;

public interface ICustomerService {

	public void addOrUpdateCustomer(Customer customer);

	public List<Customer> getAllCustomers();

	public Customer getCustomer(int customerId);

	public void deleteCustomerById(int customerId);
}
