package com.manipal.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.demo.model.Capital;
import com.manipal.demo.model.Country;


@FeignClient(name="capital-microservice",url="localhost:8004")
public interface CapitalProxy {

	@GetMapping("{countrycode}/capital")
	public Capital retriveCapital(@PathVariable String countrycode) ;
}
