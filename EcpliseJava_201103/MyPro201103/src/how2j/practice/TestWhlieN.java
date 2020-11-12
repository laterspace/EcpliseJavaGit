package how2j.practice;

import java.util.Scanner;

public class TestWhlieN {
	public static void main(String[] args) {
		System.out.println("请输入一个整数:");
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
		System.out.println("该数的阶乘为：" + b);
//		 System.out.println("该数的阶乘为："+x);
	}
}
