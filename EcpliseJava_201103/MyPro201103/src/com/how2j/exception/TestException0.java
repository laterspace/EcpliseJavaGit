package com.how2j.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.remote.TargetedNotification;

public class TestException0 {
	
	//1.-2.//////////////////
//	public static void main(String[] args) {
//		File f=new File("d:/LOL.exe");
//		
//		try {
//			System.out.println("试图打开 d:/LOL.exe");
//			new FileInputStream(f);
//			System.out.println("成功打开");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			 System.out.println("d:/LOL.exe不存在");
//			e.printStackTrace();
//		}
//	}
	
	//3.///////////////
	
//	public static void main(String[] args) {
//		File f=new File("d:/LOL.exe");
//
//		try {
//			System.out.println("试图打开 d:/LOL.exe");
//			new FileInputStream(f);
//			
//			System.out.println("成功打开");
//			
//			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//			
//			Date d=sdf.parse("2016-06-03");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			 System.out.println("d:/LOL.exe不存在");
//			e.printStackTrace();
//		} catch (ParseException e) {
//			// TODO: handle exception
//			System.out.println("日期格式解析出错");
//			e.printStackTrace();
//		}
//		
//	}
	
	
	//4./////////////////
//	public static void main(String[] args) {
//		
//		 File f = new File("d:/LOL.exe");
//		 
//	        try {
//	            System.out.println("试图打开 d:/LOL.exe");
//	            
//	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//	            Date d = sdf.parse("2016-06-03");
//	            new FileInputStream(f);
//	            System.out.println("成功打开");
//	        }catch (FileNotFoundException|ParseException e) {
//				// TODO: handle exception
//	        	if(e instanceof FileNotFoundException)
//	        		System.out.println("d:/LOL.exe不存在");
//	        	if(e instanceof ParseException)
//	        		System.out.println("日期格式解析错误");
//	        	
//	        	e.printStackTrace();
//			}
//		
//	}
	
	
	//5.///////////
	
//	public static void main(String[] args) {
//		  File f= new File("d:/LOL.exe");
//	         
//	        try{
//	            System.out.println("试图打开 d:/LOL.exe");
//	            new FileInputStream(f);
//	            System.out.println("成功打开");
//	        }
//	        catch(FileNotFoundException e){
//	            System.out.println("d:/LOL.exe不存在");
//	            e.printStackTrace();
//	        }finally {
//	        	System.out.println("无论文件是否存在,都会执行代码");
//	        }
//	}
	
	
	//6.///////////////
	public static void main(String[] args) {
		method1();
	}
	
	private static void method1() {
		try {
			method2();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void method2() throws FileNotFoundException {
		File f=new File("d:/LOL.exe");
		
		System.out.println("d:/LOL.exe不存在");
		new FileInputStream(f);
		System.out.println("成功打开");
		 
	}
	
	
	
	
}
