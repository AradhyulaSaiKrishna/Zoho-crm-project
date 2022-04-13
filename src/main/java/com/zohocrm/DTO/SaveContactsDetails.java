package com.zohocrm.DTO;

public class SaveContactsDetails {

	private long id;
	private String firstName;
	private String lastName;
	private String company;
	private String email;
	private String mobile;
	private String leadSouce;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLeadSouce() {
		return leadSouce;
	}
	public void setLeadSouce(String leadSouce) {
		this.leadSouce = leadSouce;
	}
	
}
