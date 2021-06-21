package com.bridgelab.demo.model;

public class User {
	public String lastName;
	public String firstName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Override
	public String toString() {
		String str = (firstName != null) ? firstName + " ": "";
		str += (lastName != null)? lastName: "";
		return str;
	}



}
