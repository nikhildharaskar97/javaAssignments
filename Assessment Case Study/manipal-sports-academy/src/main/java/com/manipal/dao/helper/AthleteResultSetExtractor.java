package com.manipal.dao.helper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.manipal.modal.Athlete;



public class AthleteResultSetExtractor implements ResultSetExtractor<List<Athlete>>{

	
	public List<Athlete> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Athlete> athleteList = new ArrayList<>();
		rs.next();
		while(rs.next()) {
			Athlete athlete = new Athlete();
			athlete.setId(rs.getInt(1));
			athlete.setName(rs.getString(2));
			athlete.setGender(rs.getString(3));
			athlete.setCategory(rs.getString(4));
			athlete.setEmail(rs.getString(5));
			athlete.setMobile(rs.getLong(6));
			athleteList.add(athlete);
			}
		
		return athleteList;
	}
}
