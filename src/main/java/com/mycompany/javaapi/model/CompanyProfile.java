package com.mycompany.javaapi.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CompanyProfile {

	private long id;
	private String Companyname;
	private String link;
	
	public CompanyProfile() {
		
	}
	
	public CompanyProfile(long id, String Companyname, String link) {
		this.id = id;
		this.Companyname = Companyname;
		this.link = link;
	}
		
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCompanyname() {
		return Companyname;
	}
	public void setCompanyname(String companyname) {
		Companyname = companyname;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
}
