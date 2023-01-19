package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Cart;
import com.example.demo.entities.Order;
import com.example.demo.repository.OrderDao;

@Service
@Transactional
public class OrderService {

	@Autowired
	private OrderDao orderdao;

	public Order addData(Order order) {
		// TODO Auto-generated method stub
		return orderdao.save(order);
	}
	public List<Order> viewCart() {
		// TODO Auto-generated method stub
		return orderdao.findAll();
	}
	public List<Order> getByUserId(String userid) {
		// TODO Auto-generated method stub
		return orderdao.findByUserid(userid);
	}
	public Order getOrder(int orderid) {
		// TODO Auto-generated method stub
		return orderdao.findByOrderid(orderid);
	}
}
