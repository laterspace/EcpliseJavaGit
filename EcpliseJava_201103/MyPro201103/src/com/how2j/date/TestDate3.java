package com.how2j.date;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

public class TestDate3 {
////////////////////////1.
//	public static void main(String[] args) {
//		// ���õ���ģʽ��ȡ��������Calendar.getInstance();
//		Calendar c = Calendar.getInstance();
//		System.out.println("c1"+c);
//		 //ͨ����������õ����ڶ���
//        Date d = c.getTime();
//		System.out.println(d);
//
//		Date d2 = new Date(0);
//        c.setTime(d2); //������������������� : 1970.1.1 08:00:00
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
//		//��ǰ����
//		System.out.println("��ǰ����:\t"+format(c.getTime()));
//		
//		//
//		c.setTime(now);
//		c.add(Calendar.MONTH, 1);
//		System.out.println("�¸��µĽ���:\t"+format(c.getTime()));
//		
//		//
//		c.setTime(now);
//		c.add(Calendar.YEAR,-1);
//		System.out.println("ȥ��Ľ���:\t"+format(c.getTime()));
//		
//		//�ϸ��� �ĵ�����
//		c.setTime(now);
//		c.add(Calendar.MONTH, -1);
//		c.set(Calendar.DATE, 3);
//		System.out.println("�ϸ��µ�����:\t"+format(c.getTime()));
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
		
		System.out.println("������:"+format(now));
		
		c.setTime(now);
		c.add(Calendar.MONTH, 2);
		c.set(Calendar.DATE,-3);
		System.out.println("�¸��µ�����������:"+format(c.getTime()));
		
	}
	private static String format(Date time) {
		return sdf.format(time);
	}
	
	

}
