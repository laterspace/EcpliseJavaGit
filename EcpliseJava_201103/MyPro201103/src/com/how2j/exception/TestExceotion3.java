package com.how2j.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestExceotion3 {
	
	
	
	// ���� 1 : �ɲ��쳣 //////////
//	public static void main(String[] args) {
//		File f = new File("d:/LOL.exe");
//		
//		try{
//            System.out.println("��ͼ�� d:/LOL.exe");
//            new FileInputStream(f);
//            System.out.println("�ɹ���");
//        }
//        catch(FileNotFoundException e){
//            System.out.println("d:/LOL.exe������");
//            e.printStackTrace();
//        }
//		
//		
//	}
	
	
	// ���� 2 : ����ʱ�쳣 /////
//	public static void main(String[] args) {
//		
//		//�κγ�������Ϊ0:ArithmeticException
//		
//		int k=5/0;//���б������
//		
//		
//		int j[]=new int[5];
//		j[10]=10;
//		
//		String str=null;
//		str.length();		
//	}
	
	
	// ���� 3 : ���� ///
	
//	public static void main(String[] args) {
//		StringBuffer sb=new StringBuffer();
//		for (int i = 0; i < Integer.MAX_VALUE; i++) {
//			sb.append('a');
//			
//		}
//	}
//	
	///�쳣����ϵ�н̲� ���ģ�- java Throwable�ӿ�
	
	//���� 1 : Throwable
//	public static void main(String[] args) {
//		File f = new File("d:/LOL.exe");
//		 
//        try {
//            new FileInputStream(f);
//            //ʹ��Throwable�����쳣��׽
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
		 
        System.out.println("��ͼ�� d:/LOL.exe");
        new FileInputStream(f);
        System.out.println("�ɹ���");
	}
	

	
	
	
	
	
	
}
	
	
	
