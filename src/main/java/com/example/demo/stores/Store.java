package com.example.demo.stores;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "stores")
@Entity
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(name = "ext_id")
	private Long externalId;
	private Boolean rose;
	private String emailId;
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Column(name = "phone_number")
	private String phoneNo;
	private String displayName;
	private String address;
	private Double latitude;
	private Double longitude;
	private Long accountId;
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime insertedAt;
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime updatedAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Store(Long id, String name, Long externalId, Boolean rose, String emailId, String phoneNo,
			String displayName, String address, Double latitude, Double longitude, Long accountId, LocalDateTime insertedAt,
			LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.externalId = externalId;
		this.rose = rose;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.displayName = displayName;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.accountId = accountId;
		this.insertedAt = insertedAt;
		this.updatedAt = updatedAt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getExternalId() {
		return externalId;
	}
	public void setExternalId(Long externalId) {
		this.externalId = externalId;
	}
	public Boolean getRose() {
		return rose;
	}
	public void setRose(Boolean rose) {
		this.rose = rose;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public LocalDateTime getInsertedAt() {
		return insertedAt;
	}
	public void setInsertedAt(LocalDateTime insertedAt) {
		this.insertedAt = insertedAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}
