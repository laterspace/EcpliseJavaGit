package how2j.practice;

import java.util.Scanner;

public class TestWhlieN {
	public static void main(String[] args) {
		System.out.println("������һ������:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		s.close();
		int b = 1;
//		 int x =1;
		while (a > 0) {
			b *= a;
			a -= 1;

//            x+=1;
		}
		System.out.println("�����Ľ׳�Ϊ��" + b);
//		 System.out.println("�����Ľ׳�Ϊ��"+x);
	}
}
