package com.cjf.array;

public class TestArray2 {


    public static void main(String[] args) {
        int[] a = new int[4];
        //初始化数组元素的值
        for(int i=0;i<a.length;i++){
            a[i] = 100*i;
        }
        //读取元素的值
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