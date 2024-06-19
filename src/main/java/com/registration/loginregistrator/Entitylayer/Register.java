package com.registration.loginregistrator.Entitylayer;

import java.util.Optional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Register {


	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
	private Long No;
	
	@Column(name="user_name",nullable=false,unique=true)  
	private String username;
	
	@Column(name="password",nullable=false,unique=true)
	private String password;
	
	@Column(name="email",nullable=false,unique=true)
	private String email;
	
	@Column(name="gender",nullable=false)
	private String gender;
	
	@Column(name="phone_number",unique=true)
	private Long phonenumber;

	public Long getNo() {
		return No;
	}

	public void setNo(Long no) {
		No = no;
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

	public Register(Long no, String username, String password, String email, String gender, Long phonenumber) {
		super();
		No = no;
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.phonenumber = phonenumber;
	}

	public Register() {
		super();
	}


	
	
	
	
}
