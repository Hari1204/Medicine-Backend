package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productservice;
	@CrossOrigin(origins="http://localhost:4200/")
	@PostMapping("Product/productdata")
	public Product productdata(@RequestBody Product medicine) {
		return productservice.addproduct(medicine);		
	}
	@CrossOrigin(origins="http://localhost:4200/")
	@GetMapping("Product/getproduct")
	public List<Product> getproduct() {
		return productservice.getAllProducts();
	}
	@CrossOrigin(origins="http://localhost:4200/")
	@GetMapping("Product/getProd/{type}")
	public List<Product> getProd(@PathVariable ("type") String type){
		return productservice.getByProduct(type);
	}

}
