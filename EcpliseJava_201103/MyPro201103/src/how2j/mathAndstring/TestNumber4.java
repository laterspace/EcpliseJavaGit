package how2j.mathAndstring;

import java.awt.image.TileObserver;
import java.util.Locale;
import java.util.Scanner;

public class TestNumber4 {
	public static void main(String[] args) {
		
		
		
		
		System.out.println("练习");
		Scanner sc = new Scanner(System.in);
		System.out.println("地名:");
		String s1=sc.nextLine();
		
		System.out.println("公司类型:");
		String s2=sc.nextLine();
		
		System.out.println("公司名称:");
		String s3=sc.nextLine();
		
		System.out.println("老板名字:");
		String s4=sc.nextLine();
		
		System.out.println("金额:");
		String s5=sc.nextLine();
		System.out.println("产品:");
		String s6=sc.nextLine();
		
		System.out.println("价格计量单位:");
		String s7=sc.nextLine();
		sc.close();
		
		String sentence="%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%s个亿，带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一%s多、两%s多、三%s多的%s，现在全部只卖二十块，统统只要二十块!%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱! ";
		
		System.out.format(sentence,s1,s2,s3,s4,s5,s6,s7,s7,s7,s6,s4);
		
		
		
//		String name = "盖伦";
//		int kill = 8;
//		String title = "超神";
//
//		// ++
//		String sentence = name + "在进行了连续" + kill + "次击杀后,获得了" + title + "的称号";
//
//		System.out.println(sentence);
//
//		String sentenceFormat = "%s在进行了连续%d次击杀后.获得了%s的称号%n";
//		System.out.printf(sentenceFormat, name, kill, title);
//		System.out.format(sentenceFormat, name, kill, title);
//
//		System.out.printf("这是换行符%n");
//		System.out.printf("这是换行符%n");
//		System.out.printf("这是换行符%n");
//
//		// 打印数字
//		int year = 2020;
//		System.out.format("%d%n", year);
//		System.out.format("%8d%n", year);
//		System.out.format("%-8d%n", year);
//
//		System.out.format("%08d%n", year);
//		System.out.format("%,8d%n", year);
//		System.out.format("%.2f%n", Math.PI);
//		System.out.format(Locale.FRANCE, "%,.2f%n", Math.PI * 10000);
//		System.out.format(Locale.US, "%,.2f%n", Math.PI * 10000);
//		System.out.format(Locale.UK, "%,.2f%n", Math.PI * 10000);
	}
}
