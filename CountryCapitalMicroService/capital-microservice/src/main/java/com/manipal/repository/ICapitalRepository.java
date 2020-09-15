package com.manipal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.demo.model.Capital;

@Repository
public interface ICapitalRepository  extends JpaRepository<Capital, String>{
	Capital findByCountryCode(String countrycode);
	
}


/*package com.manipal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.modal.Movie;


@Repository
public interface IMovieRepository extends JpaRepository<Movie, Integer>{//Integer is primary key here
	Movie findByTitle(String title);
	Movie findByLeadRole(String leadRole);
	
}*/