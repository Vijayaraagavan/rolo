package com.example.demo.user;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonView;

public class User {
	private int id;
	@JsonView({View.Public.class})
	private String name;
	@JsonView({View.Public.class})
	private String phoneNo;
	@JsonView(View.Public.class)
	private Date dob;
	
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public User(int id, String name, String phoneNo, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.dob = dob;
	}
	
	
}
