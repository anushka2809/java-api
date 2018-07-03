package com.mycompany.javaapi.database;


import java.util.HashMap;
import java.util.Map;
import com.mycompany.javaapi.model.CompanyProfile;


public class CompanyDatabase {


	private static Map<String, CompanyProfile> companyname = new HashMap<>();
	

	
	public static Map<String, CompanyProfile> getCompany() {
		return companyname;
	}
	

}
