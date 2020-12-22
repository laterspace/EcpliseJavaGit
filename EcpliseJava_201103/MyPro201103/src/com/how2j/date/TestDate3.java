package com.how2j.date;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

public class TestDate3 {
////////////////////////1.
//	public static void main(String[] args) {
//		// 采用单例模式获取日历对象Calendar.getInstance();
//		Calendar c = Calendar.getInstance();
//		System.out.println("c1"+c);
//		 //通过日历对象得到日期对象
//        Date d = c.getTime();
//		System.out.println(d);
//
//		Date d2 = new Date(0);
//        c.setTime(d2); //把这个日历，调成日期 : 1970.1.1 08:00:00
//		System.out.println(d2);
//		System.out.println("c2"+c);
//		
//		
//  
//        
//	}
	
	//2.//////////////////////
//	private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	
//	public static void main(String[] args) {
//		Calendar c= Calendar.getInstance();
//		Date now=c.getTime();
//		//当前日期
//		System.out.println("当前日期:\t"+format(c.getTime()));
//		
//		//
//		c.setTime(now);
//		c.add(Calendar.MONTH, 1);
//		System.out.println("下个月的今天:\t"+format(c.getTime()));
//		
//		//
//		c.setTime(now);
//		c.add(Calendar.YEAR,-1);
//		System.out.println("去年的今天:\t"+format(c.getTime()));
//		
//		//上个月 的第三天
//		c.setTime(now);
//		c.add(Calendar.MONTH, -1);
//		c.set(Calendar.DATE, 3);
//		System.out.println("上个月第三天:\t"+format(c.getTime()));
//		
//		
//	}
//
//	private static String format(Date time) {
//		return sdf.format(time);
//	}
	
	//3./////////////////
	private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		Date now=c.getTime();
		
		System.out.println("今天是:"+format(now));
		
		c.setTime(now);
		c.add(Calendar.MONTH, 2);
		c.set(Calendar.DATE,-3);
		System.out.println("下个月倒数第三天是:"+format(c.getTime()));
		
	}
	private static String format(Date time) {
		return sdf.format(time);
	}
	
	

}
