package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "userdetails")
@Table(name="userdetails")
public class User {
	@Id
	private String userid;
	private String name;
	private String phone;
	private String address;
	private String pass;
	private int pincode;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userid, String name, String phone, String address, String pass, int pincode) {
		super();
		this.userid = userid;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.pass = pass;
		this.pincode = pincode;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
		
}
