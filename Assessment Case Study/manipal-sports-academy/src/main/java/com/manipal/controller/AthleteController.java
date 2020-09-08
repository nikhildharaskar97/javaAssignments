package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manipal.dao.AthleteDAOImpl;
import com.manipal.modal.Athlete;

import com.manipal.service.AthleteServiceImpl;

@Controller
public class AthleteController {
	@Autowired
	AthleteServiceImpl athleteservice;
	
	
	@RequestMapping(value="athleteform")
	public String getForm() {
		return "athleteform";
	}
	
	@RequestMapping(value="/addAthlete", method=RequestMethod.POST)	
	public String addAthleteDetails(@ModelAttribute Athlete athlete) {
		
		
		athleteservice.addAthelete(athlete);
			return "athleteadded";
		
	}
	
	@RequestMapping(value="showAthletes")
	public ModelAndView getAthletes(){
		List<Athlete> athleteList = athleteservice.showAtheletes();
		return new ModelAndView("showAthletes", "athleteList", athleteList);
	}
}
