package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.manipal.exceptionpack.TelephoneNotFoundException;

import com.manipal.model.Telephone;
import com.manipal.service.ITelephoneService;

@RestController
public class TelephoneController {
	
	@Autowired
	private ITelephoneService telephoneService;

	@PostMapping("telephone/savetelephone")
	public String saveTelephoneDetails (@RequestBody Telephone telephone) {
		System.out.println(telephone);
		telephoneService.addOrUpdateTelephone(telephone);
		return "Telephone Added sucessfully";
	}
	
	@GetMapping("telephone/getalltelephones")
	public List<Telephone> getAllTelephones() {
		
		List<Telephone> telephonelist= null;
		telephonelist=telephoneService.getAllTelephones();
		
		if(telephonelist==null) {
			throw new TelephoneNotFoundException("Telephoness arent there!");
		}
		return  telephonelist;
	}
	
	@GetMapping("telephone/{telephoneId}")
	public Telephone getTelephoneById(@PathVariable int telephoneId) {
		Telephone telephone = telephoneService.getTelephoneById(telephoneId);
		
		if(telephone==null) {
			throw new TelephoneNotFoundException("Telephone id is invalid, Please enter correct id.");
		}
		
		return telephone;
	}
	
	@PutMapping()
	public String updateTelephone(@RequestBody Telephone telephonedetails) {
		Telephone telephone = telephoneService.getTelephoneById(telephonedetails.getTelephoneId());
		
		if(telephone!=null) {
			telephone.setMobileNumber(telephonedetails.getMobileNumber());
			telephone.setTelephoneNumber(telephonedetails.getTelephoneNumber());
			telephoneService.addOrUpdateTelephone(telephone);
		}
		else {
			telephoneService.addOrUpdateTelephone(telephonedetails);
		}
		
		
		
		
		return "Telephone updated successfully";
		
	}
	
	@PostMapping("telephone/delete/{telephoneId}")
	public String deleteMovie(@PathVariable int telephoneId) {
		
		Telephone telephone = telephoneService.getTelephoneById(telephoneId);
		
		if(telephone==null) {
			throw new TelephoneNotFoundException("Telephone with entered id already doesnt exists!");
		}
		
		telephoneService.deleteTelephone(telephoneId);
		return "Telephone deleted successfully";
	}
	
	@GetMapping("{customerId}/telephone")
	public Telephone getTelephoneByCustomerId(@PathVariable int customerId) {
		Telephone t =  telephoneService.getTelephoneByCustomerId(customerId);
		if(t==null) {
			throw new TelephoneNotFoundException("Telephone with entered customerId doesnt exists!");
		}
		return t;
	}
	
	
	//POST /telephone -save telephone details  
	//GET /telephone -get all telephone details 
	
	//GET /telephone/{telephoneId} -get details of the telephone 
	
	//PUT /telephone -update telephone 
	
	//DELETE /telephone/{telephoneId} -delete specified telephone details, when not found TelephoneNotFoundException 
	
	
/*{
    "telephoneId" :1001,
    "telephoneNumber" :2425697,
    "mobileNumber" :9689895549,
}*/

	
}
