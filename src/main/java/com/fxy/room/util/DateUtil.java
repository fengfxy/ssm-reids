package com.fxy.room.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 
 * 时间工具
 * 
 * @author lee
 * @since 2017/2/17 10:50:00
 * 
 */
public class DateUtil {
	
	
	
	public static void main(String[] args) {
		isinvalidate2();
	}
	// private static SimpleDateFormat simpleDateFormat = new
	// SimpleDateFormat();

	private static ThreadLocal<SimpleDateFormat> local = new ThreadLocal<SimpleDateFormat>();

	/**
	 * 获取当前时间
	 * 
	 * @return 当前时间格式化后的字符串 示例: "2000-10-0 18:00:00"
	 */
	public static String getCurrentTime() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}

	/**
	 * 获取当前格式化时间
	 * 
	 * @param pattern
	 *            - 时间格式 示例: "yyyy-MM-dd HH:mm:ss"
	 * @return 当前时间格式化后的字符串 示例: "2000-10-0 18:00:00"
	 * 
	 *         解决方案1
	 * 
	 */
	public static String getCurrentTime(String pattern) {
		return new SimpleDateFormat(pattern).format(new Date());
	}

	public static String simpleDateformatDate(String pattern, Date date) {

		return new SimpleDateFormat(pattern).format(date);
	}

	/**
	 * 
	 * 
	 * 
	 * 解决方案2
	 * 
	 */
	public static Date simpleDateparseDate(String pattern, String dateStr) throws ParseException {
		return new SimpleDateFormat(pattern).parse(dateStr);
	}

	public static Date parseDate(String pattern, String str) throws ParseException {
		SimpleDateFormat sdf = local.get();
		if (sdf == null) {
			sdf = new SimpleDateFormat(pattern, Locale.US);
			local.set(sdf);
		}
		try {
			return sdf.parse(str);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		return new SimpleDateFormat(pattern).parse(str);
	}

	public static String formatDate(String pattern, Date date) {
		SimpleDateFormat sdf = local.get();
		if (sdf == null) {
			sdf = new SimpleDateFormat(pattern, Locale.US);
			local.set(sdf);
		}
		return sdf.format(date);
	}
	
	public static boolean isinvalidate(Date date){
		  if (new Date().getTime()<date.getTime()){ 
			  return false;
		  }else{ 
			  return true;
		  } 
	}
	/*
	 * date1 <当前时间 <date2 返回true 
	 * 
	 * 
	 */
	public static boolean isinvalidate2(){
		 SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");  
		  Calendar calender = Calendar.getInstance();
		  int hour = calender.get(Calendar.HOUR_OF_DAY);
		  int minute = calender.get(Calendar.MINUTE);
		  int second = calender.get(Calendar.SECOND);
		if (hour>5&&minute>30&&hour<8&&minute<30){ 
			return true;
		}else{ 
			return false;
		} 
	}
	public static String getLast2Day() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_YEAR, -2);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return DateUtil.formatDate("yyyy-MM-dd HH:mm:ss", c.getTime());
	}
}