package com.cjf.array;


class Man2{
    private int age;
    private int id;
    public Man2(int id,int age) {
        super();
        this.age = age;
        this.id = id;
    }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
    
    
}
public class TestArray {
    public static void main(String[] args) {
        Man2[] Man2s;  //���������������飻 
        Man2s = new Man2[10];  //�����������������ռ䣻
         
        Man2 m1 = new Man2(1,11);
        Man2 m2 = new Man2(2,22);  
         
        Man2s[0]=m1;//��������������Ԫ�ظ�ֵ��
        Man2s[1]=m2;//��������������Ԫ�ظ�ֵ��
        for(int i=0;i<Man2s.length;i++) {
        	System.out.println(Man2s[i].getAge());
        }
    }
}