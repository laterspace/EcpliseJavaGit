package com.how2j;

import java.util.Arrays;

public class TestArraysTool {
	public static void main(String[] args) {
//		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
//		 //
//		System.out.println("数组复制");
//        // copyOfRange(int[] original, int from, int to)
//        // 第一个参数表示源数组
//        // 第二个参数表示开始位置(取得到)
//        // 第三个参数表示结束位置(取不到)
//        int[] b = Arrays.copyOfRange(a, 0, 3);
// 
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//            if (i==2) {
//				System.out.println("");
//			}
//        }
//        //
//        System.out.println("转换为字符串 :");
//        String content=Arrays.toString(a);
//        System.out.println(content);
//        System.out.println(a);
//        
//        //
//        System.out.println("排序 ");
//        System.out.println("排序之前:");
//        System.out.println(Arrays.toString(a));
//        Arrays.sort(a);
//        System.out.println("排序之后:");
//        System.out.println(Arrays.toString(a));
        
        //
        
        int[][] c=new int[5][8];
        int[] d=new int[8];//用于存放一位数组
        
        //随机赋值,
        System.out.println("原二维数组:");
        for (int j = 0; j < c.length; j++) {
			for (int i = 0; i < c[j].length; i++) {
				c[j][i]=(int)(Math.random()*100);
				 System.out.print(c[j][i] + "  ");
		            if (i==7) 
						System.out.println("");
				
			}
		}
        System.out.println("排序后的二位数组:");
        for (int i = 0; i < c.length; i++) {
			System.arraycopy(c[i], 0, d, 0, 8);
			Arrays.sort(d);
			System.arraycopy(d, 0, c[i], 0, 8);
			System.out.println(Arrays.toString(d));
		}
        
        
	}
}
