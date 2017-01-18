package it.codin.course.model;

import java.util.UUID;

public class Customer {
	private final String id;
	private final String firstname;
	private final String lastname;
	private String email;
	
	public Customer(String firstname, String lastname, String email) {
		super();
		
		this.id = UUID.randomUUID().toString();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	
	public String getId() {		
		return this.id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
	
	public String toString() {
		return String.format("%s %s (%s)", firstname.toUpperCase(), lastname, email);
	}
}





