package com.springcore.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.springcore.vo.UserVO;

@Service
public interface UserService {
	public int addUser(UserVO uservo) ;
	public int removeUser(int userId) ;
	public int updateUser(UserVO uservo);
	public UserVO getUser(int userId);
	public Set<UserVO> getAllUsers() ;
}
