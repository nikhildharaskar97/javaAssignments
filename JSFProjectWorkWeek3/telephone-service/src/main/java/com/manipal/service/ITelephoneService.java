package com.manipal.service;

import java.util.List;

import com.manipal.model.Telephone;

public interface ITelephoneService {
	
	public void addOrUpdateTelephone(Telephone telephone);

	public List<Telephone> getAllTelephones();

	public Telephone getTelephoneById(int id);

	public void deleteTelephone(int telephoneId);

	public Telephone getTelephoneByCustomerId(int customerId);

	//POST /telephone -save telephone details  
		//GET /telephone -get all telephone details 
		
		//GET /telephone/{telephoneId} -get details of the telephone 
		
		//PUT /telephone -update telephone 
		
		//DELETE /telephone/{telephoneId} -delete specified telephone details, when not found TelephoneNotFoundException
	
	
}
