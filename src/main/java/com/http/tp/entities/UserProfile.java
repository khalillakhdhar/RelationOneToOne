package com.http.tp.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity

public class UserProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Size(max=15)
	private String phoneNumber;
	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private Gender gender;
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Size(max=100)
	private String adress1;
	@Size(max=100)
	private String adress2;
	@Size(max=100)
	private String street;
	@Size(max=100)
	private String city;
	@Size(max=100)
	private String state;
	@Size(max=100)
	private String country;
	@Size(max=32)
	private String zipcode;
	
	@OneToOne(fetch=FetchType.LAZY,optional = false)
	@JoinColumn(name = "user_id",nullable = false)
	
	private User user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAdress1() {
		return adress1;
	}

	public void setAdress1(String adress1) {
		this.adress1 = adress1;
	}

	public String getAdress2() {
		return adress2;
	}

	public void setAdress2(String adress2) {
		this.adress2 = adress2;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	public UserProfile(long id, @Size(max = 15) String phoneNumber, Gender gender, Date dob,
			@Size(max = 100) String adress1, @Size(max = 100) String adress2, @Size(max = 100) String street,
			@Size(max = 100) String city, @Size(max = 100) String state, @Size(max = 100) String country,
			@Size(max = 32) String zipcode, User user) {
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.dob = dob;
		this.adress1 = adress1;
		this.adress2 = adress2;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.user = user;
	}

	public UserProfile() {
	}
	
	
	
	
	
	
	
}
