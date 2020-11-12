package com.how2j;

public class TestArray {
	public static void main(String[] args) {
		int[] a;
		a = new int[5];

		// 随机赋值
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + "  ");
		}
		System.out.print("\n");
		System.out.println("选择法正序:");
		for (int j = 0; j < a.length; j++) {
			for (int i = j + 1; i < a.length; i++) {
				if (a[i] < a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}
			}
		}
		// 把内容打印出来
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println(" ");

		System.out.println("冒泡法倒序:");
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length - j - 1; i++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}

		// 把内容打印出来
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}
	//

}
