package com.fxy.room.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fxy.room.dao.RoomMessDao;
import com.fxy.room.entity.RoomMess;
import com.fxy.room.service.RoomMessService;

@Service
public class RoomMessServiceImp implements RoomMessService {

	private static Logger logger = LoggerFactory.getLogger(RoomMessServiceImp.class);
	
	@Resource
	private RoomMessDao roomMessDao;
	
	
	@Override
	public int removeById(Integer id) {
		return roomMessDao.deleteByPrimaryKey(id);
	}

	@Override
	public int add(RoomMess roomMess) {
		return roomMessDao.insertSelective(roomMess);
	}

	@Override
	public RoomMess findById(Integer id) {
		return roomMessDao.selectByPrimaryKey(id);
	}

	@Override
	public int editById(RoomMess roomMess) {
		return roomMessDao.updateByPrimaryKeySelective(roomMess);
	}

}
