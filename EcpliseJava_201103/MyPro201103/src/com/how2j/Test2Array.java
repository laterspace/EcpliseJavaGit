package com.how2j;

public class Test2Array {
	public static void main(String[] args) {
		// ��ϰ-��ά����
		int[][] a = new int[5][5];

		int maxnum = -1;
		int maxX = 0;
		int maxY = 0;

		// ��ά����,�����ֵ
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 100);
				System.out.print(a[i][j] + " ");
				if (j == 4)
					System.out.print("\r\n");
			}

		}
		// ����
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxnum) {
					maxnum = a[i][j];
					maxX = i;
					maxY = j;
				}
			}
		}
		System.out.println("�ҳ�����������:" + maxnum);
		System.out.println("��������[" + maxX + "][" + maxY + "]");

		// ð������
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
		System.out.println("�ҳ�����������:" + maxnum);
		System.out.println("��������[" + maxX + "][" + maxY + "]");
	}
}