package com.how2j;

public class TestSwitch {
	public static void main(String[] args) {
		// if
		int day = 8;
		if (day == 1)
			System.out.println("星期一");
		else if (day == 2)
			System.out.println("星期二");
		else if (day == 3)
			System.out.println("星期三");
		else if (day == 4)
			System.out.println("星期四");
		else if (day == 5)
			System.out.println("星期五");
		else if (day == 6)
			System.out.println("星期六");
		else if (day == 7)
			System.out.println("星期天");
		else
			System.out.println("????");

		// switch
		switch (day) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期天");
			break;

		default:
			System.out.println("????");
			break;
		}

	}
}
