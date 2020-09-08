package com.manipal.dao;

import java.util.List;

import com.manipal.modal.Athlete;

public interface IAthleteDAO{

	public int addAthlete(Athlete athlete) ;
	public List<Athlete> getAllAthletes() ;
}
