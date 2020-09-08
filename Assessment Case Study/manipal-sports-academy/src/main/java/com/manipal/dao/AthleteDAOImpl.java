package com.manipal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manipal.dao.helper.AthleteResultSetExtractor;
import com.manipal.modal.Athlete;



public class AthleteDAOImpl implements IAthleteDAO{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int addAthlete(Athlete athlete) {
        String query = "INSERT INTO athlete(athlete_name,athlete_gender,category,athlete_email,athlete_mobile) VALUES(?,?,?,?,?)";
		int status = jdbcTemplate.update(query, athlete.getName(),athlete.getGender(),athlete.getCategory(),athlete.getEmail(),athlete.getMobile());
		return status;		
	}

	public List<Athlete> getAllAthletes() {
		String sql = "SELECT * FROM athlete";
		List<Athlete> athleteList = jdbcTemplate.query(sql, new AthleteResultSetExtractor());
		return athleteList;
}

	
	
	
	
	
	
}
