package com.how2j.date;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		Date now= new Date();
		//��ǰ���ڵĺ�����
        System.out.println("Date.getTime() \t\t\t����ֵ: "+now.getTime());
        //ͨ��System.currentTimeMillis()��ȡ��ǰ���ڵĺ�����
        System.out.println("System.currentTimeMillis() \t����ֵ: "+System.currentTimeMillis());
		
		
		
		//========================================
		 //ע�⣺��java.util.Date;
        //���� java.sql.Date�������Ǹ����ݿ���ʵ�ʱ��ʹ�õ�
//        Date now= new Date();
//        //��ӡ��ǰʱ��
//        System.out.println("��ǰʱ��:"+now.toString());
//        //getTime() �õ�һ��long�͵�����
//        //����������� 1970.1.1 08:00:00:000��ÿ����һ���룬����1
//        System.out.println("��ǰʱ��getTime()���ص�ֵ�ǣ�"+now.getTime());
//          
//        Date zero = new Date(0);
//        System.out.println("��0��Ϊ���췽�����õ���������:"+zero);
		
		
		//========================================
		// ��ǰʱ��
//		Date d1 = new Date();
//		System.out.println("��ǰʱ��:");
//		System.out.println(d1);
//		System.out.println();
//
//		// ��1970��1��1�� ����8��0��0�� ��ʼ�����ĺ�����
//		Date d2 = new Date(5000);
//		System.out.println("��1970��1��1�� ����8��0��0�� ��ʼ������5���ʱ��");
//		System.out.println(d2);
		
		
		
	
		
	}
}
