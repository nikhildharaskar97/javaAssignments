package com.manipal.demo.model;

import javax.persistence.Embeddable;

@Embeddable
public class Capital {

	private String zipcode;
	private String name;
	private String language;
	private Long population;
	
	private int port;
	
	public Capital() {}
	
	
	public Capital(String zipcode, String name, String language, Long population, int port) {
		super();
		this.zipcode = zipcode;
		this.name = name;
		this.language = language;
		this.population = population;
		this.port = port;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}


	@Override
	public String toString() {
		return "Capital [zipcode=" + zipcode + ", name=" + name + ", language=" + language + ", population="
				+ population + ", port=" + port + "]";
	}
	
	
}
