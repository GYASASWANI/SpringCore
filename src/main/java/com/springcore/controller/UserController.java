package com.springcore.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springcore.service.UserService;
import com.springcore.vo.UserVO;

@Controller // to create object
public class UserController {
	@Autowired
	private UserService userservice;//setter injection
	
	//we can use either setter or constructor injection
	public UserController(UserService userservice) {// constructor injection
		super();
		System.out.println("UserController constructor--------");
		this.userservice = userservice;
	}
	
	public int addUser(UserVO uservo) {
		return userservice.addUser(uservo);
	}
	public int removeUser(int userId) {
		
		return userservice.removeUser(userId);
	}
	public int updateUser(UserVO uservo) {
		return userservice.updateUser(uservo);
	}
	public UserVO getUser(int userId) {
		return userservice.getUser(userId);
	}
	public Set<UserVO> getAllUsers() {
		return userservice.getAllUsers();
	}

	




}
