package com.cjf.array;

public class TestArray2 {


    public static void main(String[] args) {
        int[] a = new int[4];
        //��ʼ������Ԫ�ص�ֵ
        for(int i=0;i<a.length;i++){
            a[i] = 100*i;
        }
        //��ȡԪ�ص�ֵ
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("###################");
        for (int i : a) {
			a[i]=100*i;
		}
        for(int n:a) {
        	System.out.println(n);
        }
    }
}