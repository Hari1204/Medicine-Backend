package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="medicine")
public class Product {
	@Id
	private String productid;
	private String productname;
	private String productdesc;
	private String type;
	private String pic;
	private int price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productid, String productname, String productdesc, String type, String pic, int price) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productdesc = productdesc;
		this.type = type;
		this.pic = pic;
		this.price = price;
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


}
