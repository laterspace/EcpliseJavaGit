package com.how2j.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestExceotion3 {
	
	
	
	// 步骤 1 : 可查异常 //////////
//	public static void main(String[] args) {
//		File f = new File("d:/LOL.exe");
//		
//		try{
//            System.out.println("试图打开 d:/LOL.exe");
//            new FileInputStream(f);
//            System.out.println("成功打开");
//        }
//        catch(FileNotFoundException e){
//            System.out.println("d:/LOL.exe不存在");
//            e.printStackTrace();
//        }
//		
//		
//	}
	
	
	// 步骤 2 : 运行时异常 /////
//	public static void main(String[] args) {
//		
//		//任何除数不能为0:ArithmeticException
//		
//		int k=5/0;//会有编译错误
//		
//		
//		int j[]=new int[5];
//		j[10]=10;
//		
//		String str=null;
//		str.length();		
//	}
	
	
	// 步骤 3 : 错误 ///
	
//	public static void main(String[] args) {
//		StringBuffer sb=new StringBuffer();
//		for (int i = 0; i < Integer.MAX_VALUE; i++) {
//			sb.append('a');
//			
//		}
//	}
//	
	///异常处理系列教材 （四）- java Throwable接口
	
	//步骤 1 : Throwable
//	public static void main(String[] args) {
//		File f = new File("d:/LOL.exe");
//		 
//        try {
//            new FileInputStream(f);
//            //使用Throwable进行异常捕捉
//        }catch(Throwable t){
//        	t.printStackTrace();
//        }
//	}
//	
//	
//	
//
	public static void main(String[] args) {
		//method1();
		try {
            method2();
        }catch (Throwable e){
            e.printStackTrace();
        }
 
 
	}
	private static void method2() throws Throwable {
		File f = new File("d:/LOL.exe");
		 
        System.out.println("试图打开 d:/LOL.exe");
        new FileInputStream(f);
        System.out.println("成功打开");
	}
	

	
	
	
	
	
	
}
	
	
	
