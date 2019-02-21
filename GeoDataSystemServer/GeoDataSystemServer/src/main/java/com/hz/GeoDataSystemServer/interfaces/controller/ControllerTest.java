package com.hz.GeoDataSystemServer.interfaces.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hz.GeoDataSystemServer.application.impl.UserServiceImpl;
import com.hz.GeoDataSystemServer.model.User;


@Api(tags = "测试用例")
@RestController
@RequestMapping(value="/users") // 通过这里配置使下面的映射都在/users下，可去除
public class ControllerTest {
	//@Autowired
	UserServiceImpl userServiceImpl;
		
	 @ApiOperation(value="获取用户列表", notes="notes")
	 @RequestMapping(value={"getUserList"}, method= RequestMethod.GET)
	 public List<User> getUserList() {		 
	 return userServiceImpl.listAll();
	 }
}