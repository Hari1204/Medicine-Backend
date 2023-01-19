
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Order;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderservice;
	
	@CrossOrigin(origins="http://localhost:4200/")
	@PostMapping("Order/add")
	public Order add(@RequestBody Order order) {
		return orderservice.addData(order);		
	}
	@CrossOrigin(origins="http://localhost:4200/")
	@GetMapping("Order/viewall")
	public List<Order> viewall() {
		return orderservice.viewCart();
		
	}
	 @CrossOrigin(origins="http://localhost:4200/")
	  @GetMapping("vieworder/{userid}")
	   public List<Order>  getById(@PathVariable ("userid") String userid) {
		return orderservice.getByUserId(userid);
	}
	 @CrossOrigin(origins="http://localhost:4200/")
		@GetMapping("Order/view/{orderid}")
		public Order view(@PathVariable ("orderid") int orderid) {
			return orderservice.getOrder(orderid);	
		}
}
