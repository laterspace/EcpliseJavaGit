package com.how2j;

public class TestContinue {
	public static void main(String[] args) {
		
//		//Ê¾Àý1:
//		for (int j = 0; j < 10; j++) {
//			if(0==j%2)
//				continue;
//			System.out.println(j);
//		}
			
			
//		//Ê¾ÀýÁ·Ï°	
//		System.out.println("Ê¾ÀýÁ·Ï°");	
//		for (int i = 1; i < 100; i++) {
//			if(0==i%3|0==i%5)
//				continue;
//			System.out.println(i);
//		
//		}
		//Ë®ÏÉÊý
		for (int i = 100; i < 1000; i++) {
			int a,b,c;
			a=i/100;
			b=(i-a*100)/10;
			c=i-a*100-b*10;
			int sum=(int) (Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3));
			if (i!=sum) {
				continue;
			}else {
				System.out.println(sum);
			}
			
		}
		
		
	}
}
