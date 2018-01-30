package com.fxy.room.service.Imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fxy.room.dao.RoomUserDao;
import com.fxy.room.entity.RoomUser;
import com.fxy.room.service.UserService;

@Service
public class UserServiceImp implements UserService {

	
	@Resource
	private RoomUserDao userDao;
	
	@Override
	public int remove(Integer id) {
		return userDao.deleteByPrimaryKey(id);
	}

	@Override
	public int add(RoomUser roomUser) {
		System.out.println(roomUser.toString());
		return userDao.insertSelective(roomUser);
	}

	@Override
	public RoomUser findByID(Integer id) {
		return userDao.selectByPrimaryKey(id);
	}

	@Override
	public int edit(RoomUser roomUser) {
		return userDao.updateByPrimaryKeySelective(roomUser);
	}

}
