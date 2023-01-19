package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="temporary")
public class Temp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tempid;
	private int cartid;
	private String userid;
	private String productid;
	private String productname;
	private String productdesc;
	private int qty;
	private int price;
	private String date;
	private String type;
	public Temp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Temp(int tempid, int cartid, String userid, String productid, String productname, String productdesc,
			int qty, int price, String date, String type) {
		super();
		this.tempid = tempid;
		this.cartid = cartid;
		this.userid = userid;
		this.productid = productid;
		this.productname = productname;
		this.productdesc = productdesc;
		this.qty = qty;
		this.price = price;
		this.date = date;
		this.type = type;
	}
	public int getTempid() {
		return tempid;
	}
	public void setTempid(int tempid) {
		this.tempid = tempid;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdesc() {
		return productdesc;
	}
	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
}
