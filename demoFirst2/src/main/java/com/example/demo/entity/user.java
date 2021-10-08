package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class user {
	@Id
	private String username;
	private String password;
	private String address;
	private String phoneNumber;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public user(String username, String password, String address, String phoneNumber) {
		super();
		this.username = username;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "user [username=" + username + ", password=" + password + ", address=" + address + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
	
}
