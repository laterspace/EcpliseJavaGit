package com.cjf.array;
import java.util.Arrays;
import java.lang.Comparable;
public class TestArray6 {
	public static void main(String[] args) {
		
		Man21[] msMan2s = { new Man21(3, "a"), new Man21(60, "b"), new Man21(2, "c") };
		Arrays.sort(msMan2s);
		System.out.println(Arrays.toString(msMan2s));
	}
}

class Man21 implements Comparable{
	int age;
	int id;
	String name;
	
	public Man21(int age,String name) {
		super();
		this.age=age;
		this.name=name;
		
	}
	
	public String toString() {
		return this.name;
	}
	
	public int compareTo(Object o) {
		Man21 Man2=(Man21) o;
		if(this.age<Man2.age) {
			return -1;
		}
		if(this.age>Man2.age) {
			return 1;
		}
		return 0;	
		
	}
}