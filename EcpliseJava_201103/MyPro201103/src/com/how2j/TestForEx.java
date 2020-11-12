package com.how2j;

public class TestForEx {
	public static void main(String[] args) {
		int[] values = new int[6];
		for (int i = 0; i < values.length; i++) {
			values[i] = (int) (Math.random() * 100);
			System.out.print(values[i] + "  ");
		}
		System.out.println("");
		// 常规遍历
		for (int i = 0; i < values.length; i++) {
			int each = values[i];
			System.out.print(each + "  ");
		}
		System.out.println("");
		// 增强型for循环遍历
		for (int each : values) {
			System.out.print(each + "  ");
		}

		int max = values[0];
		for (int each : values) {

			if (each > max) {
				int temp = max;
				max = each;
				each = temp;
			}
			
		}
		System.out.print("max:" + max);
	}
}
