package com.mycompany.javaapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.mycompany.javaapi.database.CompanyDatabase;
import com.mycompany.javaapi.model.CompanyProfile;

public class CompanyServices {

	private Map<String, CompanyProfile> companyname = CompanyDatabase.getCompany();
	
	public CompanyServices () {
		companyname.put("hsc", new CompanyProfile(1, "hsc", "http://localhost:8080/warredirect2/NewFile2.html"));
		companyname.put("ms", new CompanyProfile(2, "ms", "http://localhost:8080/createwarfile2/NewFile3.html"));
	}
	
	public  List<CompanyProfile> getAllCompanies() {
		return new ArrayList<CompanyProfile>(companyname.values()); 
	}
	
	public CompanyProfile getCompanyProfile(String Companyname) {
		return companyname.get(Companyname);
	}
	
	public CompanyProfile addCompanyProfile(CompanyProfile companyprofile) {
		companyprofile.setId(companyname.size() + 1);
		companyname.put(companyprofile.getCompanyname(),companyprofile);
		return companyprofile;
	}
	
	public CompanyProfile updateCompanyProfile(CompanyProfile companyprofile) {
		if (companyprofile.getCompanyname().isEmpty()) {
			return null;
		}
		companyname.put(companyprofile.getCompanyname(), companyprofile);
		return companyprofile;
	}
	
	public CompanyProfile removeCompanyProfile(String companyprofile) {
		return companyname.remove(companyprofile);
	}
}
