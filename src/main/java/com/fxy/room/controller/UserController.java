package com.fxy.room.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fxy.room.entity.RoomUser;
import com.fxy.room.service.UserService;

@Controller
public class UserController {

	@Resource
    private UserService userService;
    
    @RequestMapping(value="/toQueryUser")
    public ModelAndView toQueryUser(){
        RoomUser user = userService.findByID(0);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", user);
        return new ModelAndView("/pc/userTest", map);
    }
}
