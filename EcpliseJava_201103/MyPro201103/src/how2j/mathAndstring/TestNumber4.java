package how2j.mathAndstring;

import java.awt.image.TileObserver;
import java.util.Locale;
import java.util.Scanner;

public class TestNumber4 {
	public static void main(String[] args) {
		
		
		
		
		System.out.println("��ϰ");
		Scanner sc = new Scanner(System.in);
		System.out.println("����:");
		String s1=sc.nextLine();
		
		System.out.println("��˾����:");
		String s2=sc.nextLine();
		
		System.out.println("��˾����:");
		String s3=sc.nextLine();
		
		System.out.println("�ϰ�����:");
		String s4=sc.nextLine();
		
		System.out.println("���:");
		String s5=sc.nextLine();
		System.out.println("��Ʒ:");
		String s6=sc.nextLine();
		
		System.out.println("�۸������λ:");
		String s7=sc.nextLine();
		sc.close();
		
		String sentence="%s���%s%s�����ˣ����˵��ϰ�%s�Ժ��ζģ�Ƿ����%s���ڣ���������С��������!����û�а취������%s�ֹ���!ԭ�۶���һ%s�ࡢ��%s�ࡢ��%s���%s������ȫ��ֻ����ʮ�飬ͳͳֻҪ��ʮ��!%s���˵����㲻����!����������������˴���꣬�㲻�����ʣ��㻹��Ѫ��Ǯ������Ѫ��Ǯ! ";
		
		System.out.format(sentence,s1,s2,s3,s4,s5,s6,s7,s7,s7,s6,s4);
		
		
		
//		String name = "����";
//		int kill = 8;
//		String title = "����";
//
//		// ++
//		String sentence = name + "�ڽ���������" + kill + "�λ�ɱ��,�����" + title + "�ĳƺ�";
//
//		System.out.println(sentence);
//
//		String sentenceFormat = "%s�ڽ���������%d�λ�ɱ��.�����%s�ĳƺ�%n";
//		System.out.printf(sentenceFormat, name, kill, title);
//		System.out.format(sentenceFormat, name, kill, title);
//
//		System.out.printf("���ǻ��з�%n");
//		System.out.printf("���ǻ��з�%n");
//		System.out.printf("���ǻ��з�%n");
//
//		// ��ӡ����
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
