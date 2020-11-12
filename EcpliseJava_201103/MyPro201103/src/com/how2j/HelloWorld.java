package com.how2j;

//import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		// 如果只使用 if,会执行4次判断
		int i = 2;
		if (i == 1) {
			System.out.println(1);
		}
		if (i == 2) {
			System.out.println(2);
		}
		if (i == 3) {
			System.out.println(3);
		}
		if (i == 4) {
			System.out.println(4);
		}

		// 如果使用else if, 一旦在18行，判断成立， 20行和22行的判断就不会执行了，节约了运算资源

		if (i == 1) {
			System.out.println(1);
		} else if (i == 2) {
			System.out.println(2);
		} else if (i == 3)
			System.out.println(3);
		else if (i == 4)
			System.out.println(4);

	}
}

//-------------------------------------------
//System.out.println("今天周几：");
//Scanner c = new Scanner(System.in);
//int i=c.nextInt();
////String week=(i<5||i==5)?"workday":"workend";
////System.out.println(week);
//System.out.println((i<5||i==5)?"workday":"workend");
//
//c.close();
//int i = 1;
//boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);
//System.out.println(b);
//System.out.println(i);
//-------------------------------------------
//		System.out.println("请输入一个整数：");
//	Scanner c = new Scanner(System.in);
//		int a=c.nextInt();
//		System.out.println("第一个："+a);
//		int b =c.nextInt();
//		System.out.println("第二个："+b);
//		int sum=a+b;
//		System.out.println("和："+ sum);
//		c.close();
//	
//	}
//}

//import java.util.Scanner;
//
//public class HelloWorld {
//    public static void main(String[] args) {
//    	System.out.println("请输入一个整数：");
//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        System.out.println("第一个整数："+a);
//        int b = s.nextInt();
//        System.out.println("第二个整数："+b);
//        s.close();
//    }
//}