package com.how2j;

public class TestSwitch {
	public static void main(String[] args) {
		// if
		int day = 8;
		if (day == 1)
			System.out.println("����һ");
		else if (day == 2)
			System.out.println("���ڶ�");
		else if (day == 3)
			System.out.println("������");
		else if (day == 4)
			System.out.println("������");
		else if (day == 5)
			System.out.println("������");
		else if (day == 6)
			System.out.println("������");
		else if (day == 7)
			System.out.println("������");
		else
			System.out.println("????");

		// switch
		switch (day) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;

		default:
			System.out.println("????");
			break;
		}

	}
}
