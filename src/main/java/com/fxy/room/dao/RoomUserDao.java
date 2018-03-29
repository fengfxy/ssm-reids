package com.fxy.room.dao;

import com.fxy.room.entity.RoomUser;

public interface RoomUserDao {
	/**
	 * 根据主键删除数据库的记录:room_user
	 *
	 * @param id
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * 新写入数据库记录:room_user
	 *
	 * @param roomUser
	 */
	int insert(RoomUser roomUser);

	/**
	 * 动态字段,写入数据库记录:room_user
	 *
	 * @param roomUser
	 */
	int insertSelective(RoomUser roomUser);

	/**
	 * 根据指定主键获取一条数据库记录:room_user
	 *
	 * @param id
	 */
	RoomUser selectByPrimaryKey(Integer id);

	/**
	 * 动态字段,根据主键来更新符合条件的数据库记录:room_user
	 *
	 * @param roomUser
	 */
	int updateByPrimaryKeySelective(RoomUser roomUser);
}