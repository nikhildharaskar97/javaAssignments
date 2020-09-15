package com.manipal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.demo.model.Capital;
import com.manipal.repository.ICapitalRepository;



@Service
public class CapitalService implements ICapitalService{

	@Autowired
	private ICapitalRepository repository;
	
	
	@Override
	public Capital getCapitalByZipcode(String zipcode) {
		// TODO Auto-generated method stub
		return repository.findById(zipcode).orElse(null);
	}


	@Override
	public void addOrUpdatecapital(Capital capital) {
		// TODO Auto-generated method stub
		repository.save(capital);
		
	}


	@Override
	public Capital getCapitalByCountryCode(String countrycode) {
		// TODO Auto-generated method stub
		return repository.findByCountryCode(countrycode);
	}

}
