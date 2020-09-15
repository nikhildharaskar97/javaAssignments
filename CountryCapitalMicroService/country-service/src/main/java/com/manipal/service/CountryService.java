package com.manipal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.demo.model.Country;
import com.manipal.repository.ICountryRepository;

@Service
public class CountryService implements ICountryService {

	@Autowired
	private ICountryRepository repository;
	
	@Override
	public void addOrUpdateCountry(Country country) {
		// TODO Auto-generated method stub
		repository.save(country);
		
	}

	

}
