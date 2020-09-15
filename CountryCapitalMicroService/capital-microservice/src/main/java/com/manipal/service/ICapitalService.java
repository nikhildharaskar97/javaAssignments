package com.manipal.service;

import com.manipal.demo.model.Capital;

public interface ICapitalService {
	public Capital getCapitalByZipcode(String zipcode);

	public void addOrUpdatecapital(Capital capital);

	public Capital getCapitalByCountryCode(String countrycode);
}
