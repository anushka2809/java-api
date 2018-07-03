package com.mycompany.javaapi.resources;

//import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
//import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
import javax.ws.rs.PathParam;

import com.mycompany.javaapi.model.CompanyProfile;
import com.mycompany.javaapi.services.CompanyServices;


@Path("/email")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ApiTester {
	
	CompanyServices companyService = new CompanyServices();
	
	@GET
	public List<CompanyProfile> getCompanies() {
		return companyService.getAllCompanies();
	}
	
	@GET
	@Path("/{id}")
	public CompanyProfile input(@PathParam("id")String id) {
	int at  = id.indexOf('@');
	int dot = id.indexOf('.',at);
	String company = id.substring(at+1,dot);
	System.out.println(company);
	
	//URI uri;
	//return Response.seeOther(uri).build();
	return companyService.getCompanyProfile(company);
	}
	
	@POST
	public CompanyProfile addCompanyProfile(CompanyProfile profile) {
		return companyService.addCompanyProfile(profile);
	}
		
	@PUT
	@Path("/{id}")
	public CompanyProfile updateCompanyProfile(@PathParam("id") String profileName, CompanyProfile profile) {
		profile.setCompanyname(profileName);
		return companyService.updateCompanyProfile(profile);
	}
	
	@DELETE
	@Path("/{profileName}")
	public void deleteProfile(@PathParam("profileName") String profileName) {
		companyService.removeCompanyProfile(profileName);
	}
	
}
