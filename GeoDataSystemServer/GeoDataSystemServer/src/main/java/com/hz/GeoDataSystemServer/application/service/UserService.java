package com.hz.GeoDataSystemServer.application.service;

import java.util.List;

import com.hz.GeoDataSystemServer.model.User;


public interface UserService {
	
	 List<User> listAll();
	 
	 int insert(User user);
}
