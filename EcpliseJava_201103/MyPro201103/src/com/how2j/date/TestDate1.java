package com.how2j.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate1 {
public static void main(String[] args) {
	//日期时间格式
//  准备一个长度是9的日期数组
//  使用1970年-2000年之间的随机日期初始化该数组
//  按照这些日期的时间进行升序排序
//  比如 1988-1-21 12:33:22 就会排在 1978-4-21 19:07:23 前面，
//  因为它的时间更小，虽然日期更大
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
//  System.out.printf("字符串 %s 通过格式  yyyy/MM/dd HH:mm:ss %n转换为日期对象: %s",str,d.toString());
//} catch (ParseException e) {
//  // TODO Auto-generated catch block
//  e.printStackTrace();
//}




//-----------------------------------------
//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//	Date d =new Date();
//	String str=sdf.format(d);
//	System.out.println("当前时间同过yyyy-MM-dd HH:mm:ss SSS 格式化后的输出:"+str);
//	
//	SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy.MM.dd" );
//    Date d1= new Date();
//    String str1 = sdf1.format(d1);
//    System.out.println("当前时间通过 yyyy.MM.dd 格式化后的输出: "+str1);
//}
}
