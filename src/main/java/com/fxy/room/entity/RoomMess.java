/*
* RoomMess.java
* Copyright(C) 2017-2020 fendo公司
* @date 2018-02-05
*/
package com.fxy.room.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description room_mess表的实体类
 * @version 1.0
 * @Author feng
 * @Date 2018-02-05 21:28:08
 */
public class RoomMess implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * @Fields id 聊天记录主键
     */
    private Integer id;

    /**
     * @Fields userId 用户ID
     */
    private Integer userId;

    /**
     * @Fields messTime 聊天记录时间
     */
    private Date messTime;

    /**
     * @Fields messInfo 聊天内容
     */
    private String messInfo;

    /**
     * 获取 聊天记录主键 字段:room_mess.id
     *
     * @return room_mess.id, 聊天记录主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 聊天记录主键 字段:room_mess.id
     *
     * @param id the value for room_mess.id, 聊天记录主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 用户ID 字段:room_mess.user_id
     *
     * @return room_mess.user_id, 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置 用户ID 字段:room_mess.user_id
     *
     * @param userId the value for room_mess.user_id, 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取 聊天记录时间 字段:room_mess.mess_time
     *
     * @return room_mess.mess_time, 聊天记录时间
     */
    public Date getMessTime() {
        return messTime;
    }

    /**
     * 设置 聊天记录时间 字段:room_mess.mess_time
     *
     * @param messTime the value for room_mess.mess_time, 聊天记录时间
     */
    public void setMessTime(Date messTime) {
        this.messTime = messTime;
    }

    /**
     * 获取 聊天内容 字段:room_mess.mess_info
     *
     * @return room_mess.mess_info, 聊天内容
     */
    public String getMessInfo() {
        return messInfo;
    }

    /**
     * 设置 聊天内容 字段:room_mess.mess_info
     *
     * @param messInfo the value for room_mess.mess_info, 聊天内容
     */
    public void setMessInfo(String messInfo) {
        this.messInfo = messInfo == null ? null : messInfo.trim();
    }
}