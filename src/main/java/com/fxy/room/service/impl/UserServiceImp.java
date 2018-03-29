package com.fxy.room.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fxy.room.dao.RoomUserDao;
import com.fxy.room.entity.RoomUser;
import com.fxy.room.service.UserService;

@Service
public class UserServiceImp implements UserService {
	
	private static Logger logger = LoggerFactory.getLogger(UserServiceImp.class);
	
	@Resource
	private RoomUserDao userDao;
	
	@Override
	public int remove(Integer id) {
		return userDao.deleteByPrimaryKey(id);
	}

	@Override
	public int add(RoomUser roomUser) {
		return userDao.insertSelective(roomUser);
	}

	@Override
	public RoomUser findById(Integer id) {
		return userDao.selectByPrimaryKey(id);
	}

	@Override
	public int edit(RoomUser roomUser) {
		return userDao.updateByPrimaryKeySelective(roomUser);
	}

}
