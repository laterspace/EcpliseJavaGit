package how2j.mathAndstring;

import java.util.Scanner;

public class TestNumberPractice {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
        System.out.println("����������� ");
        String diming = sc.next();
        System.out.println("�����빫˾���ƣ�");
        String gongshi = sc.next();
        System.out.println("�������ϰ����ƣ�");
        String laoban = sc.next();
          
        System.out.println("������� ");
        double jine = sc.nextDouble();
        System.out.println("�������Ʒ�� ");
        String canpin = sc.next();
        System.out.println("������۸������λ�� ");
        String danwei = sc.next();
        String format = "%s���%s�����ˣ����˵��ϰ�%s�Ժ��ζģ�Ƿ����%.1f���ڣ���������С�������ˣ�����û�취������%s�ֹ��ʣ�ԭ�۶���һ%s�ࡢ��%s�ࡢ��%s���%s,����ȫ��ֻ����ʮ�飬ͳͳ��ʮ�飡%s���˵����㲻����!����������������˴���꣬�㲻�����ʣ��㻹��Ѫ��Ǯ������Ѫ��Ǯ!";
        System.out.printf(format, diming,gongshi,laoban,jine,canpin,danwei,danwei,danwei,canpin,laoban);
        sc.close();//�����Ҫ����
		
		
		
		
		
		
		
		
		
//		// byte
//		byte b = 1;
//		Byte by = b;// װ��
//		byte b2 = by;// ����
//		System.out.println("byte");
//		System.out.println("��װ����:" + by + "\t" + "��������:" + b2);
//
//		// short
//		short s = 2;
//		Short sh = s;
//		short s2 = sh;
//		System.out.println("short");
//		System.out.println("��װ����:" + sh + "\t" + "��������:" + s2);
//
//		// float
//		float f = 3;
//		Float fl = f;
//		float f2 = fl;
//		System.out.println("float");
//		System.out.println("��װ����:" + fl + "\t" + "��������:" + f2);
//
//		// double
//		double d = 4;
//		Double dox = d;
//		double d2 = dox;
//		System.out.println("double");
//		System.out.println("��װ����:" + dox + "\t" + "��������:" + d2);
//		System.out.println("�ڶ���================================");
//		System.out.println("byte��Integer֮���ܷ�����Զ�������Զ�װ��?");
//
//		// �Զ�װ�����
////		byte bb = 5;
//		//Byte��Integer���߶���Number������,,so���߲��������߼��װ��?
////		Integer inx = (Byte) bb; // ʧ��
//
//		
//		int ii = 6;
//		Byte byx = (byte) ii;
//		System.out.println(byx);
//
//		// �Զ��������
////		Integer ii2 = new Integer(0);
////		byte bxx = ii2;	//ʧ��
//
//		Byte bxxx = new Byte((byte) 2);
//		int xx = bxxx;
//		System.out.println(xx);
//		System.out.println("������================================");
//
//		System.out.println(Byte.MAX_VALUE);
	}
}
