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
        Man2[] Man2s;  //声明引用类型数组； 
        Man2s = new Man2[10];  //给引用类型数组分配空间；
         
        Man2 m1 = new Man2(1,11);
        Man2 m2 = new Man2(2,22);  
         
        Man2s[0]=m1;//给引用类型数组元素赋值；
        Man2s[1]=m2;//给引用类型数组元素赋值；
        for(int i=0;i<Man2s.length;i++) {
        	System.out.println(Man2s[i].getAge());
        }
    }
}