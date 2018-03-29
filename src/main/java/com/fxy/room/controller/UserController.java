package com.fxy.room.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fxy.room.entity.RoomUser;
import com.fxy.room.service.UserService;

@Controller
public class UserController {
	
	private final static Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Resource
    private UserService userService;
    
    @RequestMapping(value="/toQueryUser")
    public ModelAndView toQueryUser(){
        RoomUser user = userService.findById(10);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", user);
        System.out.println(user.toString());
        return new ModelAndView("groupchat", map);
    }
}
