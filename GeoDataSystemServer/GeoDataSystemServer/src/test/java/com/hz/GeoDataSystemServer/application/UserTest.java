package com.hz.GeoDataSystemServer.application;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.hz.GeoDataSystemServer.application.service.UserService;
import com.hz.GeoDataSystemServer.model.User;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//@MapperScan(basePackages ="com.hz.GeoDataSystemServer.dao")
//@PropertySource("classpath:config/dataSourceConfig.properties")//配置文件路径 
public class UserTest {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;
	@Test
	public void userTest(){
		List<User> users =userService.listAll();
		for(int i=0;i<users.size();i++){
			logger.info("userId:"+users.get(i).getUserid()+" userName:"+users.get(i).getUsername());
		}
	}
}
