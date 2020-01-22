package com.api.pastelwebservices.model;

public class UserCredential {
	
	private String email;
	private String password;
	private String responseCaptcha;
	
	
	public UserCredential() {
	}

	


	@Override
	public String toString() {
		return "UserCredential [email=" + email + ", password=" + password + ", responseCaptcha=" + responseCaptcha
				+ "]";
	}




	public UserCredential(String email, String password, String responseCaptcha) {
		this.email = email;
		this.password = password;
		this.responseCaptcha = responseCaptcha;
	}




	public String getResponseCaptcha() {
		return responseCaptcha;
	}




	public void setResponseCaptcha(String responseCaptcha) {
		this.responseCaptcha = responseCaptcha;
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
