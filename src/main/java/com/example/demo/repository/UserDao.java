package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {

	User findByUserid(String userid);

	User findByUseridAndPass(String userid, String pass);

	@Transactional
	@Modifying
	@Query ("update userdetails as ud set ud.pass= ?2 Where ud.userid = ?1")
	public void updatePass(String userid, String pass);

}
