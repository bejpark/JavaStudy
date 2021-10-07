package com.example.postServer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 
{
	"account":"박병제",
	"email":"bejpark@gmail.com",
	"address":"서울 동작구",
	"password":"1004",
	"phone_number":"010-1234-1234"
}
 */
public class PostRequestDto {
	private String account;
	private String email;
	private String address;
	@JsonProperty("phone_number")
	private String phoneNumber; //카멜케이스
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	@Override
	public String toString() {
		return "PostRequestDto [account=" + account + ", email=" + email + ", address=" + address + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
}
