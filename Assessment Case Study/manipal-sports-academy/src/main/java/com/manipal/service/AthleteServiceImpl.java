package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.manipal.dao.AthleteDAOImpl;
import com.manipal.modal.Athlete;


public class AthleteServiceImpl implements IAthleteService{
	@Autowired
	AthleteDAOImpl athleteDao;

	public void addAthelete(Athlete athlete) {
		athleteDao.addAthlete(athlete);		
		
	}

	public List<Athlete> showAtheletes() {
		
		return athleteDao.getAllAthletes();
	}

	
	

	
	

	
	
}
