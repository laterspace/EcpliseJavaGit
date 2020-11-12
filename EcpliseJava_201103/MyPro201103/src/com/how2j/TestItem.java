package com.how2j;

public class TestItem {
	
	private static String getType(Object a) {
        return a.getClass().toString();
 
    }
	String name;
	int price;
	
	
	int i = 1; //属性名是i
    public void method1(int i){ //参数也是i
        System.out.println(i);
    }
     
    public static void main(String[] args) {
        new TestItem().method1(5);
        //结果打印出来是 1还是5?
    }

//	public static void main(String[] args) {
//		TestItem one=new TestItem();
//		one.name="血瓶";
//		one.price=50;
//		
//		TestItem one0=new TestItem();
//		one0.name="草鞋";
//		one0.price=300;
//		
//		TestItem one1=new TestItem();
//		one1.name="长剑";
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
