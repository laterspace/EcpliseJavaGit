package com.how2j;

//import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		// ���ֻʹ�� if,��ִ��4���ж�
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

		// ���ʹ��else if, һ����18�У��жϳ����� 20�к�22�е��жϾͲ���ִ���ˣ���Լ��������Դ

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
//System.out.println("�����ܼ���");
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
//		System.out.println("������һ��������");
//	Scanner c = new Scanner(System.in);
//		int a=c.nextInt();
//		System.out.println("��һ����"+a);
//		int b =c.nextInt();
//		System.out.println("�ڶ�����"+b);
//		int sum=a+b;
//		System.out.println("�ͣ�"+ sum);
//		c.close();
//	
//	}
//}

//import java.util.Scanner;
//
//public class HelloWorld {
//    public static void main(String[] args) {
//    	System.out.println("������һ��������");
//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        System.out.println("��һ��������"+a);
//        int b = s.nextInt();
//        System.out.println("�ڶ���������"+b);
//        s.close();
//    }
//}