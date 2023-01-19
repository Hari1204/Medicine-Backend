package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.User;
import com.example.demo.repository.UserDao;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserDao userdao;
	public User saveUsers(User user) {
		return userdao.save(user);		
	}
	public User fetchuserByUserid(String userid) {
		// TODO Auto-generated method stub
		return userdao.findByUserid(userid);
	}
	public User fetchByUserandPass(String userid, String pass) {
		// TODO Auto-generated method stub
		return userdao.findByUseridAndPass(userid,pass);
	}
	public User updatereg(User user) {
		// TODO Auto-generated method stub
		return userdao.save(user);
	}

}