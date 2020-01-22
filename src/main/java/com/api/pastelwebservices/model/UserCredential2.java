package com.api.pastelwebservices.model;

public class UserCredential2 {
	private String email;
	private String password;
	
	
	public UserCredential2() {
	}
	public UserCredential2(String email, String password) {
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
