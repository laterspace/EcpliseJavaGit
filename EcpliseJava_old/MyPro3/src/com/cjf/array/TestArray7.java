package com.cjf.array;
import java.util.Arrays;


public class TestArray7 {

    public static void main(String[] args) {
//        int[] a = {1,2,323,23,543,12,59};
//        System.out.println(Arrays.toString(a));
//        Arrays.sort(a);   //使用二分法查找，必须先对数组进行排序;
//        System.out.println(Arrays.toString(a));
//        //返回排序后新的索引位置,若未找到返回负数。
//        System.out.println("该元素的索引："+Arrays.binarySearch(a, 12)); 
    	 int[] a= {1,2,323,23,543,12,59};
         System.out.println(Arrays.toString(a));
         Arrays.fill(a, 2, 4, 100);  //将2到4索引的元素替换为100;
         System.out.println(Arrays.toString(a));
    
    
    }
}