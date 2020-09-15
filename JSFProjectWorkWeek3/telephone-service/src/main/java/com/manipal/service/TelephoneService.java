package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.model.Telephone;
import com.manipal.repository.ITelephoneRepository;
import com.manipal.service.ITelephoneService;

@Service
public class TelephoneService implements ITelephoneService {

	@Autowired
	private ITelephoneRepository repository;
	
	@Override
	public void addOrUpdateTelephone(Telephone telephone) {

		repository.save(telephone);
	}

	@Override
	public List<Telephone> getAllTelephones() {
		
		return repository.findAll();
	}

	@Override
	public Telephone getTelephoneById(int id) {
		return  repository.findById(id).orElse(null);
		
	}

	@Override
	public void deleteTelephone(int telephoneId) {
		repository.deleteById(telephoneId);
		
	}

	@Override
	public Telephone getTelephoneByCustomerId(int customerId) {
		
		return repository.getByCustomerId(customerId);
	}

}
