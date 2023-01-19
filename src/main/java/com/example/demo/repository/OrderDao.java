package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Order;

public interface OrderDao extends JpaRepository<Order, Integer> {

	List<Order> findByUserid(String userid);

	Order findByOrderid(int orderid);

}
