package com.manipal.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.demo.model.Telephone;



@FeignClient(name="telephone-service")
public interface TelephoneProxy {

	@GetMapping("{customerId}/telephone")
	public Telephone retriveTelephone(@PathVariable int customerId) ;
}
