package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Cart;
import com.example.demo.repository.CartDao;
import com.example.demo.service.CartService;

@RestController
public class CartController {
	@Autowired
	private CartService cartservice;
	
	@Autowired
	private CartDao cartdao;
	
	@CrossOrigin(origins="http://localhost:4200/")
	@PostMapping("Cart/cartdata")
	public Cart cartdata(@RequestBody Cart cart) {
		return cartservice.addCart(cart);		
	}
	@CrossOrigin(origins="http://localhost:4200/")
	@GetMapping("Cart/viewall/{userid}")
	public List<Cart> viewall(@PathVariable ("userid") String userid) {
		return cartservice.getAllCart(userid);	
	}
	
	@CrossOrigin(origins="http://localhost:4200/")
    @PostMapping("Cart/inc")
	public Cart inc(@RequestBody Cart cart) {
		 String val=cart.getProductid();
		 Cart existsData=cartservice.fetchCartByProductid(val);
		if(val!=null && !"".equals(val)) {
			if(existsData!=null) {
				Integer qty=existsData.getQty()+1;
				existsData.setQty(qty);
				return cartservice.addCart(existsData);
			}
	}
		return cartservice.addCart(cart);
    }
	@CrossOrigin(origins="http://localhost:4200/")
    @PutMapping("Cart/dec")
	public Cart dec(@RequestBody Cart cart) {
		String val=cart.getProductid();
		Cart existsData=cartservice.fetchCartByProductid(val);
		if(val!=null && !"".equals(val)) {
			if(existsData!=null) {
			Integer qty=existsData.getQty()-1;
			if(qty>0) {
				existsData.setQty(qty);
			}
			return cartservice.addCart(existsData);
			}
		}
		return cart;		
	}
	@CrossOrigin(origins="http://localhost:4200/")
	@DeleteMapping("Cart/{cartid}")
	public void delete(@PathVariable int cartid) {
	    cartservice.deleteFromCart(cartid);		
	}
	@CrossOrigin(origins="http://localhost:4200/")
	@DeleteMapping("Cart/emptycart")
	public void emptycart() {
		 cartservice.emptyCartItem();
		
	}
	@CrossOrigin(origins="http://localhost:4200/")
	@GetMapping("Cart/countrow")
	public long count()
	{
		return cartservice.countItem();
		
	}
	@CrossOrigin(origins="http://localhost:4200/")
	@GetMapping("Cart/Totalqty/{userid}")
	public int Totalqty(@PathVariable ("userid") String userid)
	{
		return cartdao.sumByQty(userid);
		
	}

}
