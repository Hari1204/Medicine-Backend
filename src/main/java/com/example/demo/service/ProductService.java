package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Product;
import com.example.demo.repository.ProductDao;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductDao productdao;

	public Product addproduct(Product product) {
		// TODO Auto-generated method stub
		return productdao.save(product);
	}
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productdao.findAll();
	}
	public List<Product> getByProduct(String type) {
		// TODO Auto-generated method stub
		return productdao.getByType(type);
	}
	
}
