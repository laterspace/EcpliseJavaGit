package how2j.practice;

import java.util.Scanner;

public class TestYear {
	public static void main(String[] args) {
		System.out.println("请输入年份:");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		s.close();
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + "是闰年");
		} else if (year % 400 == 0) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}
	}
}
