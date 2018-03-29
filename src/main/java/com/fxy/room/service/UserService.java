package com.fxy.room.service;

import com.fxy.room.entity.RoomUser;

public interface UserService {
	 /**
     *  根据主键删除数据库的记录:room_user
     *
     * @param id
     */
    int remove(Integer id);

    /**
     *  新写入数据库记录:room_user
     *
     * @param roomUser
     */
    int add(RoomUser roomUser);

    /**
     *  根据指定主键获取一条数据库记录:room_user
     *
     * @param id
     */
    RoomUser findById(Integer id);

    /**
     *  根据主键来更新符合条件的数据库记录:room_user
     *
     * @param roomUser
     */
    int edit(RoomUser roomUser);
}
