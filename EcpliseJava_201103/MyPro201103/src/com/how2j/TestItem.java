package com.how2j;

public class TestItem {
	
	private static String getType(Object a) {
        return a.getClass().toString();
 
    }
	String name;
	int price;
	
	
	int i = 1; //��������i
    public void method1(int i){ //����Ҳ��i
        System.out.println(i);
    }
     
    public static void main(String[] args) {
        new TestItem().method1(5);
        //�����ӡ������ 1����5?
    }

//	public static void main(String[] args) {
//		TestItem one=new TestItem();
//		one.name="Ѫƿ";
//		one.price=50;
//		
//		TestItem one0=new TestItem();
//		one0.name="��Ь";
//		one0.price=300;
//		
//		TestItem one1=new TestItem();
//		one1.name="����";
//		one1.price=350;
//		
//		short a = 1;
//		short b = 2;
//		System.out.println(a+b);
//		System.out.println(getType(a+b));
//		
//		
//	}
}
