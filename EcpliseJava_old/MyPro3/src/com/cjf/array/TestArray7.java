package com.cjf.array;
import java.util.Arrays;


public class TestArray7 {

    public static void main(String[] args) {
//        int[] a = {1,2,323,23,543,12,59};
//        System.out.println(Arrays.toString(a));
//        Arrays.sort(a);   //ʹ�ö��ַ����ң������ȶ������������;
//        System.out.println(Arrays.toString(a));
//        //����������µ�����λ��,��δ�ҵ����ظ�����
//        System.out.println("��Ԫ�ص�������"+Arrays.binarySearch(a, 12)); 
    	 int[] a= {1,2,323,23,543,12,59};
         System.out.println(Arrays.toString(a));
         Arrays.fill(a, 2, 4, 100);  //��2��4������Ԫ���滻Ϊ100;
         System.out.println(Arrays.toString(a));
    
    
    }
}