package com.how2j;

public class TestMergeArray {
	
	
	
	public static void main(String[] args) {
		
		int[] a =new int[5];
		int[] b=new int[5];
		int[] c=new int[10];
		//随机赋值
		System.out.println("a数组:");
		for (int i = 0; i < a.length; i++) {
			a[i]=(int)(Math.random()*10);
			System.out.print(a[i]+"  ");
		}
		System.out.println("");
		System.out.println("b数组:");
		for (int i = 0; i < b.length; i++) {
			b[i]=(int)(Math.random()*10);
			System.out.print(b[i]+"  ");
		}
		//a-->c
		System.arraycopy(a, 0, c, 0, 5);
		System.arraycopy(b, 0, c, 5, 5);
		
		//print c[10]
		System.out.println("");
		System.out.println("c数组:");
		for (int i : c) {
			System.out.print(i+"  ");
		}
		
	}
}
