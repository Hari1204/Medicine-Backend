package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	List<Product> getByType(String type);

}
