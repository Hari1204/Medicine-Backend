package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import com.example.demo.entities.Cart;
import com.example.demo.repository.CartDao;

@Service
@Transactional
public class CartService {

	@Autowired
	private CartDao cartdao;

	public Cart addCart(Cart cart)  {
		// TODO Auto-generated method stub
		return cartdao.save(cart);
	}
	public Cart fetchCartByProductid(String val) {
		// TODO Auto-generated method stub
		return cartdao.findByProductid(val);
	}
	public List<Cart> getAllCart(String userid) {
		// TODO Auto-generated method stub
		return cartdao.findByUserid(userid);
	}
	public void deleteFromCart(int cartid) {
		// TODO Auto-generated method stub
		cartdao.deleteById(cartid);
	}
	public void emptyCartItem() {
		// TODO Auto-generated method stub
		cartdao.deleteAll();
	}
	public long countItem() {
		// TODO Auto-generated method stub
		return cartdao.count();
	}
	public int sumCartqty(String userid) {
		// TODO Auto-generated method stub
		return cartdao.sumByQty(userid);
	}

}
