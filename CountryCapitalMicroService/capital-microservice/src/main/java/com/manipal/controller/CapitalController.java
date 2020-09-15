package com.manipal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.demo.model.Capital;
import com.manipal.exceptionpack.CapitalNotFoundException;

import com.manipal.service.ICapitalService;



@RestController
public class CapitalController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private ICapitalService capitalService;
	
	
	@GetMapping("{countrycode}/capital")
	public Capital getCapital(@PathVariable String countrycode) {
		Capital capital = capitalService.getCapitalByCountryCode(countrycode);
		if(capital==null) {
			throw new CapitalNotFoundException("Country-code id is invalid, Please enter correct contry-code.");
		}
		return capital;
	}
	
	
	@GetMapping("capital/{zipcode}")
	public Capital getCapitalById(@PathVariable String zipcode) {
		
		Capital capital = capitalService.getCapitalByZipcode(zipcode);
		
		if(capital!=null) {
			capital.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
			
			capitalService.addOrUpdatecapital(capital);
		}
		else {
			throw new CapitalNotFoundException("Capital id is invalid, Please enter correct zipcode.");
		}
		
		
		
		return capital;
	}
	
}
