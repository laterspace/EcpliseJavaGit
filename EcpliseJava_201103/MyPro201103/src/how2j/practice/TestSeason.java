package how2j.practice;

import java.util.Scanner;

public class TestSeason {
	public static void main(String[] args) {
		System.out.println("请输入月份:");
		Scanner s = new Scanner(System.in);
		int mouth = s.nextInt();
		s.close();
		
		switch ((mouth-1) / 3) {
		case 0:
			System.out.println("春天");
			break;
		case 1:
			System.out.println("夏天");
			break;
		case 2:
			System.out.println("秋天");
			break;
		default:
			System.out.println("冬天");

		}

	}
}
