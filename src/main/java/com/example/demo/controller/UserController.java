package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.repository.UserDao;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userservice;
	@Autowired
	private UserDao userdao;
	
	@CrossOrigin(origins="http://localhost:4200/")
	@PostMapping("User/register")
	public User register(@RequestBody User user) throws Exception {
		String userid =user.getUserid();
		if(userid!=null&&!"".equals(userid)) {
			User userobj = userservice.fetchuserByUserid(userid);
			if(userobj!=null) {
				throw new Exception("User with "+userid+" already exists");
			}
		}
		return userservice.saveUsers(user);		
	}

	@CrossOrigin(origins="http://localhost:4200/")
	@PutMapping("User/register/updatePass")
	public void update(@RequestBody User userdetails)
	{	
		String user = userdetails.getUserid();
		String pass = userdetails.getPass();
		System.out.println("User id: "+user+" Pass: "+pass);
		userdao.updatePass(user, pass);
	}
	
	@CrossOrigin(origins="http://localhost:4200/")
	@PostMapping("User/App/login")
	public User login(@RequestBody User user) throws Exception {
		String userid=user.getUserid();
		String pass=user.getPass();
		User userobj=null;
		if(userid!=null&&pass!=null) {
			userobj=userservice.fetchByUserandPass(userid,pass);
		}
		if(userobj==null) {
			throw new Exception("The Credentials you entered does not match");
		}
		return userobj;
	}
}
