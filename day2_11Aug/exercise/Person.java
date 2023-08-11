package com.exercise;

public class Person {

	 private String personName;
	 private String emailId;
	 
	public Person(String personName, String emailId) {
		super();
		this.personName = personName;
		this.emailId = emailId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", emailId=" + emailId + "]";
	}
	
	 
}
