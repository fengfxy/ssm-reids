package com.fxy.room.dao;

import com.fxy.room.entity.RoomMess;

public interface RoomMessDao {
    /**
     *  根据主键删除数据库的记录:room_mess
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  动态字段,写入数据库记录:room_mess
     *
     * @param roomMess
     */
    int insertSelective(RoomMess roomMess);

    /**
     *  根据指定主键获取一条数据库记录:room_mess
     *
     * @param id
     */
    RoomMess selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录:room_mess
     *
     * @param roomMess
     */
    int updateByPrimaryKeySelective(RoomMess roomMess);

}