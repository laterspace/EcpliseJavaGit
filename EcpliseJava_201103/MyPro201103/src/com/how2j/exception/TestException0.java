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
//			System.out.println("��ͼ�� d:/LOL.exe");
//			new FileInputStream(f);
//			System.out.println("�ɹ���");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			 System.out.println("d:/LOL.exe������");
//			e.printStackTrace();
//		}
//	}
	
	//3.///////////////
	
//	public static void main(String[] args) {
//		File f=new File("d:/LOL.exe");
//
//		try {
//			System.out.println("��ͼ�� d:/LOL.exe");
//			new FileInputStream(f);
//			
//			System.out.println("�ɹ���");
//			
//			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//			
//			Date d=sdf.parse("2016-06-03");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			 System.out.println("d:/LOL.exe������");
//			e.printStackTrace();
//		} catch (ParseException e) {
//			// TODO: handle exception
//			System.out.println("���ڸ�ʽ��������");
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
//	            System.out.println("��ͼ�� d:/LOL.exe");
//	            
//	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//	            Date d = sdf.parse("2016-06-03");
//	            new FileInputStream(f);
//	            System.out.println("�ɹ���");
//	        }catch (FileNotFoundException|ParseException e) {
//				// TODO: handle exception
//	        	if(e instanceof FileNotFoundException)
//	        		System.out.println("d:/LOL.exe������");
//	        	if(e instanceof ParseException)
//	        		System.out.println("���ڸ�ʽ��������");
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
//	            System.out.println("��ͼ�� d:/LOL.exe");
//	            new FileInputStream(f);
//	            System.out.println("�ɹ���");
//	        }
//	        catch(FileNotFoundException e){
//	            System.out.println("d:/LOL.exe������");
//	            e.printStackTrace();
//	        }finally {
//	        	System.out.println("�����ļ��Ƿ����,����ִ�д���");
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
		
		System.out.println("d:/LOL.exe������");
		new FileInputStream(f);
		System.out.println("�ɹ���");
		 
	}
	
	
	
	
}
