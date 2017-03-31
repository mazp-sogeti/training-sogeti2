package test.spring.sogeti.models;

import java.util.LinkedHashMap;

public class Student {
	
	String firstName;
	String lastName;
	String country;
	String favoriteLenguage;
	String [] operatingSystem;
	
	public String getFavoriteLenguage() {
		return favoriteLenguage;
	}

	public void setFavoriteLenguage(String favoriteLenguage) {
		this.favoriteLenguage = favoriteLenguage;
	}

	private LinkedHashMap<String, String> countryOptions;
	
	public String getCountry() {
		return country;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student (){
		
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("SP", "Spain");
		countryOptions.put("HD", "Honduras");
		countryOptions.put("MRR", "Marroco");
		
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
