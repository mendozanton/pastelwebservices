package com.api.pastelwebservices.model;

public class RecaptchaResponse {
	private boolean success;
	private String hostname;
	private String challenge_ts;
	public RecaptchaResponse() {
	}
	public RecaptchaResponse(boolean success, String hostname, String challenge_ts) {
		this.success = success;
		this.hostname = hostname;
		this.challenge_ts = challenge_ts;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getChallenge_ts() {
		return challenge_ts;
	}
	public void setChallenge_ts(String challenge_ts) {
		this.challenge_ts = challenge_ts;
	}
	
	
}
