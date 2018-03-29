package com.fxy.room.controller;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.fxy.room.entity.RoomMess;
import com.fxy.room.service.RoomMessService;
import com.fxy.room.util.EmojiUtil;
import com.fxy.room.util.RedisCache;
import com.fxy.room.util.Result;

@Controller
@RequestMapping(value = "/room")
public class RoomControoler {
	private final static Logger log = LoggerFactory.getLogger(RoomControoler.class);
	
	@Resource
	private RoomMessService roomMessService;
	
	private RedisCache redisUtil=new RedisCache();
	/*
	 * 接受消息 目前只写了一个参数 后续完善
	 */
	@RequestMapping(value = "/send")
	@ResponseBody
	public Result send(Model model, String info) {

		log.debug(info);
		String jar = EmojiUtil.emojiConverterToAlias(info);
		String emojiConverterUnicodeStr = EmojiUtil.emojiConverterUnicodeStr(jar);
		log.info("java-emoji-converter jar包处理"+jar);
		log.info(emojiConverterUnicodeStr);
//		redisUtil.clear();
		RoomMess findById = roomMessService.findById(3);
//		String messInfo = findById.getMessInfo();
		
		
//		log.info(messInfo);
		return Result.success();
	}

	@RequestMapping(value = "/getInfo")
	public void getQueueNew(Integer weishangqiangId, HttpServletRequest request, HttpServletResponse response) {
		PrintWriter out = null;
		try {
			Result result = new Result();
			result.setMessage("推送消息了");
			response.setContentType("text/event-stream");
			response.setCharacterEncoding("utf-8");
			out = response.getWriter();
			out.println("retry:1500");// 响应时间间隔，单位毫秒
			out.println("event:load");// 响应事件，不指定默认为message事件
			out.println("data:" + JSON.toJSONString(result));// 响应数据
			out.println("id:10002");// 标识id
			out.println();
		} catch (Exception e) {
			System.out.println("大屏端queue方法数据推送报错：" + e.getMessage());
		} finally {
			if (out != null) {
				out.flush();
				out.close();
			}
		}
	}
}
