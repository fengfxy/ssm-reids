package com.fxy.room.service;

import com.fxy.room.entity.RoomMess;

public interface RoomMessService {

    int removeById(Integer id);

    int add(RoomMess roomMess);

    RoomMess findById(Integer id);

    int editById(RoomMess roomMess);

}
