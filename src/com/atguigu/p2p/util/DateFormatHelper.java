package com.atguigu.p2p.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将时间转为字符串
 * @author Administrator
 *
 */
public class DateFormatHelper 
{
	
	private DateFormatHelper() { }
	
	private final static String FORMAT_STR = "yyyy-MM-dd HH:mm:ss";
	
	public static String long2str(long time)
	{
		Date d = new Date(time);
		DateFormat df = new SimpleDateFormat(FORMAT_STR);
		return df.format(d);
	}
//	public static long str2long(String str){
//		DateFormat df = new SimpleDateFormat(FORMAT_STR);
//		return df.parse(str).getTime();
//	}
}
