package com.how2j;

import java.util.Arrays;

public class TestArraysTool {
	public static void main(String[] args) {
//		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
//		 //
//		System.out.println("���鸴��");
//        // copyOfRange(int[] original, int from, int to)
//        // ��һ��������ʾԴ����
//        // �ڶ���������ʾ��ʼλ��(ȡ�õ�)
//        // ������������ʾ����λ��(ȡ����)
//        int[] b = Arrays.copyOfRange(a, 0, 3);
// 
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//            if (i==2) {
//				System.out.println("");
//			}
//        }
//        //
//        System.out.println("ת��Ϊ�ַ��� :");
//        String content=Arrays.toString(a);
//        System.out.println(content);
//        System.out.println(a);
//        
//        //
//        System.out.println("���� ");
//        System.out.println("����֮ǰ:");
//        System.out.println(Arrays.toString(a));
//        Arrays.sort(a);
//        System.out.println("����֮��:");
//        System.out.println(Arrays.toString(a));
        
        //
        
        int[][] c=new int[5][8];
        int[] d=new int[8];//���ڴ��һλ����
        
        //�����ֵ,
        System.out.println("ԭ��ά����:");
        for (int j = 0; j < c.length; j++) {
			for (int i = 0; i < c[j].length; i++) {
				c[j][i]=(int)(Math.random()*100);
				 System.out.print(c[j][i] + "  ");
		            if (i==7) 
						System.out.println("");
				
			}
		}
        System.out.println("�����Ķ�λ����:");
        for (int i = 0; i < c.length; i++) {
			System.arraycopy(c[i], 0, d, 0, 8);
			Arrays.sort(d);
			System.arraycopy(d, 0, c[i], 0, 8);
			System.out.println(Arrays.toString(d));
		}
        
        
	}
}
