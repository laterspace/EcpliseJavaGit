package com.cjf.array;

import java.util.Arrays;
/**
 *
 * @author Administrator
 * @date 2020-8-26
 * @version
 */
public class test {
    public static void main(String[] args) {
        Man2[] msMan2s = { new Man2(3, "a"), new Man2(60, "b"), new Man2(2, "c") };
        Arrays.sort(msMan2s);
        System.out.println(Arrays.toString(msMan2s));
    }
}
 
class Man2 implements Comparable {
    int age;
    int id;
    String name;
 
    public Man2(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
 
    public String toString() {
        return this.name;
    }
 
    public int compareTo(Object o) {
        Man2 Man2 = (Man2) o;
        if (this.age < Man2.age) {
            return -1;
        }
        if (this.age > Man2.age) {
            return 1;
        }
        return 0;
    }
}