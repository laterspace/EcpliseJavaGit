package com.how2j;

public class TestWhlie {
	public static void main(String[] args) {
		
//		//����Ϊtrueʱ �ظ�ִ�� 
//		int i=0;
//		while (i<5) {
//			System.out.println(i);
//			i++;
//		}
//		
//		//��while�������ǣ������Ƿ��������ִ��һ�Σ��ٽ����ж�
//        int i0 = 0;
//        do {System.out.println(i0+"x");
//        i0++;
//        	
//        }while(i0<5);
		
		//for
		double income=0;

		for (int i = 1; i <=10; i++) {
			income=Math.pow(2, i-1);
			System.out.println("��"+i+"�������:"+income);
		}
		
		
		
	}
}
