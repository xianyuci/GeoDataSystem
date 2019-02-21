package com.hz.GeoDataSystemServer.dao;

import java.util.List;

import com.hz.GeoDataSystemServer.model.User;

public interface UserMapper{
	
 List<User> listAll();

 int insert(User user);
 
}
