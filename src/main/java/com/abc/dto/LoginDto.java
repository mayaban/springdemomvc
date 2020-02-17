package com.abc.dto;

public class LoginDto {

	private String username;
	private String password;

	private String testMe;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTestMe() {
		return testMe;
	}

	public void setTestMe(String testMe) {
		this.testMe = testMe;
	}

	@Override
	public String toString() {
		return "LoginDto [username=" + username + ", password=" + password + "]";
	}

}
