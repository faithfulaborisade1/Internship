package com.linkedin.employees;
//damian
public class Employees {
	private String id;
	private String first_name;
	private String last_name;
	private String username;
	private String passwrd;
	private String address;
	private String contact;
	
	public Employees(String first_name, String last_name, String username, String passwrd, String address, String contact) throws EmployeesExceptionHandler{
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.passwrd = passwrd;
		this.address = address;
		this.contact = contact;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswrd() {
		return passwrd;
	}
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}	
}
