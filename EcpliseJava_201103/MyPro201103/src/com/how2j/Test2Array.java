package com.how2j;

public class Test2Array {
	public static void main(String[] args) {
		// 练习-二维数组
		int[][] a = new int[5][5];

		int maxnum = -1;
		int maxX = 0;
		int maxY = 0;

		// 二维数组,随机赋值
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 100);
				System.out.print(a[i][j] + " ");
				if (j == 4)
					System.out.print("\r\n");
			}

		}
		// 排序
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxnum) {
					maxnum = a[i][j];
					maxX = i;
					maxY = j;
				}
			}
		}
		System.out.println("找出来最大的数是:" + maxnum);
		System.out.println("其坐标是[" + maxX + "][" + maxY + "]");

		// 冒泡排序
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 100);
				System.out.print(a[i][j] + " ");
				if (j == 4)
					System.out.print("\r\n");
				if (a[i][j] > maxnum) {
					maxnum = a[i][j];
					maxX = i;
					maxY = j;
				}
			}
		}
		System.out.println("找出来最大的数是:" + maxnum);
		System.out.println("其坐标是[" + maxX + "][" + maxY + "]");
	}
}