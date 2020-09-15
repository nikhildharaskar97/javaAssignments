package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.demo.model.Customer;
import com.manipal.demo.model.Telephone;
import com.manipal.exceptionpack.CustomerNotFoundException;
import com.manipal.proxy.TelephoneProxy;
import com.manipal.service.ICustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private ICustomerService customerService;
	
	@Autowired
	TelephoneProxy proxy;
	
	@PostMapping("savecustomer")
	public String saveCustomer (@RequestBody Customer customer) {
		//System.out.println(customer);
		customerService.addOrUpdateCustomer(customer);
		return "Customer added sucessfully";
	}
	
	@GetMapping
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
		
	}
	
	@GetMapping("{customerId}")
	public Customer getCustomer(@PathVariable int customerId) {
		Customer customer = customerService.getCustomer(customerId);
		if(customer == null) {
			throw new CustomerNotFoundException("Customer with entered is not there!");
		}
		return customer;
	}
	
	@PutMapping("updateCustomer")
	public String updateCustomer(@RequestBody Customer customer) {
		customerService.addOrUpdateCustomer(customer);
		return "Customer Updated successfully";
	}
	
	@DeleteMapping("{customerId}")
	public String deleteCustomer(@PathVariable int customerId) {
		Customer customer = customerService.getCustomer(customerId);
		if(customer == null) {
			throw new CustomerNotFoundException("Customer with entered is not there!");
		}
		else {
			customerService.deleteCustomerById(customerId);
			return "deleted successfully";
		}
	}

	
	@GetMapping("{customerId}/telephone")
	public Telephone getTelephone(@PathVariable int customerId) {
		Telephone telephone = proxy.retriveTelephone(customerId);
		return telephone;
		//return proxy.retriveCapital(countrycode);
	}
	/*
	

	GET / customer -get all customers 
	GET /customer/{customerId} -get specified customer 
	PUT /customer -update customer 
	DELETE /customer/{customerId} -delete specified customer, when not found throw CustomerNotFoundException. 
	GET /customer/{customerid}/telephone/ -display customer's telephone details. 
	*/
}
