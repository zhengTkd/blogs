package com.blogs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogs.bean.User;
import com.blogs.dao.UserMapper;

@Service
public class TestService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User getUser() {
		return userMapper.selectByPrimaryKey(1);
	}
}
