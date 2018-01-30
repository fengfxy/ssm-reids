package com.fxy.room.service.Imp;

import static org.junit.Assert.*;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fxy.room.entity.RoomUser;
import com.fxy.room.service.UserService;
public class UserServiceImpTest {

	@Resource
	private UserService userService;
	
	@Before
	public void before() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring-source.xml"});
		userService = (UserService) context.getBean("userService");
		//不用@Resource，而用@Autowired时,也可采用下面这种getBean方式
//		userService = (UserService) context.getBean("userServiceImpl");
	}
	
	@Test
	public void testRemove() {
		userService.remove(0);
	}

	@Test
	public void testAdd() {
		RoomUser user=new RoomUser();
		user.setName("测试");
		user.setCreatTime(new Date());
		user.setLastTime(new Date());
		System.out.println(user.toString());
		userService.add(user);
	}

	@Test
	public void testFindByID() {
		System.out.println(userService);
		RoomUser findByID = userService.findByID(0);
		System.out.println(findByID.toString());
	}

	@Test
	public void testEdit() {
		fail("Not yet implemented");
	}

}
