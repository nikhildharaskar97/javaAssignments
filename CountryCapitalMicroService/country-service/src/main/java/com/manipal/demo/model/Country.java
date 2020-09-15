package com.manipal.demo.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="countries")
public class Country {
		
		@Id
		@Column(name="country_code")
		private String countryCode;
		
		@Column(name="country_name")
		private String countryName;
		private Capital capital;
		
		public Country() {}
		public Country(String countryCode, String countryName, Capital capital) {
			super();
			this.countryCode = countryCode;
			this.countryName = countryName;
			this.capital = capital;
		}
		public String getCountryCode() {
			return countryCode;
		}
		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		public Capital getCapital() {
			return capital;
		}
		public void setCapital(Capital capital) {
			this.capital = capital;
		}
		@Override
		public String toString() {
			return "Country [countryCode=" + countryCode + ", countryName=" + countryName + ", capital=" + capital
					+ "]";
		}
		
		
		
}


/*{
		"countryCode":1354,
		"countryName":"India",
		"Capital":{
					"zipcode":12354,
					"name":"mumbai",
					"language":"marathi",
					"population":1234
					"port":1234
}
}*/
		  
 


