package how2j.mathAndstring;

import java.util.Scanner;

public class TestNumberPractice {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
        System.out.println("请输入地名： ");
        String diming = sc.next();
        System.out.println("请输入公司名称：");
        String gongshi = sc.next();
        System.out.println("请输入老板名称：");
        String laoban = sc.next();
          
        System.out.println("请输入金额： ");
        double jine = sc.nextDouble();
        System.out.println("请输入产品： ");
        String canpin = sc.next();
        System.out.println("请输入价格计量单位： ");
        String danwei = sc.next();
        String format = "%s最大%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%.1f个亿，带着他的小姨子跑了！我们没办法，拿着%s抵工资！原价都是一%s多、二%s多、三%s多的%s,现在全部只卖二十块，统统二十块！%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!";
        System.out.printf(format, diming,gongshi,laoban,jine,canpin,danwei,danwei,danwei,canpin,laoban);
        sc.close();//结果需要关流
		
		
		
		
		
		
		
		
		
//		// byte
//		byte b = 1;
//		Byte by = b;// 装箱
//		byte b2 = by;// 拆箱
//		System.out.println("byte");
//		System.out.println("封装类型:" + by + "\t" + "基本类型:" + b2);
//
//		// short
//		short s = 2;
//		Short sh = s;
//		short s2 = sh;
//		System.out.println("short");
//		System.out.println("封装类型:" + sh + "\t" + "基本类型:" + s2);
//
//		// float
//		float f = 3;
//		Float fl = f;
//		float f2 = fl;
//		System.out.println("float");
//		System.out.println("封装类型:" + fl + "\t" + "基本类型:" + f2);
//
//		// double
//		double d = 4;
//		Double dox = d;
//		double d2 = dox;
//		System.out.println("double");
//		System.out.println("封装类型:" + dox + "\t" + "基本类型:" + d2);
//		System.out.println("第二题================================");
//		System.out.println("byte和Integer之间能否进行自动拆箱和自动装箱?");
//
//		// 自动装箱测试
////		byte bb = 5;
//		//Byte与Integer两者都是Number的子类,,so两者不存在两者间的装换?
////		Integer inx = (Byte) bb; // 失败
//
//		
//		int ii = 6;
//		Byte byx = (byte) ii;
//		System.out.println(byx);
//
//		// 自动拆箱测试
////		Integer ii2 = new Integer(0);
////		byte bxx = ii2;	//失败
//
//		Byte bxxx = new Byte((byte) 2);
//		int xx = bxxx;
//		System.out.println(xx);
//		System.out.println("第三题================================");
//
//		System.out.println(Byte.MAX_VALUE);
	}
}
