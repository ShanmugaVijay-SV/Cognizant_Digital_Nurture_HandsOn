package com.airlines;
import java.util.List;

public class CountryRepo {
	
	static private List<Country> countrylist;
	
	public void setCountrylist(List<Country> countrylist){
		this.countrylist=countrylist;
	}
	
	public List<Country> getCountrylist() {
		return countrylist;
	}
	
}
	