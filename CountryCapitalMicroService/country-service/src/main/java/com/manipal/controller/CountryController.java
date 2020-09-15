package com.manipal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.demo.model.Capital;
import com.manipal.demo.model.Country;
import com.manipal.proxy.CapitalProxy;
import com.manipal.service.ICountryService;


@RestController
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	CapitalProxy proxy;
	
	@Autowired
	private ICountryService countryService;

	@GetMapping("{countrycode}/capital")
	public Capital getCapital(@PathVariable String countrycode) {
		return proxy.retriveCapital(countrycode);
	}
	
	@PostMapping("savecountry")
	public String saveCountryDetails (@RequestBody Country country) {
		System.out.println(country);
		countryService.addOrUpdateCountry(country);
		return "country Added sucessfully";
	}
}
