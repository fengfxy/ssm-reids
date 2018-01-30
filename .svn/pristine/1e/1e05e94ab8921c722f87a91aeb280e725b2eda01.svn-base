package com.fxy.room.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fxy.room.entity.RoomUser;
import com.fxy.room.service.UserService;

@Controller
public class UserController {
	
	private static final Logger LOG = Logger.getLogger(UserController.class);
	
	@Resource
    private UserService userService;
    
    @RequestMapping(value="/toQueryUser")
    public ModelAndView toQueryUser(){
        RoomUser user = userService.findByID(1);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", user);
        System.out.println(user.toString());
        return new ModelAndView("index", map);
    }
}
