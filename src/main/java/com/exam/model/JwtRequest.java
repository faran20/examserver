package com.exam.model;

public class JwtRequest {
	private String userName;
	private String passaword;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassaword() {
		return passaword;
	}

	public void setPassaword(String passaword) {
		this.passaword = passaword;
	}

	public JwtRequest(String userName, String passaword) {
		super();
		this.userName = userName;
		this.passaword = passaword;
	}

	public JwtRequest() {
	}

}
