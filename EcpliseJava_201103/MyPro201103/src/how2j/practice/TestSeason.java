package how2j.practice;

import java.util.Scanner;

public class TestSeason {
	public static void main(String[] args) {
		System.out.println("�������·�:");
		Scanner s = new Scanner(System.in);
		int mouth = s.nextInt();
		s.close();
		
		switch ((mouth-1) / 3) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("����");
			break;
		default:
			System.out.println("����");

		}

	}
}
