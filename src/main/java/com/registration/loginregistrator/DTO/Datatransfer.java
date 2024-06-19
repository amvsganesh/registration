package com.registration.loginregistrator.DTO;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;

public class Datatransfer {



	private String username;
	

	private String password;
	
	
	private String email;
	

	private String gender;
	
	private Long phonenumber;
	

	

	

	public Datatransfer() {
		super();
	}


	public Datatransfer(String username, String password, String email, String gender, Long phonenumber) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.phonenumber = phonenumber;
	}


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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Long getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}



}
