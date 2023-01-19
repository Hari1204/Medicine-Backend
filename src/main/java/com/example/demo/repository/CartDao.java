package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Cart;

public interface CartDao extends JpaRepository<Cart, Integer> {

	Cart findByProductid(String val);

	List <Cart> findByUserid(String userid);

	@Query("select sum(ct.qty) from cart as ct where userid = ?1")
	public int sumByQty(String userid);

}
