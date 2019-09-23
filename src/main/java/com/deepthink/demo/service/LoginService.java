package com.deepthink.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepthink.demo.model.User;
import com.deepthink.demo.mapper.UserMapper;

@Service("LoginService")
public class LoginService {
	
	@Autowired
	private UserMapper UserMapper  ;
	
	
	public User querybyUserId(Long id) {
	User  id1 = UserMapper.selectByPrimaryKey(id);
		if (id1 == null) {
			System.out.println("id1  is null");
		}
		return id1;
	}
}
