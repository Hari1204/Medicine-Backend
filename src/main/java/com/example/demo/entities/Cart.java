package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="cart")
@Table(name="cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartid;
	private String productid;
	private String userid;
	private String productname;
	private String productdesc;
	private String type;
	private String pic;
	private int price;
	private int qty;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int cartid, String productid, String userid, String productname, String productdesc, String type,
			String pic, int price, int qty) {
		super();
		this.cartid = cartid;
		this.productid = productid;
		this.userid = userid;
		this.productname = productname;
		this.productdesc = productdesc;
		this.type = type;
		this.pic = pic;
		this.price = price;
		this.qty = qty;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}
