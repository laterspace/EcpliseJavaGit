package how2j.practice;

import java.util.Scanner;

public class TestYear {
	public static void main(String[] args) {
		System.out.println("���������:");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		s.close();
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + "������");
		} else if (year % 400 == 0) {
			System.out.println(year + "������");
		} else {
			System.out.println(year + "��������");
		}
	}
}
