package com.hz.GeoDataSystemServer.application.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hz.GeoDataSystemServer.application.service.UserService;
import com.hz.GeoDataSystemServer.dao.UserMapper;
import com.hz.GeoDataSystemServer.model.User;


//@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

	@Override
	public List<User> listAll() {
		return userMapper.listAll();
	}
	@Override
	public int insert(User user) {
		return userMapper.insert(user);
	}
}
