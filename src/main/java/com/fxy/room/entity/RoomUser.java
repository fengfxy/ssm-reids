/*
* RoomUser.java
* Copyright(C) 2017-2020 fendo公司
* @date 2018-02-05
*/
package com.fxy.room.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description room_user表的实体类
 * @version 1.0
 * @Author fendo
 * @Date 2018-02-05 21:28:08
 */
public class RoomUser implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * @Fields id 主键
     */
    private Integer id;

    /**
     * @Fields name 用户昵称
     */
    private String name;

    /**
     * @Fields userPhoto 用户头像
     */
    private String userPhoto;

    /**
     * @Fields creatTime 创建时间
     */
    private Date creatTime;

    /**
     * @Fields lastTime 最后活跃时间
     */
    private Date lastTime;

    /**
     * 获取 主键 字段:room_user.id
     *
     * @return room_user.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:room_user.id
     *
     * @param id the value for room_user.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 用户昵称 字段:room_user.name
     *
     * @return room_user.name, 用户昵称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 用户昵称 字段:room_user.name
     *
     * @param name the value for room_user.name, 用户昵称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 用户头像 字段:room_user.user_photo
     *
     * @return room_user.user_photo, 用户头像
     */
    public String getUserPhoto() {
        return userPhoto;
    }

    /**
     * 设置 用户头像 字段:room_user.user_photo
     *
     * @param userPhoto the value for room_user.user_photo, 用户头像
     */
    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    /**
     * 获取 创建时间 字段:room_user.creat_time
     *
     * @return room_user.creat_time, 创建时间
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * 设置 创建时间 字段:room_user.creat_time
     *
     * @param creatTime the value for room_user.creat_time, 创建时间
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * 获取 最后活跃时间 字段:room_user.last_time
     *
     * @return room_user.last_time, 最后活跃时间
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * 设置 最后活跃时间 字段:room_user.last_time
     *
     * @param lastTime the value for room_user.last_time, 最后活跃时间
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}