package com.cjf.array;
import java.util.*;

public class Arraytest {
public static void selectsort(int []arr){
for(int x=0;x<arr.length;x++){
for(int y=x+1;y<arr.length;y++){
if (arr[x]>arr[y]){
int temp=arr[x];
arr[x]=arr[y];
arr[y]=temp;
}
}
}
}

//�γ̽��⣺ð������
public static void bubbleSort(int[] arr){
for(int x=0;x<arr.length-1;x++){
for(int y=0;y<arr.length-x-1;y++){
if(arr[y]>arr[y+1]){
int temp=arr[y];
arr[y]=arr[y+1];
arr[y+1]=temp;
}
}
}
}

public static void main(String[] args){
int [] arr={4,6,8,2,79,123,75,9};
//����ǰ
// ranksort(arr);
//����
// bubbleSort(arr);
Arrays.sort(arr);
//�����
ranksort(arr);
}
public static void ranksort(int [] arr){
System.out.print("[");
for (int x=0;x<arr.length;x++){
if(x!=arr.length-1)
System.out.print(arr[x]+",");
else
System.out.println(arr[x]+"]");
}
}
}