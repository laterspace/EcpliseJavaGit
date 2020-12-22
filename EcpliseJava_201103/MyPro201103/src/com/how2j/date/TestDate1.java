package com.how2j.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate1 {
public static void main(String[] args) {
	//����ʱ���ʽ
//  ׼��һ��������9����������
//  ʹ��1970��-2000��֮���������ڳ�ʼ��������
//  ������Щ���ڵ�ʱ�������������
//  ���� 1988-1-21 12:33:22 �ͻ����� 1978-4-21 19:07:23 ǰ�棬
//  ��Ϊ����ʱ���С����Ȼ���ڸ���
    SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
    Date[] dates= new Date[9];
    int[] indexs = new int[9];
    for(int i=0; i<dates.length; i++){
        dates[i] = initRandomDates(1970, 2000);
        indexs[i] = Integer.valueOf(sdf.format(dates[i]));
    }
    for(int i=0; i<9-1; i++)
        for(int j=0; j<9-1-i; j++){
            if(indexs[j] > indexs[j+1]){
                int temp = indexs[j];
                indexs[j] = indexs[j+1];
                indexs[j+1] = temp;
                Date tempD = dates[j];
                dates[j] = dates[j+1];
                dates[j+1] = tempD;
            }
        }
     
    for(Date d: dates)
        System.out.println(d);
     
}
public static Date initRandomDates(int... n){
    Calendar cal = Calendar.getInstance();
    cal.set(n[0], 0, 1, 0, 0, 0);
    long start = cal.getTimeInMillis();
    cal.set(n[1], 0, 1, 0, 0, 0);
    long end = cal.getTimeInMillis();
    long time = (long)(Math.random()*(end-start) + start);
    return new Date(time);
}

///-----------------------------------------------
//SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );

//String str = "2016/1/5 12:12:12";
//
//try {
//  Date d = sdf.parse(str);
//  System.out.printf("�ַ��� %s ͨ����ʽ  yyyy/MM/dd HH:mm:ss %nת��Ϊ���ڶ���: %s",str,d.toString());
//} catch (ParseException e) {
//  // TODO Auto-generated catch block
//  e.printStackTrace();
//}




//-----------------------------------------
//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//	Date d =new Date();
//	String str=sdf.format(d);
//	System.out.println("��ǰʱ��ͬ��yyyy-MM-dd HH:mm:ss SSS ��ʽ��������:"+str);
//	
//	SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy.MM.dd" );
//    Date d1= new Date();
//    String str1 = sdf1.format(d1);
//    System.out.println("��ǰʱ��ͨ�� yyyy.MM.dd ��ʽ��������: "+str1);
//}
}
