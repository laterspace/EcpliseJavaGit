package com.how2j;

public class TestWhlie {
	public static void main(String[] args) {
		
//		//条件为true时 重复执行 
//		int i=0;
//		while (i<5) {
//			System.out.println(i);
//			i++;
//		}
//		
//		//与while的区别是，无论是否成立，先执行一次，再进行判断
//        int i0 = 0;
//        do {System.out.println(i0+"x");
//        i0++;
//        	
//        }while(i0<5);
		
		//for
		double income=0;

		for (int i = 1; i <=10; i++) {
			income=Math.pow(2, i-1);
			System.out.println("第"+i+"天的收入:"+income);
		}
		
		
		
	}
}
